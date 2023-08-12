package Chapter9.Excercise;

public class Excercise9_5 {
    public static String delChar(String src, String delCh) {
        for (char c : delCh.toCharArray()) {
            src = src.replace(String.valueOf(c), "");
        }
        return src;
    }


    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> "
                + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)" + " -> "
                + delChar("(1 2 3 4\t5)", " \t"));
    }
}
