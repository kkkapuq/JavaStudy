package Chapter6.Excercise6_6;

public class Excercise6_6 {
    static class MyPoint {
        int x;
        int y;

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        private double getDistance(int x1, int y1) {
            return Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
        }
    }

    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);
        System.out.println(p.getDistance(2, 2));
    }
}
