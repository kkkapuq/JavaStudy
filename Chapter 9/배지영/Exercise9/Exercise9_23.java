package Chapter9;

public class Exercise9_23 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i==i2); // 서로 다른 100을 가리킴 -> false
        System.out.println(i.equals(i2)); // equals 오버라이딩 -> true
        System.out.println(i.compareTo(i2)); // 0
        System.out.println(i.toString()); // 100

        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        System.out.println(Integer.SIZE); // 32
        System.out.println(Integer.BYTES); // 8
        System.out.println(Integer.TYPE); // int
    }
}
