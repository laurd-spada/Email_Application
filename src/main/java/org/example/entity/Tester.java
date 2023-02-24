package org.example.entity;

public class Tester {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String pWord;
    private String email;
    private String altEmail;
    private int[] mailCapacity;
    private int mailSize;
    public Tester(){}

    public Tester(int id, String firstName, String lastName, int age, String pWord, String email, String altEmail,int mailSize) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pWord = pWord;
        this.email = email;
        this.altEmail = altEmail;
        this.mailCapacity = new int[mailSize];
    }
}
