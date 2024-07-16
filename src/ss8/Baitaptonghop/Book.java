    package src.ss8.Baitaptonghop;
import java.util.Scanner;
public class Book {
    private String id;
    private String title;
    private String author;
    private int year;
    private String description;
    private Category category;

    public Book() {}

    public Book(String id, String title, String author, int year, String description, Category category) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.description = description;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void inputData(Category[] categories) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập mã sách (bắt đầu bằng 'B', 4 ký tự): ");
            String idInput = scanner.nextLine();
            if (idInput.matches("B.{3}")) {

                this.id = idInput;
                break;
            } else {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng thử lại.");
            }
        }

        while (true) {
            System.out.print("Nhập tiêu đề sách (6-50 ký tự): ");
            String titleInput = scanner.nextLine();
            if (titleInput.length() >= 6 && titleInput.length() <= 50) {
                this.title = titleInput;
                break;
            } else {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng thử lại.");
            }
        }

        while (true) {
            System.out.print("Nhập tên tác giả: ");
            String authorInput = scanner.nextLine();
            if (!authorInput.isEmpty()) {
                this.author = authorInput;
                break;
            } else {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng thử lại.");
            }
        }

        while (true) {
            System.out.print("Nhập năm xuất bản (>= 1970 và <= năm hiện tại): ");
            int yearInput = scanner.nextInt();
            int currentYear = java.time.Year.now().getValue();
            if (yearInput >= 1970 && yearInput <= currentYear) {
                this.year = yearInput;
                break;
            } else {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng thử lại.");
            }
        }
        scanner.nextLine(); // Consume newline

        while (true) {
            System.out.print("Nhập mô tả sách: ");
            String descriptionInput = scanner.nextLine();
            if (!descriptionInput.isEmpty()) {
                this.description = descriptionInput;
                break;
            } else {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng thử lại.");
            }
        }

        System.out.println("Chọn một thể loại:");
        for (Category category : categories) {
            System.out.println(category.getId() + ": " + category.getName());
        }
        while (true) {
            System.out.print("Nhập mã thể loại: ");
            int categoryId = scanner.nextInt();
            for (Category category : categories) {
                if (category.getId() == categoryId) {
                    this.category = category;
                    return;
                }
            }
            System.out.println("Mã thể loại không hợp lệ. Vui lòng thử lại.");
        }
    }

    public void displayData() {
        System.out.println("ID: " + id);
        System.out.println("Tiêu đề: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Năm xuất bản: " + year);
        System.out.println("Mô tả: " + description);
        System.out.println("Thể loại: " + category.getName());
    }
}
