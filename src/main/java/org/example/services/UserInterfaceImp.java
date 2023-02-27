package org.example.services;

import org.example.entity.NewHire;
import org.example.interfaces.UserInterface;
import org.example.utility.csvReader.CsvReadData;

public class UserInterfaceImp extends CsvReadData implements UserInterface{
    @Override
    public void createEmail() {
        for(NewHire i : getNewHireList()){
            i.setEmail(i.getFirstName()+"."+i.getLastName()+"@decagon.dev");
        }
    }
    @Override
    public String createPassword() {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        String number = "123456789";
        String total = alphabets + number;
        String[] splitCharacter = total.split("");
        String[] passWord = new String[5];
        for (int i = 0; i < 5; i++){
            passWord[i] = splitCharacter[(int)(Math.random() * splitCharacter.length)];
        }
        String result = String.join("",passWord);
        return result;
    }
    @Override
    public void allocatePassword(){
        for(NewHire i : getNewHireList()){
            String result = createPassword();
            i.setpWord(result);
        }
    }
    @Override
    public void setAllMailBoxSize(int size) {
        for(NewHire i : getNewHireList()){
            i.setMailSize(size);
        }
    }
    @Override
    public void setSingleMailBoxSize(int id, int size) {
        for(NewHire i : getNewHireList()){
            if(i.getId() == id){
                i.setMailSize(size);
            }
        }
    }
    @Override
    public void viewUser(int id) {
        for(NewHire i : getNewHireList()){
            if(i.getId() == id){
                System.out.println("------------------------------------");
                System.out.println("I.D : " + i.getId());
                System.out.println("Name : " + i.getFirstName() + " " + i.getLastName());
                System.out.println("Email : " + i.getEmail());
                System.out.println("Mailbox Capacity: " + i.getMailCapacity());
                System.out.println("------------------------------------");
            }
        }
    }
}
