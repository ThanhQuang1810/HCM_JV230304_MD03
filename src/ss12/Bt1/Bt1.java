package src.ss12.Bt1;



import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Sử dụng Stream API và phương thức map() để tạo một danh sách mới bằng cách thay đổi kiểu dữ liệu của các phần tử trong danh sách ban đầu.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Random random = new Random();
//        List<Integer> newNumbers = Stream.generate(()-> random.nextInt(50)).distinct().limit(10).toList();
        Optional<Integer> maxNumbers = numbers.stream().max(Integer::compareTo);

        //Sử dụng Stream API và phương thức filter() để tìm số chẵn
        Stream<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0);
        System.out.println("So chan la: ");
        evenNumbers.forEach(System.out::println);

        //Sử dụng Stream API và phương thức filter() để lọc các số lớn hơn một giá trị xác định mà người dùng nhập vào
        System.out.print("Nhập vào giá trị: ");
        int number = Integer.parseInt(scanner.nextLine());
        Stream<Integer> filteredNumbers = numbers.stream().filter(n -> n > number);
        System.out.println("Các số lớn hơn " + number + " là: ");
        filteredNumbers.forEach(System.out::println);

        //Sử dụng Stream API và phương thức reduce() để tính tổng của các số trong danh sách.
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Tổng các số trong danh sách là: " + sum);
        //Dấu "::": được gọi là method reference
        // Method reference được sử dụng trong các biểu thức lambda để tham chiếu trực tiếp tới phương thức hoặc hàm.

        //Sử dụng Stream API và phương thức anyMatch() để kiểm tra xem danh sách có chứa ít nhất một số chẵn hay không.
        boolean hasEvenNumber = numbers.stream().anyMatch(n -> n % 2 == 0);
        System.out.println("Danh sách có chứa số chẵn không: " + hasEvenNumber);

        //Sử dụng Stream API và phương thức range() để tạo danh sách các số từ x đến y.
        System.out.println("Range: ");
        IntStream.range(1, 10).forEach(System.out::println);

        //Sử dụng Stream API và phương thức sorted() để sắp xếp danh sách theo thứ tự bảng chữ cái.
        String[] names = {"John", "Alice", "Bob", "David", "Emily"};
        Arrays.stream(names).sorted().forEach(System.out::println);

        //Sử dụng Stream API và phương thức map() để chuyển các chuỗi thành chữ in hoa.
        Arrays.stream(names).map(String::toUpperCase).forEach(System.out::println);
    }
}