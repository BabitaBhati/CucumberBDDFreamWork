package comtestingfreamwork.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyreader {

    Properties p=null;

    public Propertyreader(Properties p) {
        this.p = p;
    }

    public static String readKey(String key) throws Exception {
        FileInputStream fileInputStream=null;
        Properties p = null;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/data.properties");
            p = new Properties();
            p.load(fileInputStream);
            return p.getProperty(key);

        } catch (FileNotFoundException e) {
            new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (p.getProperty(key) == null) {
            throw new Exception(p.getProperty(key) + "not found");
        } else {
            return p.getProperty(key);
        }
    }
}