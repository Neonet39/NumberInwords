package WorckNumber.DeclinationOfNumbers;


import WorckNumber.OperationNumber;

public class NumToHundred extends DeclinationNumbers   {

    public static String getWordNumber(String number) {
        int numLegth = number.length();
        char[] masNumber = number.toCharArray();
        String wordNum = "";

        switch (numLegth){
            case 1:{
                String result = BaseConfig.wordByNumber(Integer.valueOf(number));
                if (result==null)
                    return null;else
                return result;
            }

            case 2:{
                String result = BaseConfig.wordByNumber(Integer.valueOf(number));
                if (result!=null) return result;
                else {
                    int oneNumber = OperationNumber.ConvetToInt(masNumber[0]);
                    wordNum = getWordNumber(String.valueOf(oneNumber*10));

                    int twoNumber = OperationNumber.ConvetToInt(masNumber[1]);
                    if(twoNumber!=0)
                        wordNum+=" "+getWordNumber(String.valueOf(twoNumber));

                    return wordNum;
                }
            }
            case 3:{
                String result = BaseConfig.wordByNumber(Integer.valueOf(number));
                if (result!=null) return result;
                else {
                    int oneNumber = OperationNumber.ConvetToInt(number.toCharArray()[0]);
                    String wrdNum =  BaseConfig.wordByNumber(oneNumber*100);
                    String newNum = number.substring(1,3);

                    wrdNum+=" "+getWordNumber(newNum);
                    return wrdNum;
                }
            }
            default:{
                return null;
            }
        }

    }



}
