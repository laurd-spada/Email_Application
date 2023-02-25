package org.example.entity;

import java.util.Arrays;

public class NewHire {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String pWord;
    private String email;
    private String altEmail;
    private int[] mailCapacity;
    private int mailSize;
    public NewHire(){}

    public NewHire(int id, String firstName, String lastName, int age, String pWord, String email, String altEmail, int mailSize) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pWord = pWord;
        this.email = email;
        this.altEmail = altEmail;
        this.mailCapacity = new int[mailSize];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getpWord() {
        return pWord;
    }

    public void setpWord(String pWord) {
        this.pWord = pWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    public int getMailSize() {
        return mailSize;
    }

    public void setMailSize(int mailSize) {
        this.mailCapacity = new int[mailSize];
    }

    @Override
    public String toString() {
        return "NewHire{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pWord='" + pWord + '\'' +
                ", email='" + email + '\'' +
                ", altEmail='" + altEmail + '\'' +
                ", mailCapacity=" + Arrays.toString(mailCapacity) +
                '}';
    }
}
