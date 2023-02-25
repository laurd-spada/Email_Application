package org.example.interfaces;

public interface UserInterface {
    public  void createEmail();
    public String createPassword();
    public void allocatePassword();
    public void setAllMailBoxSize(int size);
    public void setSingleMailBoxSize(int id, int size);
    public void viewUser(int id);
}
