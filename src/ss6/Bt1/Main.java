package src.ss6.Bt1;

public class Main {
    public static void main(String[] args) {
        // Bước 1: Khai báo các biến kiểu String
        String s1 = "Rikkei academy";
        String s2 = "";

        // isEmpty()
        boolean isEmptyS1 = s1.isEmpty();
        boolean isEmptyS2 = s2.isEmpty();
        System.out.println("s1 isEmpty: " + isEmptyS1); // false
        System.out.println("s2 isEmpty: " + isEmptyS2); // true

        // trim()
        String trimmedS1 = s1.trim();
        String trimmedS2 = s2.trim();
        System.out.println("s1 trim: '" + trimmedS1 + "'"); // 'Rikkei academy'
        System.out.println("s2 trim: '" + trimmedS2 + "'"); // ''

        // equals() và equalsIgnoreCase()
        String s3 = "rikkei academy";
        boolean isEqual = s1.equals(s3);
        boolean isEqualIgnoreCase = s1.equalsIgnoreCase(s3);
        System.out.println("s1 equals s3: " + isEqual); // false
        System.out.println("s1 equalsIgnoreCase s3: " + isEqualIgnoreCase); // true

        // split()
        String[] words = s1.split(" ");
        System.out.println("s1 split:");
        for (String word : words) {
            System.out.println(word); // 'Rikkei' và 'academy'
        }

        // concat()
        String concatenatedStr = s1.concat(" - Learn and Grow");
        System.out.println("s1 concat: " + concatenatedStr); // 'Rikkei academy - Learn and Grow'

        // contains()
        boolean contains = s1.contains("academy");
        System.out.println("s1 contains 'academy': " + contains); // true

        // toUpperCase()
        String upperS1 = s1.toUpperCase();
        System.out.println("s1 toUpperCase: " + upperS1); // 'RIKKEI ACADEMY'

        // toLowerCase()
        String lowerS1 = s1.toLowerCase();
        System.out.println("s1 toLowerCase: " + lowerS1); // 'rikkei academy'

        // replace()
        String replacedS1 = s1.replace("academy", "school");
        System.out.println("s1 replace 'academy' with 'school': " + replacedS1); // 'Rikkei school'

        // length()
        int lengthS1 = s1.length();
        int lengthS2 = s2.length();
        System.out.println("s1 length: " + lengthS1); // 14
        System.out.println("s2 length: " + lengthS2); // 0
    }
}
