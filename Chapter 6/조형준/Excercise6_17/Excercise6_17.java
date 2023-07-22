package Chapter6.Excercise6_17;

class Excercise6_17 {
    private static int[] shuffle(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int temp = (int) (Math.random() * arr.length);

            int t = arr[i];
            arr[i] = arr[temp];
            arr[temp] = t;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
