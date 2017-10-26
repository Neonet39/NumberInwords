package Configuration.WorkExel;



import Convert.NumberToWord;
import Modal.DataModal;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public  class  ConfigExel extends ExelWork<DataModal> {

    private List<DataModal> dataModals = null;

    protected List<DataModal> readConfig(String sheet) {
        XSSFSheet excelSheet = excelBook.getSheet(sheet);
        DataModal configModal = new DataModal();
        List configModalList = new ArrayList<DataModal>();

        for(Row row:excelSheet){
            for (Cell cell:row){

                Object result = getValue(cell);

                if(result instanceof String){
                    configModal.setWordNumber(result.toString());
                    configModalList.add(configModal);
                    configModal = new DataModal();

                } else configModal.setNumber(((Double) result).intValue());
            }
        }
        return configModalList;

    }


    public void start(String sheet) throws IOException {
        if (dataModals==null)
            this.openFile(new File("").getAbsolutePath()+"\\Config.xlsx");
            dataModals = this.readConfig(sheet);
            this.closeFile();

        }

    public Integer index(int number){
        for (int i=0;i<dataModals.size();i++){
            if (dataModals.get(i).getNumber()==number)
                return i;
        }
        return null;
    }

    public String wordByIndex(int index){

        return dataModals.get(index).getWordNumber();
    }

    public String wordByNumber(int number){
        Integer index = this.index(number);
        if (index!=null)
            return this.wordByIndex(index);
        else return null;

    }
}




