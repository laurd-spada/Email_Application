package org.example.utility.csvReader;

import org.example.services.UserInterfaceImp;

public class CsvReaderMainClass {
    public static void main(String[] args) {
        WriteBackToCsv writeBackToCsv = new WriteBackToCsv();
        CsvReadData csvReadData = new CsvReadData();
        csvReadData.readCsv();
        UserInterfaceImp userInterfaceImp = new UserInterfaceImp();
        userInterfaceImp.createEmail();
        userInterfaceImp.allocatePassword();
        userInterfaceImp.setAllMailBoxSize(3);
        userInterfaceImp.setSingleMailBoxSize(2,7);

        writeBackToCsv.writeBack();

        csvReadData.showNewHireList();

    }
}
