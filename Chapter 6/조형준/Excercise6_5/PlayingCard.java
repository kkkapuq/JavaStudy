package Chapter6.Excercise6_5;

public class PlayingCard {
    int kind; //인스턴스 변수
    int num;  //인스턴스 변수

    static int width; // 클래스 변수
    static int height; // 클래스 변수

    public PlayingCard(int k, int n) {
        // k, n 지역변수
        kind = k;
        num = n;
    }

    public static void main(String[] args) {
        // 지역변수
        PlayingCard card = new PlayingCard(1, 1);
    }
}
