package WorckNumber.DeclinationOfNumbers;


import WorckNumber.OperationNumber;

public class NumThousands extends DeclinationNumbers {

    public static String getWordNumber(String number) {

        Integer mainPartNumer = OperationNumber.getMainPartNumber(number);
        char[] masNum = number.toCharArray();

        if (mainPartNumer != null) {
            switch (mainPartNumer) {
                case 0: {
                    if (OperationNumber.ConvetToInt(masNum[2]) == 1 && OperationNumber.ConvetToInt(masNum[1]) != 1) {
                        return NumToHundred.getWordNumber(number.substring(0, 2) + "0") + " " + "одна тысяча";
                    }

                    if (OperationNumber.ConvetToInt(masNum[2]) == 2 && OperationNumber.ConvetToInt(masNum[1]) != 1) {

                        return NumToHundred.getWordNumber(number.substring(0, 2) + "0") + " " + "две тысячи";
                    }

                    if (OperationNumber.ConvetToInt(masNum[2]) >= 3 && OperationNumber.ConvetToInt(masNum[2]) <= 4 && OperationNumber.ConvetToInt(masNum[1]) != 1) {
                        return NumToHundred.getWordNumber(number.substring(0, 3)) + " " + "тысячи";
                    } else return NumToHundred.getWordNumber(number.substring(0, 3)) + " " + "тысяч";

                }

                case 1: {
                    if (OperationNumber.ConvetToInt(masNum[0]) == 1) {
                        return "одна тысяча";
                    }

                    if (OperationNumber.ConvetToInt(masNum[0]) == 2) {
                        return "две тысячи";
                    }

                    if (OperationNumber.ConvetToInt(masNum[0]) >= 3 && OperationNumber.ConvetToInt(masNum[0]) <= 4) {
                        return NumToHundred.getWordNumber(number.substring(0, 1)) + " " + "тысячи";
                    } else return NumToHundred.getWordNumber(number.substring(0, 1)) + " " + "тысяч";

                }

                case 2: {
                    if (OperationNumber.ConvetToInt(masNum[1]) == 1 && OperationNumber.ConvetToInt(masNum[0]) != 1) {
                        String newNumber = number.substring(0, 1);
                        return NumToHundred.getWordNumber(newNumber + "0") + " " + "одна тысяча";
                    }

                    if (OperationNumber.ConvetToInt(masNum[1]) == 2 && OperationNumber.ConvetToInt(masNum[0]) != 1) {
                        String newNumber = number.substring(0, 1);
                        return NumToHundred.getWordNumber(newNumber + "0") + " " + "две тысячи";
                    }
                    if (OperationNumber.ConvetToInt(masNum[1]) >= 3 && OperationNumber.ConvetToInt(masNum[1]) <= 4 && OperationNumber.ConvetToInt(masNum[0]) != 1) {
                        return NumToHundred.getWordNumber(number.substring(0, 2)) + " " + "тысячи";
                    } else return NumToHundred.getWordNumber(number.substring(0, 2)) + " " + "тысяч";
                }


            }
            return null;
        } else return null;
    }
}
