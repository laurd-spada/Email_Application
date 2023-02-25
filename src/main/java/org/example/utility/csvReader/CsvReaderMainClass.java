package org.example.utility.csvReader;

import org.example.services.UserInterfaceImp;

public class CsvReaderMainClass {
    public static void main(String[] args) {
        WriteBackToCsv writeBackToCsv = new WriteBackToCsv();
        UserInterfaceImp userInterfaceImp = new UserInterfaceImp();
        CsvReadData csvReadData = new CsvReadData();

        csvReadData.readCsv();

        userInterfaceImp.createEmail();
        userInterfaceImp.allocatePassword();
        userInterfaceImp.setAllMailBoxSize(3);
        userInterfaceImp.setSingleMailBoxSize(2,7);
        userInterfaceImp.viewUser(2);

//        writeBackToCsv.writeBack();

//        csvReadData.showNewHireList();

    }
}
