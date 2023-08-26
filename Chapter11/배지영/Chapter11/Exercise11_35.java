package Chapter11;
import java.util.*;

public class Exercise11_35 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        Enumeration e = prop.propertyNames();

        while(e.hasMoreElements()) {
            String element = (String) e.nextElement();
            System.out.println(element + "=" + prop.getProperty(element));
        }

        System.out.println();

        prop.setProperty("size","20");
        System.out.println(prop.getProperty("size"));
        System.out.println(prop.getProperty("capacity","20"));
        System.out.println(prop.getProperty("loadfactor", "0.75"));
        System.out.println(prop);
        prop.list(System.out);
    }
}
