package src.ss4.Bt8;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo 5 đối tượng Employee
        Employee[] employees = new Employee[5];

        // Nhập thông tin, tính lương và hiển thị thông tin các nhân viên
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.println("Enter details for employee " + (i + 1) + ":");
            employees[i].inputData();
            employees[i].calSalary();
            System.out.println();
        }

        // Hiển thị thông tin các nhân viên
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Details of employee " + (i + 1) + ":");
            employees[i].displayData();
            System.out.println();
        }
    }
}
