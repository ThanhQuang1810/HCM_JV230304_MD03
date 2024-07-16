package src.ss3;

import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo mảng:
        System.out.print("Nhập kích thước của mảng thứ nhất: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        // Tạo mảng:
        System.out.print("Nhập kích thước của mảng thứ hai: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        // Vòng lặp nhập giá trị cho các phần tử trong mảng 1:
        System.out.println("Nhập các phần tử của mảng thứ nhất:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        // Vòng lặp nhập giá trị cho các phần tử trong mảng 2:
        System.out.println("Nhập các phần tử của mảng thứ hai:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng:
        int[] array3 = new int[size1 + size2];

        // Sử dụng vòng lặp để duyệt các phần tử trong mảng 1
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        // Sử dụng vòng lặp để duyệt các phần tử trong mảng 2
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        // In mảng thứ 3 ra màn hình
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}