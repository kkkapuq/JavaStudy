class Outer {
    int value=10; // Outer.this.value
    class Inner { // 인스턴스 클래스
        int value=20; // this.value
        void method1() {
            int value=30; // value
            System.out.println(value);
            System.out.println(this.value);
            System.out.println(Outer.this.value);
        }
    } 
} 

class Exercise7_8 {
    public static void main(String args[]) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method1();
    }
}
