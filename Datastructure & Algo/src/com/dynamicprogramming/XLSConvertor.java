package com.dynamicprogramming;


//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;

public class XLSConvertor {

    public static void main(String args[]) throws IOException
    {
        ArrayList arList=null;
        ArrayList al=null;
        String fName = "Input_file.csv";
        String thisLine;
        int count=0;
        System.out.println(new File(fName).getAbsolutePath());
        System.out.println(new File(fName).exists());
        FileInputStream fis = new FileInputStream(new File(fName));
        DataInputStream myInput = new DataInputStream(fis);
        int i=0;
        arList = new ArrayList();
        while ((thisLine = myInput.readLine()) != null)
        {
            al = new ArrayList();
            String strar[] = thisLine.split(",");
            for(int j=0;j<strar.length;j++)
            {
                al.add(strar[j]);
            }
            arList.add(al);
            System.out.println();
            i++;
        }

        try
        {

            XSSFWorkbook hwb = new XSSFWorkbook();
            Sheet sheet = hwb.createSheet("new sheet");
            for(int k=0;k<arList.size();k++)
            {
                ArrayList ardata = (ArrayList)arList.get(k);
                Row row = sheet.createRow((short) 0+k);
                for(int p=0;p<ardata.size();p++)
                {
                    Cell cell = row.createCell((short) p);
                    String data = ardata.get(p).toString();
                    if(data.startsWith("=")){
                        cell.setCellType(CellType.STRING);
                        data=data.replaceAll("\"", "");
                        data=data.replaceAll("=", "");
                        cell.setCellValue(data);
                    }else if(data.startsWith("\"")){
                        data=data.replaceAll("\"", "");
                        cell.setCellType(CellType.STRING);
                        cell.setCellValue(data);
                    }else{
                        data=data.replaceAll("\"", "");
                        cell.setCellType(CellType.NUMERIC);
                        cell.setCellValue(data);
                    }
                    //*/
                    // cell.setCellValue(ardata.get(p).toString());
                }
                System.out.println();
            }
            FileOutputStream fileOut = new FileOutputStream("test.xls");
            hwb.write(fileOut);
            fileOut.close();
            System.out.println("Your excel file has been generated");
        } catch ( Exception ex ) {
            ex.printStackTrace();
        } //main method ends
    }
}
