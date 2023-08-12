package Chapter9;

import java.util.Random;

public class Exercise9_28 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] number = new int[100];
        int[] counter = new int[10];

        for(int i=0; i<number.length; i++)
        {
            //System.out.println(number[i] = (int)(Math.random() * 10));
            // 0 <= x < 10 반환
            System.out.print(number[i] = rand.nextInt(10));
        }

        System.out.println();

        for(int i=0; i<number.length; i++)
            counter[number[i]]++;

        for(int i=0; i<counter.length; i++)
        {
            System.out.println(i + "의 개수 : " + counter[i]);
        }
    }
}
