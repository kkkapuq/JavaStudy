package Chapter7.Excercise.Excercise7_6;

class Outer { // 외부 클래스
    class Inner { // ( ) 내부 클래스 인스턴스 클래스
        int iv=100;
    }
}


class Excercise7_6 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.new Inner().iv);
    }
}
