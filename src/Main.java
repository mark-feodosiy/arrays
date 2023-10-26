import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        // Задача № 1
        {
        int [] arr = new int [] {1, 2, 3};
            System.out.println(arr[0]);
        double [] doubleArr = new double[] {1.57, 7.654, 9.986};
            System.out.println(doubleArr[1]);
        char[] chars = {97, 98, 99, 'd'};
            System.out.println (chars [2]);
        }
        System.out.println();
        // Задача № 2
        {
            int [] arr = new int [] {1, 2, 3};
            System.out.println(Arrays.toString(arr));
            double [] doubleArr = new double[] {1.57, 7.654, 9.986};
            System.out.println(Arrays.toString(doubleArr));
            char[] chars = {'a', 'b', 'c', 'd'};
            System.out.println(Arrays.toString(chars ));
        }
        System.out.println();
        // Задача № 2
        {
            int[] arr = new int[]{1, 2, 3};
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            double[] doubleArr = new double[]{1.57, 7.654, 9.986};
            for (int j = doubleArr.length - 1; j >= 0; j--) {
                System.out.print(doubleArr[j] + " ");
            }
            System.out.println();
            char[] chars = {'a', 'b', 'c', 'd'};
            for (int k = chars.length - 1; k >= 0; k--) {
                System.out.print(chars[k] + " ");
            }

        }



    }




}








