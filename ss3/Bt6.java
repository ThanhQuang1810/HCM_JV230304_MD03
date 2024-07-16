package ss3;

import java.util.Scanner;

public class Bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng dòng");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số lượng cột");
        int cols = Integer.parseInt(scanner.nextLine());

        double[][] arr = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("nhập" + i + j);
                arr[i][j] = Double.parseDouble(scanner.nextLine());

            }
        }
        System.out.println("nhập cột cần tính tổng :");
        int sum = 0;

        int h = Integer.parseInt(scanner.nextLine());
        if (h > cols) {
            System.out.println("loi");
        } else {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (j == h) {
                        sum += arr[i][h];
                    }

                }
            }
            System.out.println("Tổng của cột nhập vào :" + sum);
        }

    }
}
