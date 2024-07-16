package src.ss3;

import java.util.*;

public class Bt1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter your number");
            int number = Integer.parseInt(scanner.nextLine());
            arr[i] = number;
        }
        // 1 2 3 4 5 6
        // 6 5 4 3 2 1
        // for (int i = arr.length - 1; i >= 0; i--) {
        // System.out.print(arr[i] + " ");
        // }
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        // Collections.reverse(Arrays.asList(arr));
        // System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
