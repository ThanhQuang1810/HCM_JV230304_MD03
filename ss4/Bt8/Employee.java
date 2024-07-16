package ss4.Bt8;

import java.util.Scanner;

public class Employee {
    private int employeeId;
    private String employeeName;
    private int age;
    private String gen;
    private double rate;
    private double salary;
 
    // Constructor không tham số
    public Employee() {
    }

    // Constructor có tham số
    public Employee(int employeeId, String employeeName, int age, String gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }

    // Phương thức nhập thông tin
    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        this.employeeId = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter employee name: ");
        this.employeeName = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();

        scanner.nextLine(); // Consume newline

        System.out.print("Enter gender: ");
        this.gen = scanner.nextLine();

        System.out.print("Enter rate: ");
        this.rate = scanner.nextDouble();
    }

    // Phương thức hiển thị thông tin
    public void displayData() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gen);
        System.out.println("Rate: " + rate);
        System.out.println("Salary: " + salary);
    }

    // Phương thức tính lương
    public void calSalary() {
        this.salary = this.rate * 1300000;
    }
}
