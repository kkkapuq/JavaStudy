class Outer { // 외부 클래스
    static class Inner { //내부 클래스
        int iv=200;
    }
}

class Exercise7_7 {
    public static void main(String[] args) {
        Outer.Inner ii = new Outer.Inner();
        System.out.println(ii.iv);
    }
}
