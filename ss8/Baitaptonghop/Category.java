package ss8.Baitaptonghop;
import java.util.Scanner;

public class Category {
    private static int idCounter = 1;
    private int id;
    private String name;
    private boolean status;

    public Category() {
        this.id = ++idCounter;
    }

    public Category(String name, boolean status) {
        this.id = ++idCounter;
        this.name = name;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập tên thể loại (6-30 ký tự): ");
            String nameInput = scanner.nextLine();
            if (nameInput.length() >= 6 && nameInput.length() <= 30) {
                this.name = nameInput;
                break;
            } else {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng thử lại.");
            }
        }

        while (true) {
            System.out.print("Nhập trạng thái thể loại (true/false): ");
            String statusInput = scanner.nextLine();
            if (statusInput.equalsIgnoreCase("true")) {
                this.status = true;
                break;
            } else if (statusInput.equalsIgnoreCase("false")) {
                this.status = false;
                break;
            } else {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    public void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Tên: " + name);
        System.out.println("Trạng thái: " + (status ? "Hoạt động" : "Không hoạt động"));
    }
}
