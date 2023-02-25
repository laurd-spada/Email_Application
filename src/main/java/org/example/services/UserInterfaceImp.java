package org.example.services;

import org.example.entity.NewHire;
import org.example.interfaces.UserInterface;
import org.example.utility.csvReader.CsvReadData;

public class UserInterfaceImp implements UserInterface{
    CsvReadData csvReadData = new CsvReadData();
    @Override
    public void createEmail() {
        for(NewHire i : csvReadData.getNewHireList()){
            i.setEmail(i.getFirstName()+"."+i.getLastName()+"@decagon.dev");
        }
    }

    @Override
    public String createPassword() {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String number = "123456789";
        String total = alphabets + number;
        String[] split = total.split("");
        String[] passWord = new String[5];
        for (int i = 0; i < 5; i++){
            passWord[i] = split[(int)(Math.random() * split.length)];
        }
        String result = String.join("",passWord);
        return result;
    }
    @Override
    public void allocatePassword(){
        for(NewHire i : csvReadData.getNewHireList()){
            String result = createPassword();
            i.setpWord(result);
        }
    }

    @Override
    public void setAllMailBoxSize(int size) {
        for(NewHire i : csvReadData.getNewHireList()){
            i.setMailSize(size);
        }
    }

    @Override
    public void setSingleMailBoxSize(int id, int size) {
        for(NewHire i : csvReadData.getNewHireList()){
            if(i.getId() == id){
                i.setMailSize(size);
            }
        }
    }

    @Override
    public void viewUser(int id) {

    }
    @Override
    public void test(){
        System.out.println("Hello");
    }
}
