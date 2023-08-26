package Chapter11;
import java.util.*;

public class Exercise11_26 {
    public static void main(String[] args) {
        Set set = new TreeSet(); // 자동정렬

        for(int i=0; set.size() < 6; i++)
        {
            int num = (int) (Math.random()*45+1);
            set.add(num);
        }

        System.out.println(set);
    }
}
