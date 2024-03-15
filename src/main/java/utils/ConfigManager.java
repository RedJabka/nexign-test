package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    protected static FileInputStream fileInputConf;
    protected static FileInputStream fileInputVar;
    protected static Properties PROPERTIES;
    protected static Properties VARIABLES;


    static {
        try {
            //указание пути до файла с настройками
            fileInputConf = new FileInputStream("src/test/resources/conf.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputConf);
        } catch (IOException e) {
            e.printStackTrace();
            //обработка возможного исключения (нет файла и т.п.)
        } finally {
            if (fileInputConf != null)
                try {
                    fileInputConf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    static {
        try {
            //указание пути до файла с переменными
            fileInputVar = new FileInputStream("src/test/resources/var.properties");
            VARIABLES = new Properties();
            VARIABLES.load(fileInputVar);
        } catch (IOException e) {
            e.printStackTrace();
            //обработка возможного исключения (нет файла и т.п.)
        } finally {
            if (fileInputVar != null)
                try {
                    fileInputVar.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key);
    }
    public static String getVariable(String key) {
        return VARIABLES.getProperty(key);
    }
}