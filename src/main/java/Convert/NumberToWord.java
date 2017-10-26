package Convert;



import WorckNumber.CheckNumber;
import WorckNumber.DeclinationOfNumbers.NumOverAThousand;
import WorckNumber.DeclinationOfNumbers.NumThousands;
import WorckNumber.DeclinationOfNumbers.NumToHundred;
import WorckNumber.OperationNumber;


public class NumberToWord {


    public static String numberToWord(String number){
        boolean result = CheckNumber.checkNumber(number);
        if (result==true)
        return convertNumbers(number);
       return null;
    }




    private static String convertNumbers(String number) {

        String wordResult="";
        int step;
        String result;

        while(true) {

            step = OperationNumber.getStep(number);

            if (step > 3) {
                result = (NumOverAThousand.getWordNumber(number));
                if (result==null) return null;
                wordResult += " " + result;
            }

            if (step == 0) {
                result = (NumToHundred.getWordNumber(number));
                if (result == null) return null;
                wordResult += " " + result;
            }

            if (step == 3) {
                result = NumThousands.getWordNumber(number);
                if (result == null) return null;
                wordResult+=" "+result;
            }
            if (step == 0) break;



            number = OperationNumber.cutNumber(number);

            number = OperationNumber.clearNumber(number);
            if (number==null) break;

            step = OperationNumber.getStep(number);


        }
        return OperationNumber.clearResult(wordResult).trim();


    }




}
