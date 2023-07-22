package Chapter6.Excercise6_18;

class Excercise6_18 {
    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(!(ch > '0' && ch < '9'))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
