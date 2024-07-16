package src.ss2;

public class Bt6 {
    public static void main(String[] args) {
        int a = 1;
        while (!(a % 5 == 0 && a % 7 == 0 && a % 11 == 0)) {
            a++;
        }
        System.out.println(a);
    }
}
