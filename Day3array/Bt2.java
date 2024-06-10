package Day3array;

import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap kich thuoc mang");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size]; // 6
        int size2 = size + 1; // 7
        int[] arr2 = new int[size2];
        System.out.println("nhap so can them");
        int item = Integer.parseInt(scanner.nextLine());

        System.out.println("vi tri");
        int indexAdd = Integer.parseInt(scanner.nextLine());

        // nhap cac so mang ban dau
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter your number");
            int number = Integer.parseInt(scanner.nextLine());
            arr[i] = number;
        }
        for (int i = 0; i < indexAdd; i++)
            arr2[i] = arr[i];

        for (int i = indexAdd + 1; i < size2; i++)
            arr2[i] = arr[i - 1];
        arr2[indexAdd] = item;
        for (int i = 0; i < size2; i++)
            System.out.print(arr2[i] + " ");
    }
}
