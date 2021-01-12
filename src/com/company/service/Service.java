package com.company.service;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;

import java.io.*;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class Service {
    public void xyz() throws IOException {

        //obtaining input bytes from a file

        FileInputStream fis = new FileInputStream(new File("Demo\\Demo.xls"));
        System.out.println(fis.getFD());
        HSSFWorkbook wb = new HSSFWorkbook(fis);

        HSSFSheet sheet = wb.getSheetAt(0);

        FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();




        for (Row row : sheet)     //iteration over row using for each loop
        {
            for (Cell cell : row)    //iteration over cell using for each loop
            {
                switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:   //field that represents numeric cell type
//getting the value of the cell as a number
                        System.out.print(cell.getNumericCellValue() + "\t\t");
                        break;
                    case Cell.CELL_TYPE_STRING:    //field that represents string cell type
//getting the value of the cell as a string
                        System.out.print(cell.getStringCellValue() + "\t\t");
                        break;
                }
            }
            System.out.println();
        }
    }
}
