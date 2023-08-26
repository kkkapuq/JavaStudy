package Chapter11;

import java.util.Vector;

public class Exercise11_3 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        System.out.println(v.size() + " " + v.capacity()); // 3 5

        v.trimToSize(); // 빈 공간을 없앤다. (용량과 크기가 같아짐)
        System.out.println(v.size() + " " + v.capacity()); // 3 3

        v.ensureCapacity(6);
        System.out.println(v.size() + " " + v.capacity()); // 3 6

        // capacity가 충분하면, 새로 인스턴스를 생성 안해도 됨
        // capacity가 충분하지 않다면, 자동적으로 기존의 크기보다 2배 증가
        v.setSize(7);
        System.out.println(v.size() + " " + v.capacity()); // 7 12

        v.clear();
        System.out.println(v.size() + " " + v.capacity()); // 0 12

    }
}
