package org.example.utility.excelReader;

public class ExcelMainClass {
    public static void main(String[] args){
        String filePath = "src/main/resources/UserData.xlsx"; //Provide path for file to read Excel document
        ReadUsers readExcel = new ReadUsers(); // Creating an object instance of the class with the read logic

        readExcel.usingExistingWorkbook(filePath); //A method that collects the file path as an argument
        readExcel.readFullExcelFile(0); //A method that collects the sheet number as an argument
    }
}
