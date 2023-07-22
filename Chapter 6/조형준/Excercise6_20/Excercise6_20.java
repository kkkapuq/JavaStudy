package Chapter6.Excercise6_20;

import java.util.Arrays;

class Excercise6_20 {

    static int max(int[] arr) {
        if(arr == null || arr.length == 0)
            return -999999;
        int max = arr[0];
//        return Arrays.stream(arr).max().getAsInt();
        for (int i : arr) {
            max = Math.max(i, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 9, 4, 7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값 : " + max(data));
        System.out.println("최대값 : " + max(null));
        System.out.println("최대값 : " + max(new int[] {})); //크기가 0인 배열
    }
}
