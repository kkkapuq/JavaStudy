package Chapter9;

import java.util.Locale;
import java.util.Scanner;

public class Exercise9_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] argArr = null;

        while(true) {
            String prompt = ">>";
            System.out.print(prompt);

            String input = scanner.nextLine();

            input = input.trim(); // 불필요한 앞뒤 공백 제거
            argArr = input.split(" +"); // 하나이상의 공백을 구분자로 자른다.

            String command = argArr[0].trim();

            if("".equals(command)) continue;

            //명령어를 소문자로 바꾼다.
            command = command.toLowerCase();

            if(command.equals("q")) {
                System.exit(0);
            } else{
                for(int i=0; i<argArr.length; i++)
                {
                    System.out.println(argArr[i]);
                }
            }
        }
    }
}
