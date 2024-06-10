
package Day3array;

import java.util.Scanner;

public class BTTH {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can xoa");
        int item = scanner.nextInt();
        int indexDelete = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                indexDelete = i;
                break;
            }
        }
        for (int i = indexDelete; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        ;
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");

        }

    }

}
// bt2
/**
 * BTTH
 */
// public class BTTH {

// public static void main(String[] args) {
// String[] students = { "Christian", "Michael", "Camila", "Sienna", "Tanya",
// "Connor", "Zachariah", "Mallory",
// "Zoe", "Emily" };
// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter a name’s student:");
// String input_name = scanner.nextLine();
// boolean isExist = true;
// for (int i = 0; i < students.length; i++) {
// if (students[i].equals(input_name)) {
// System.out.println("Position of the students in the list " + input_name +
// "is: " + i);
// isExist = false;
// break;
// }
// }
// if (isExist) {
// System.out.println("Not found" + input_name + " in the list.");
// }
// }
// }