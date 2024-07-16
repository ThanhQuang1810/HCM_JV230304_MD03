package ss14;

public class InsertionSort {

    // Phương thức sắp xếp chèn
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            for (int j = i; j > 0; --j) {
                if (array[j - 1] > array[j]) {
                    // Hoán đổi array[j] và array[j - 1]
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    // Nếu không cần hoán đổi thì thoát khỏi vòng lặp
                    break;
                }
            }
        }
    }

    // Phương thức hiển thị mảng
    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Phương thức chính
    public static void main(String[] args) {
        // Mảng chưa được sắp xếp
        int[] array = {29, 10, 14, 37, 13, 25, 21, 45,1};
        System.out.println("Mảng ban đầu:");
        printArray(array);

        insertionSort(array);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(array);
    }
}
