package Chapter11;

import java.util.*;

public class Exercise11_5 {
    public static void main(String[] args) {
        //추가할 데이터의 개수를 고려하여 충분히 잡아야함
        ArrayList al = new ArrayList(2000000);
        LinkedList ll = new LinkedList();

        System.out.println("순차적으로 추가하기");
        System.out.println(add1(al));
        System.out.println(add1(ll));

        System.out.println("중간에 추가하기");
        System.out.println(add2(al));
        System.out.println(add2(ll));

        System.out.println("중간에 삭제하기");
        System.out.println(remove2(al));
        System.out.println(remove2(ll));

        System.out.println("순차적으로 삭제하기");
        System.out.println(remove1(al));
        System.out.println(remove1(ll));
    }
    public static long add1(List list) {
        long start = System.currentTimeMillis();
        for(int i=0; i<1000000; i++) list.add(i+"");
        long end = System.currentTimeMillis();
        return end-start;
    }
    public static long add2(List list) {
        long start = System.currentTimeMillis();
        for(int i=0; i<10000; i++) list.add(500,"X");
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long remove1(List list) {
        long start = System.currentTimeMillis();
        for(int i=list.size()-1; i>=0; i--) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long remove2(List list) {
        long start = System.currentTimeMillis();
        for(int i=0; i<10000; i++) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
