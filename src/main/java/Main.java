
import Configuration.WorkExel.DataDrive;
import Convert.NumberToWord;
import Modal.TestModal;
import WorckNumber.CheckNumber;
import WorckNumber.DeclinationOfNumbers.NumOverAThousand;
import WorckNumber.DeclinationOfNumbers.NumThousands;
import WorckNumber.DeclinationOfNumbers.NumToHundred;
import WorckNumber.OperationNumber;


import java.io.IOException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

       // List<TestModal> testModals = new DataDrive("C:\\Users\\Evgeny\\Desktop\\testTaskk\\TestDrive.xlsx").readConfig("TestDrive");


      //  System.out.print(CheckNumber.checkNumber("3."));
        System.out.print(CheckNumber.checkNumber("00000000000000"));

    }
}
