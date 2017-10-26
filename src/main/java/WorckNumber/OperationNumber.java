package WorckNumber;


public class OperationNumber {

    public static Integer getStep(String number){

        if (number!=null&&!number.equals("null")){
            if (number.length()<4){
                return 0;
            }

            int remainderDivision = number.length()%3;
                if (remainderDivision==0)
                    remainderDivision = 3;

            return number.length()-remainderDivision;
        }
        else
        return null;
    }

    public static Integer getMainPartNumber(String number){
        if (number!=null&&number.length()>3){
           return number.length()%3;

        }else return null;

    }

    public static String clearNumber(String number){
        String resultNumber = "";

        if (number.length()>0&&number!=null){
            for (int index=0;index<number.length();index++){
                if (!String.valueOf(number.toCharArray()[index]).equals("0") ) {
                    resultNumber = number.substring(index,number.length());
                    break;
                }
            }
            if (!resultNumber.equals("")){
                return resultNumber;

            } else return null;

        } else return null;
    }

    public static int ConvetToInt(char symbol){
        return Integer.valueOf(String.valueOf(symbol));
    }

    public static String cutNumber(String number){

        if(number.length()>3&&!number.equals("null")&&number!=null) {

            int mainPartNumber = getMainPartNumber(number);

            if (mainPartNumber == 0) mainPartNumber = 3;
            return number.substring(mainPartNumber, number.length());
        }else  return null;
    }

    public static String clearResult(String number){
        String newResult="";

        int sum = 0;
        for (int i=0;i<number.length();i++){
            if (!String.valueOf(number.toCharArray()[i]).equals(" "))
                sum = 0;

            if(String.valueOf(number.toCharArray()[i]).equals(" ")){
                sum++;
            }
            if (sum<2){
                newResult+=String.valueOf(number.toCharArray()[i]);
            }
        }
        return newResult;
    }

}
