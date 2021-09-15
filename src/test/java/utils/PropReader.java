package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

public class PropReader {

    static String propFileUrl ="/src/test/resources/properties/test.properties";
    String value ="";


    public static Properties readPropertiesFile() throws IOException {
        String systemDir = System.getProperty("user.dir");
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(systemDir+propFileUrl);
            prop = new Properties();
            prop.load(fis);
            fis.close();
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        return prop;
    }
}
