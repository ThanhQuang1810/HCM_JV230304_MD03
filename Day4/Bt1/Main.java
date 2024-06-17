package Day4.Bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius:");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("chu vi :" + circle.getCircumference());
        System.out.println("dien tich :" + circle.getArea());
    }
}
