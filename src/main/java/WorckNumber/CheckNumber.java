package WorckNumber;




public class CheckNumber {
    public static boolean checkNumber(String number){

        if(OperationNumber.clearNumber(number)==null) return false;

        if (number == null || number.isEmpty() ) return false;
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) return false;
        }


        return true;
    }

}
