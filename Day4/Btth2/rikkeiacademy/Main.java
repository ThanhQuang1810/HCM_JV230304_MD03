package Day4.Btth2.rikkeiacademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the studentId:");
        String studentId = scanner.nextLine();
        System.out.print("Enter the studentName:");
        String studentName = scanner.nextLine();
        System.out.print("Enter the sex:");
        String sex = scanner.nextLine();
        System.out.print("Enter the className:");
        String className = scanner.nextLine();
        System.out.print("Enter the age:");
        String age = scanner.nextLine();
        System.out.print("Enter the address:");
        String address = scanner.nextLine();
        ClassStudent classStudent = new ClassStudent(studentId, studentName, sex, className, age, address);
        System.out.println("Your Student \n" + classStudent.display());

    }
}
