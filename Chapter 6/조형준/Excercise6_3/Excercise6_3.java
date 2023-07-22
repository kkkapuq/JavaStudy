package Chapter6.Excercise6_3;

import Chapter6.Excercise6_2.Excercise6_2;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.round;

public class Excercise6_3 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름:" + s.name);
        System.out.println("총점:" + s.getTotal());
        System.out.println("평균:" + s.getAverage());
    }

    static class Student {
        String name;
        int ban;
        int no;
        int kor;
        int eng;
        int math;

        Student() {

        }

        public Student(String name, int ban, int no, int kor, int eng, int math) {
            this.name = name;
            this.ban = ban;
            this.no = no;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }

        private int getTotal() {
            return kor + eng + math;
        }

        private float getAverage(){
//            float a = Math.round(((float) (getTotal() / 3 * 100)) / 100.0);
            return (int)(getTotal() / 3f * 10 + 0.5f) / 10.0f;
//            BigDecimal bd = new BigDecimal(getTotal());
//            bd = bd.setScale(2, RoundingMode.HALF_UP);
        }
    }
}
