package Chapter11;

import java.util.*;

public class Exercise11_15 {
    public static void main(String[] args) {
        ArrayList original = new ArrayList(10);
        ArrayList copy1 = new ArrayList(10);
        ArrayList copy2 = new ArrayList(10);

        for(int i=0; i<10; i++)
        {
            original.add(i+"");
        }
        Iterator it = original.iterator();

        while(it.hasNext())
        {
            copy1.add(it.next());
        }

        System.out.println(original);
        System.out.println(copy1);
        System.out.println();

        it = original.iterator();

        while(it.hasNext())
        {
            copy2.add(it.next());
            it.remove();
        }

        System.out.println(original);
        System.out.println(copy2);
    }
}
