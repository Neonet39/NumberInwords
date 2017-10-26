package Configuration.WorkExel;

import Modal.DataModal;
import Modal.TestModal;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evgeny on 26.10.2017.
 */
public class DataDrive extends ExelWork<TestModal> {

    public DataDrive(String patch) throws IOException {
        super(patch);
    }

    @Override
    public List<TestModal> readConfig(String sheet) throws IOException {
        XSSFSheet excelSheet = excelBook.getSheet(sheet);
        TestModal testModal = null;
        List massObject = new ArrayList<TestModal>();


        for(Row row:excelSheet){
            for (Cell cell:row){
                if(cell.getColumnIndex()==0){
                    testModal = new TestModal();
                    testModal.setNumber((String) getValue(cell));
                } else testModal.setWordNumber((String) getValue(cell));
                massObject.add(testModal);
            }

        }

        this.closeFile();
        return massObject;

    }



}
