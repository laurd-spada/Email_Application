package org.example.utility.csvReader;

import org.example.entity.NewHire;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReadData {
    private List<NewHire> newHireList = new ArrayList<>();
    public void readCsv() {
        String line = "";
        try {
            File file = new File("src/main/resources/UserDataCSV.csv");    //creates a new file instance
            FileReader fileReader = new FileReader(file);    //reads the file

            BufferedReader bufferedReader = new BufferedReader(fileReader); //creates a buffering character input stream
            bufferedReader.readLine(); // this will read the first line
            while ((line = bufferedReader.readLine()) != null){
                String[] data =line.split(",");
                NewHire newHire = createUser(data);
                System.out.println(newHire.toString());
                newHireList.add(newHire);
            }
            fileReader.close();  //closes the stream and release the resources
            bufferedReader.close();  //closes the stream and release the resources
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public NewHire createUser(String[] data){
        int id = Integer.parseInt(data[0]);
        String firstName = data[1];
        String lastName = data[2];
        int age = Integer.parseInt(data[3]);
        String passWord = data[4];
        String email = data[5];
        String altEmail = data[6];
        int mailSize = Integer.parseInt(data[7]);
        return new NewHire(id, firstName, lastName, age, passWord, email, altEmail, mailSize);
    }
}
