import org.example.utility.ReadUsers;

public class ExcelMainClass {
    public static void main(String[] args){
        String filePath = "src/main/resources/UserData.xlsx";
        ReadUsers readExcel = new ReadUsers();

        readExcel.usingExistingWorkbook(filePath);
        readExcel.readFullExcelFile(0);
    }
}
