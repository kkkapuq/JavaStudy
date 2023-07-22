package Chapter6.Excercise6_2;

public class Excercise6_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        String str = s.info();
        System.out.println(str);
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

        private String info() {
            return name + ',' + ban + ',' + no + ',' + kor + ',' + eng + ',' + eng + ',' + math;
        }
    }
}
