package Chapter7.Excercise.Excercise7_7;

class Outer { // 외부 클래스
    static class Inner { // (static ) 내부 클래스 클래스
        int iv=200;
    }
}

class Excercise7_7 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        System.out.println(inner.iv);
    }
}
