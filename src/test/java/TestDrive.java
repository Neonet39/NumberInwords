import Configuration.WorkExel.DataDrive;

import Convert.NumberToWord;
import Modal.TestModal;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TestDrive {
    private List<TestModal> testData;

    @Before
    public  void getData() throws IOException {
        this.testData = new DataDrive(new File("").getAbsolutePath()+"\\TestDrive.xlsx").readConfig("TestDrive");
    }

    @Test
    public void test(){
        for (TestModal modal:testData){
            String number = modal.getNumber();
            String atalon = modal.getWordNumber();
            if (number==null) Assert.fail("В файле с данными ,программа наткнулась на пустое значение");
                String result = NumberToWord.numberToWord(number);
            if (result==null)   Assert.fail("'"+ number+"' В файле с данными программа наткрулась на число имеющаяя не верный формат");
                Assert.assertEquals(result, atalon);


        }
    }
}
