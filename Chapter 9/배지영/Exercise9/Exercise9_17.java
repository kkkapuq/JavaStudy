package Chapter9;

public class Exercise9_17 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        //fullName에서 '.'의 위치 찾음
        int index = fullName.indexOf('.');

        //첫번째부터 '.'까지 문자열
        String fileName = fullName.substring(0,index);

        //'.'의 다음 문자부터 끝까지
        //fullName.substring(index+1, fullName.length()); 와 같다.
        String ext = fullName.substring(index+1);

        System.out.println(fileName);
        System.out.println(ext);

    }
}
