package Chapter9;

import java.util.StringTokenizer;

public class Exercise9_38 {
    public static void main(String[] args) {
        String source = "100,200,300,400";
        StringTokenizer st = new StringTokenizer(source, ",");

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
