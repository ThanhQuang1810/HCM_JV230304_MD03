//package Day8.Baitaptonghop;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Library {
//    private static Category[] categories = new Category[10];
//    private static Book[] books = new Book[10];
//    private static int categoryCount = 0;
//    private static int bookCount = 0;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("===== QUẢN LÝ THƯ VIỆN =====");
//            System.out.println("1. Quản lý Thể loại");
//            System.out.println("2. Quản lý Sách");
//            System.out.println("3. Thoát");
//            System.out.print("Chọn chức năng: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            switch (choice) {
//                case 1:
//                    manageCategories(scanner);
//                    break;
//                case 2:
//                    manageBooks(scanner);
//                    break;
//                case 3:
//                    System.out.println("Kết thúc chương trình.");
//                    return;
//                default:
//                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
//            }
//        }
//    }
//
//    private static void manageCategories(Scanner scanner) {
//        while (true) {
//            System.out.println("===== QUẢN LÝ THỂ LOẠI =====");
//            System.out.println("1. Thêm mới thể loại");
//            System.out.println("2. Hiển thị danh sách theo tên thể loại A-Z");
//            System.out.println("3. Thống kê thể loại và số sách có trong mỗi thể loại");
//            System.out.println("4. Cập nhật thể loại");
//            System.out.println("5. Xóa thể loại");
//            System.out.println("6. Quay lại");
//            System.out.print("Chọn chức năng: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            switch (choice) {
//                case 1:
//                    addCategory(scanner);
//                    break;
//                case 2:
//                    displayCategories();
//                    break;
//                case 3:
//                    displayCategoryStatistics();
//                    break;
//                case 4:
//                    updateCategory(scanner);
//                    break;
//                case 5:
//                    deleteCategory(scanner);
//                    break;
//                case 6:
//                    return;
//                default:
//                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
//            }
//        }
//    }
//
//    private static void addCategory(Scanner scanner) {
//        if (categoryCount == categories.length) {
//            categories = Arrays.copyOf(categories, categories.length * 2);
//        }
//        Category category = new Category();
//        category.inputData();
//        categories[categoryCount++] = category;
//        System.out.println("Thêm thể loại thành công.");
//    }
//
//    private static void displayCategories() {
//        Category[] sortedCategories = Arrays.copyOf(categories, categoryCount);
//        Arrays.sort(sortedCategories, (a, b) -> a.getName().compareToIgnoreCase(b.getName()));
//        for (Category category : sortedCategories) {
//            category.displayData();
//        }
//    }
//
//    private static void displayCategoryStatistics() {
//        for (Category category : categories) {
//            if (category != null) {
//                long count = Arrays.stream(books, 0, bookCount)
//                        .filter(book -> book.getCategory().getId() == category.getId())
//                        .count();
//                System.out.println("Thể loại: " + category.getName() + " - Số sách: " + count);
//            }
//        }
//    }
//
//    private static void updateCategory(Scanner scanner) {
//        System.out.print("Nhập mã thể loại để cập nhật: ");
//        int categoryId = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        for (int i = 0; i < categoryCount; i++) {
//            if (categories[i].getId() == categoryId) {
//                categories[i].inputData();
//                System.out.println("Cập nhật thể loại thành công.");
//                return;
//            }
//        }
//        System.out.println("Thể loại không tồn tại.");
//    }
//
//    private static void deleteCategory(Scanner scanner) {
//        System.out.print("Nhập mã thể loại để xóa: ");
//        int categoryId = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        for (int i = 0; i < categoryCount; i++) {
//            nt i = 0; i < categoryCount; i++) {
//            if (categories[i].getId() == categoryId) {
//                int finalI = i;
//                long count = Arrays.stream(books, 0, bookCount)
//                        .filter(book -> book.getCategory().getId() == categories[finalI].getId())
//                        .count();
//                if (count > 0) {
//                    System.out.println("Thể loại đang có sách. Không thể xóa.");
//                    return;
//                }
//                for (nt j = i; j < categoryCount - 1; j++) {
//                    categories[j] = categories[j + 1];
//                }
//                categories[--categoryCount] = null;
//                System.out.println("Xóa thể loại thành công.");
//                return;
//            }
//        }
//        System.out.println("Thể loại không tồn tại.");
//    }
//
//    private static void manageBooks(Scanner scanner) {
//        while (true) {
//            System.out.println("===== QUẢN LÝ SÁCH =====");
//            System.out.println("1. Thêm mới sách");
//            System.out.println("2. Cập nhật thông tin sách");
//            System.out.println("3. Xóa sách");
//            System.out.println("4. Tìm kiếm sách");
//            System.out.println("5. Hiển thị danh sách sách theo nhóm thể loại");
//            System.out.println("6. Quay lại");
//            System.out.print("Chọn chức năng: ");
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume newline
//
//            switch (choice) {
//                case 1:
//                    addBook(scanner);
//                    break;
//                case 2:
//                    updateBook(scanner);
//                    break;
//                case 3:
//                    deleteBook(scanner);
//                    break;
//                case 4:
//                    searchBooks(scanner);
//                    break;
//                case 5:
//                    displayBooksByCategory();
//                    break;
//                case 6:
//                    return;
//                default:
//                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
//            }
//        }
//    }
//
//    private static void addBook(Scanner scanner) {
//        if (categoryCount == 0) {
//            System.out.println("Chưa có thể loại. Vui lòng thêm thể loại trước.");
//            return;
//        }
//        if (bookCount == books.length) {
//            books = Arrays.copyOf(books, books.length * 2);
//        }
//        Book book = new Book();
//        book.inputData(Arrays.copyOf(categories, categoryCount));
//        books[bookCount++] = book;
//        System.out.println("Thêm sách thành công.");
//    }
//
//    private static void updateBook(Scanner scanner) {
//        System.out.print("Nhập mã sách để cập nhật: ");
//        String bookId = scanner.nextLine();
//
//        for (int i = 0; i < bookCount; i++) {
//            if (books[i].getId().equals(bookId)) {
//                books[i].inputData(Arrays.copyOf(categories, categoryCount));
//                System.out.println("Cập nhật thông tin sách thành công.");
//                return;
//            }
//        }
//        System.out.println("Sách không tồn tại.");
//    }
//
//    private static void deleteBook(Scanner scanner) {
//        System.out.print("Nhập mã sách để xóa: ");
//        String bookId = scanner.nextLine();
//
//        for (int i = 0; i < bookCount; i++) {
//            if (books[i].getId().equals(bookId)) {
//                for (int j = i; j < bookCount - 1; j++) {
//                    books[j] = books[j + 1];
//                }
//                books[--bookCount] = null;
//                System.out.println("Xóa sách thành công.");
//                return;
//            }
//        }
//        System.out.println("Sách không tồn tại.");
//    }
//
//    private static void searchBooks(Scanner scanner) {
//        System.out.print("Nhập từ khóa tìm kiếm: ");
//        String keyword = scanner.nextLine().toLowerCase();
//
//        for (int i = 0; i < bookCount; i++) {
//            if (books[i].getTitle().toLowerCase().contains(keyword) || books[i].getAuthor().toLowerCase().contains(keyword)) {
//                books[i].displayData();
//            }
//        }
//    }
//
//    private static void displayBooksByCategory() {
//        for (int i = 0; i < categoryCount; i++) {
//            System.out.println("Thể loại: " + categories[i].getName());
//            for (int j = 0; j < bookCount; j++) {
//                if (books[j].getCategory().getId() == categories[i].getId()) {
//                    System.out.println("  - " + books[j].getTitle());
//                }
//            }
//        }
//    }
//}
//
