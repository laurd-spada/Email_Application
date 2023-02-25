package org.example.utility.excelReader;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.entity.NewHire;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadUsers {
    List<NewHire> test = new ArrayList<>();
    private FileInputStream file;
    private XSSFWorkbook workbook;
    private XSSFSheet sheet;
    private String xcelFilePath;
    public ReadUsers(){}
    public ReadUsers usingExistingWorkbook(String filepath){
        try {
            this.xcelFilePath = filepath;
            file = new FileInputStream(filepath);
            workbook = new XSSFWorkbook(file);

        } catch (Exception e){
            e.printStackTrace();
        }
        return this;
    }
    public void readFullExcelFile(int sheetNumber){
        try {
            sheet = workbook.getSheetAt(sheetNumber);
            int row = sheet.getLastRowNum();
            for (int i = 1; i < row; i++){
                int id = (int)sheet.getRow(i).getCell(0).getNumericCellValue();
                String firstname = sheet.getRow(i).getCell(1).getStringCellValue();
                String lastname = sheet.getRow(i).getCell(2).getStringCellValue();
                int age = (int)sheet.getRow(i).getCell(3).getNumericCellValue();
                String pWord = sheet.getRow(i).getCell(4).getStringCellValue();
                String email = sheet.getRow(i).getCell(5).getStringCellValue();
                String altEmail = sheet.getRow(i).getCell(6).getStringCellValue();
                int mailSize = (int)sheet.getRow(i).getCell(7).getNumericCellValue();

                test.add(new NewHire(id, firstname,lastname, age, pWord, email, altEmail, mailSize));
            }
            file.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
