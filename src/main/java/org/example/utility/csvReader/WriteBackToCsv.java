package org.example.utility.csvReader;

import org.example.entity.NewHire;

import java.io.*;

public class WriteBackToCsv {
    CsvReadData csvReadData = new CsvReadData();
    public void writeBack(){
        String data = "Hello this is the first line output";
        try{
            File file = new File("src/main/resources/UserDataCSV - Copy.csv");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Id, Firstname, Lastname, Age, Password, Email, alt-Password, MailboxSize \n");
            for(NewHire i : csvReadData.getNewHireList()){
                bufferedWriter.write(i + "\n");
                System.out.println("returned succesful");
            }
            bufferedWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
