package ss2;

import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem mon Toan");
        float Math = scanner.nextFloat();
        System.out.println("Nhap diem mon Van");
        float Literature = scanner.nextFloat();
        System.out.println("Nhap diem mon Anh");
        float English = scanner.nextFloat();
        float DTB = (Math + Literature + English) / 3;
        if (DTB < 5) {
            System.out.println("Yếu");
        } else if (DTB >= 5 && DTB < 6.5) {
            System.out.println("Trung bình");
        } else if (DTB >= 6.5 && DTB < 8) {
            System.out.println("Khá");
        } else if (DTB >= 8 && DTB < 9) {
            System.out.println("Giỏi");
        } else {
            System.out.println("Xuất sắc");
        }
    }
}