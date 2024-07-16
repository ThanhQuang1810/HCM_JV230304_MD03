package ss12.Bt3.entity;

import ss12.Bt3.util.InputMethods;

import java.time.LocalDate;

public class Employee implements IManagement {
    private static int autoId = 0;
    private String employeeId;
    private String employeeName;
    private LocalDate birthday;
    private boolean sex;
    private double salary;
    private Employee manager;
    private Department department;

    public Employee() {
        this.employeeId = String.format("E%05d", autoId++);
    }

    public Employee(String employeeId, String employeeName, LocalDate birthday, boolean sex, double salary, Employee manager, Department department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.birthday = birthday;
        this.sex = sex;
        this.salary = salary;
        this.manager = manager;
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", salary=" + salary +
                ", manager=" + manager +
                ", department=" + department +
                '}';
    }

    @Override
    public void inputData() {
        System.out.println("Nhập tên nhân viên:");
        employeeName = InputMethods.getString();
        System.out.println("Nhập ngày sinh (định dạng dd/MM/yyyy):");
        birthday = InputMethods.getDate();
        System.out.println("Nhập giới tính:");
        sex = InputMethods.getBoolean();

        System.out.println("Nhập lương cơ bản:");
        salary = InputMethods.getDouble();
    }

    @Override
    public void displayData() {
        System.out.printf("| Id: %-4s | Name: %-15s | Ngày sinh : %10s |Giới tính : %10s |Lương cơ bản : %10s |Người quản lí :  %10s |Phòng ban : %10s |\n", employeeId, employeeName,birthday, sex, salary, manager, department);
    }
}
