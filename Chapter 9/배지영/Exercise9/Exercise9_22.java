package Chapter9;

import static java.lang.Math.*;

public class Exercise9_22 {
    public static void main(String[] args) {
        int x1 = 1, y1 = 1;
        int x2 = 2, y2 = 2;

        double c = sqrt(pow(x2-x1, 2)  + pow(y2-y1,2)); // 1과 2 사이의 길이
        double a = c * sin(PI/4); // 45도
        double b = c * cos(PI/4);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(atan2(a,b)); // a,b 사이의 끼인각
        System.out.println(atan2(a,b) * 180 / PI); // 라디안을 도 단위로 변환
        System.out.println(24 * log10(2));
    }
}
