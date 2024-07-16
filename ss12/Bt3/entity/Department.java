package ss12.Bt3.entity;

import ss12.Bt3.util.InputMethods;

public class Department implements IManagement{
    private static int autoId = 0;
    private String departmentId;
    private String departmentName;
    private int totalMembers;

    public Department() {
        this.departmentId = String.format("D%03d", autoId++);
    }


    public Department(String departmentId, String departmentName, int totalMembers) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.totalMembers = totalMembers;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId='" + departmentId + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", totalMembers=" + totalMembers +
                '}';
    }

    @Override
    public void inputData() {
        System.out.println("Nhập tên phòng ban: ");
        departmentName = InputMethods.getString();

        System.out.println("Nhập số lượng nhân viên: ");
        totalMembers = InputMethods.getInteger();
    }

    public void displayData() {
        System.out.printf("| Id: %-4s | Name: %-15s | totalMembers : %10s |\n",departmentId, departmentName, totalMembers);
    }
}
