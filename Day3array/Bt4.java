package Day3array;

import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Bước 1: Khai báo 2 biến kiểu int nhập từ bàn phím để dùng làm số dòng và cột
        System.out.println("Nhập số dòng của ma trận");
        int rows = scanner.nextInt();
        System.out.println("Nhập số cột của ma trận");
        int cols = scanner.nextInt();
        //
        double[][] doubleNumber = new double[rows][cols];

        // Bước 2: Nhập các phần tử cho ma trận từ bàn phím
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                doubleNumber[i][j] = scanner.nextDouble();
            }
        }
        // Bước 3: Tìm phần tử lớn nhất và vị trí của nó
        double max = doubleNumber[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (doubleNumber[i][j] > max) {
                    max = doubleNumber[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Bước 4: In ra giá trị lớn nhất và vị trí của nó trong ma trận
        System.out.println("Giá trị lớn nhất trong ma trận là: " + max);
        System.out.println("Vị trí của phần tử lớn nhất: [" + maxRow + "][" + maxCol + "]");
    }
}