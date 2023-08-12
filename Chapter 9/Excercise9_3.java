package Chapter9.Excercise;

public class Excercise9_3 {
    public static int count(String src, String target) {
        int count = 0; // 찾은 횟수
        int pos = 0; // 찾기 시작할 위치

        while (true) {
            int idx = src.indexOf(target, pos);
            if (idx != -1) {
                count++;
                pos += target.length();
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB","AB"));
        System.out.println(count("12345","AB"));
    }

}
