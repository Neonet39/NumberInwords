package WorckNumber.DeclinationOfNumbers;

import WorckNumber.OperationNumber;

/**
 * Created by Evgeny on 26.10.2017.
 */
public class NumOverAThousand extends DeclinationNumbers {

    public static String getWordNumber(String number){
        Integer step = OperationNumber.getStep(number);
        char[] numMas = number.toCharArray();
        Integer mainPartNumer = OperationNumber.getMainPartNumber(number);
        String nameNumber = UserConfig.wordByNumber(step);

        if (nameNumber==null) return null;

        if(step>5&&step!=null) {
            switch (mainPartNumer) {

                case 0: {
                    if (OperationNumber.ConvetToInt(numMas[2]) == 1)
                        return NumToHundred.getWordNumber(number.substring(1, 3)) + " " + nameNumber;

                    if (OperationNumber.ConvetToInt(numMas[2]) >= 2 && OperationNumber.ConvetToInt(numMas[2]) <= 4 && OperationNumber.ConvetToInt(numMas[1]) != 1) {

                        return NumToHundred.getWordNumber(number.substring(0, 3)) + " " + nameNumber + "а";
                    } else return NumToHundred.getWordNumber(number.substring(0, 3)) + " " +nameNumber+"ов";

                }

                case 1: {
                    if (OperationNumber.ConvetToInt(numMas[0]) == 1) {
                        return "один " + nameNumber;

                    }

                    if (OperationNumber.ConvetToInt(numMas[0]) >= 2 && OperationNumber.ConvetToInt(numMas[0]) <= 4) {
                        return NumToHundred.getWordNumber(number.substring(0, 1)) + " " + nameNumber + "а";
                    } else return NumToHundred.getWordNumber(number.substring(0, 1)) + " " + nameNumber + "ов";

                }

                case 2: {
                    if (OperationNumber.ConvetToInt(numMas[1]) == 1 && OperationNumber.ConvetToInt(numMas[0]) != 1) {

                        return NumToHundred.getWordNumber(number.substring(0, 2)) + " " + nameNumber;
                    }
                    if (OperationNumber.ConvetToInt(numMas[1]) >1 && OperationNumber.ConvetToInt(numMas[1]) <5&& OperationNumber.ConvetToInt(numMas[0]) != 1) {

                        return NumToHundred.getWordNumber(number.substring(0, 2)) + " " + nameNumber+"а";
                    }

                    else return NumToHundred.getWordNumber(number.substring(0, 2)) + " " + nameNumber + "ов";

                }


            }
        }
        return null;
    }
}
