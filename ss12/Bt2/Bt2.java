package ss12.Bt2;


import java.time.*;
import java.time.format.DateTimeFormatter;

public class Bt2 {
    public static void main(String[] args) {
        //Viết chương trình để lấy ngày hiện tại của hệ thống và các nơi bao gồm : Asia/Tokyo, Australia/Sydney ,America/Sao_Paulo
//        ZoneId TIMEZONE_ET = ZoneId.of("Asia/Tokyo");
//        LocalDate today = LocalDate.now(TIMEZONE_ET);
//        System.out.println("Today in Tokyo: " + today);

        //Viết chương trình để lấy thời gian hiện tại (giờ phút giây).
        LocalTime nowLocalTime = LocalTime.now();
        System.out.println("Current local time: " + nowLocalTime);

        //Viết chương trình để tính toán số ngày trong tháng hiện tại.
       LocalDate today = LocalDate.now();
        System.out.printf(" so ngay trong thang %s la $s",today.getMonth(),today.lengthOfMonth());

        //Viết chương trình để tính toán số ngày trong năm hiện tại.
        LocalDate nowLocalDate = LocalDate.now();
        int daysInYear = nowLocalDate.lengthOfYear();
        System.out.println("Number of days in the current year: " + daysInYear);

        //Viết chương trình để chuyển đổi một chuỗi ngày sang một đối tượng LocalDate.
//        LocalDate date = LocalDate.now();
        String text = "18/10/2005";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            String text2 = today.format(formatter);
            System.out.println(text2 + " text2");

            String s1 = LocalDate.parse(text, formatter).format(formatter);
            System.out.println(s1 + " s1");
        } catch (DateTimeException e) {
            System.err.println(e);
        }

        //Viết chương trình để chuyển đổi một đối tượng LocalDateTime sang một chuỗi ngày(dd/MM/yyyy HH:mm:ss).
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime s1 = LocalDateTime.now();
        String textDateTime = s1.format(formatter2);
        System.out.println(textDateTime + " textDateTime");

        //Viết chương trình để so sánh hai ngày LocalDate ( trả về int ).
        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2023, 1, 1);
        int result = date1.compareTo(date2);
        if (result < 0) {
            System.out.println("date1 is before date2");
        } else if (result > 0) {
            System.out.println("date1 is after date2");
        } else {
            System.out.println("date1 is equal to date2");
        }

        //Viết chương trình để so sánh hai thời gian LocalTime.
        LocalTime time1 = LocalTime.of(10, 30);
        LocalTime time2 = LocalTime.of(14, 0);

        int result2 = time1.compareTo(time2);

        if (result2 < 0) {
            System.out.println("time1 is before time2");
        } else if (result2 > 0) {
            System.out.println("time1 is after time2");
        } else {
            System.out.println("time1 is equal to time2");
        }

        //Viết chương trình để thêm hoặc bớt một số ngày, giờ, phút, giây hoặc mili giây vào một ngày hoặc thời gian nhập vào.

    }
}
