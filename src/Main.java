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
            for (int i = 0; i <= arr.length - 1; i++) {
                System.out.print(arr[i]);
                if(i == arr.length - 1) {
                    System.out.print("");
                } else
                    System.out.print(", ");
            }
            System.out.println();
            double [] doubleArr = new double[] {1.57, 7.654, 9.986};
            for (int i = 0; i <= doubleArr.length - 1; i++) {
                System.out.print(doubleArr[i]);
                if(i == doubleArr.length - 1) {
                    System.out.print("");
                } else
                    System.out.print(", ");
            }
            System.out.println();

            char[] chars = {'a', 'b', 'c', 'd'};
            for (int i = 0; i <= chars.length - 1; i++) {
                System.out.print(chars[i]);
                if(i == chars.length - 1) {
                    System.out.print("");
                } else
                    System.out.print(", ");
            }
            System.out.println();
        }
        System.out.println();
        // Задача № 3
        {
            int[] arr = new int[]{1, 2, 3};
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]);
                if(i == 0) {
                    System.out.print("");
                } else
                    System.out.print(", ");
            }
            System.out.println();
            double[] doubleArr = new double[]{1.57, 7.654, 9.986};
            for (int j = doubleArr.length - 1; j >= 0; j--) {
                System.out.print(doubleArr[j]);
                if(j == 0) {
                    System.out.print("");
                } else
                    System.out.print(", ");
            }
            System.out.println();
            char[] chars = {'a', 'b', 'c', 'd'};
            for (int k = chars.length - 1; k >= 0; k--) {
                System.out.print(chars[k]);
                if(k == 0) {
                    System.out.print("");
                } else
                    System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        // Задача № 4
        {
            int[] arr = new int[]{1, 2, 3};
            for (int i = 0; i <= arr.length - 1; i++) {

                if (arr [i] % 2 != 0) {
                    arr [i]++;
                    }
                System.out.print(arr[i] + " ");

            }
        }



    }




}








