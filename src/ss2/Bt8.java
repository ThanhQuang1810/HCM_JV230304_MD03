package src.ss2;

import java.util.Scanner;

public class Bt8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 Kiểm tra tính chẵn lẻ của 1 số.\r\n" + //
                "\r\n" + //
                "2 Kiểm tra số nguyên tố.\r\n" + //
                "\r\n" + //
                "3 Kiểm tra một số có chia hết cho 3 không.\r\n" + //
                "\r\n" + //
                "4 Thoát");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("kiểm tra chẵn lẻ");
                int number = scanner.nextInt();
                if (number % 2 == 0) {
                    System.out.println("Số chẵn");

                } else {
                    System.out.println("số lẻ");
                }
                break;
            case 2:
                System.out.println("Kiểm tra số nguyên tố");
                int number1 = scanner.nextInt();
                boolean isPrime = true;

                for (int j = 2; j <= Math.sqrt(number1); j++) {
                    if (number1 % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime && number1 > 1) {
                    System.out.println(number1 + " là số nguyên tố");
                } else {
                    System.out.println(number1 + " không phải là số nguyên tố");
                }

                break;

            case 3:
                System.out.println("kiểm tra có chia hết cho 3 khum");
                int number2 = scanner.nextInt();
                if (number2 % 3 == 0) {
                    System.out.println("chia hết cho 3");
                } else {
                    System.out.println("số ko chia hết cho 3");
                }
                break;
            case 4:
                System.out.println("đã thoát ct");
                break;
            default:
                System.out.println(" chọn từ 1 - 4 thôiiiiiii");
                break;
        }
    }
}