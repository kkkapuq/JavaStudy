package Chapter7.Excercise.Excercise7_8;
class Outer {
    int value=10; // Outer.this.value
    class Inner { // (instance inner class) 인스턴스 클래스
        int value=20; // this.value
        void method1() {
            int value=30; // value
            System.out.println( value);
            System.out.println( this.value);
            System.out.println(Outer.this.value);
        }
    } // Inner클래스의 끝
} // Outer클래스의 끝

class Exercise7_8 {
    public static void main(String args[]) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method1();
    }
}