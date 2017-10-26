package WorckNumber.DeclinationOfNumbers;


import Configuration.WorkExel.ConfigExel;

import java.io.IOException;

public  abstract  class DeclinationNumbers {

    protected static ConfigExel BaseConfig;
    protected static ConfigExel UserConfig;

    static {
        try {
            BaseConfig = new ConfigExel();
            UserConfig= new ConfigExel();

            BaseConfig.start("BaseConfig");
            UserConfig.start("UserConfig");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
