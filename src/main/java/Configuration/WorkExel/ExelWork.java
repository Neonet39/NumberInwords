package Configuration.WorkExel;





import Modal.DataModal;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class ExelWork<T> {

    public ExelWork(){

    }
    public ExelWork(String patch) throws IOException {
        openFile(patch);
    }
    protected XSSFWorkbook excelBook;

    protected void openFile(String patch) throws IOException {

        excelBook = new XSSFWorkbook(new FileInputStream(patch));

    }
    protected abstract List<T> readConfig(String sheet) throws IOException;

    public void closeFile() throws IOException {
        excelBook.close();
    }

    protected static Object getValue (Cell cell){
        Object result = null;

        switch (cell.getCellType()){
            case Cell.CELL_TYPE_STRING :
                result = cell.getRichStringCellValue().toString();
                break;
            case  Cell.CELL_TYPE_NUMERIC:
                result = cell.getNumericCellValue();
                break;
        }
        
        return result;
    }


}
