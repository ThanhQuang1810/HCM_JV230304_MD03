package src.ss11.Bt7;

import java.util.Scanner;
import java.util.Stack;

public class Bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character>stack = new Stack<>();
        System.out.println("Nhap chuoi: ");
        String input = scanner.nextLine().trim().toLowerCase();

        for(Character c : input.toCharArray())stack.push(c);
        boolean isFlag = true;
while (!stack.isEmpty()) {
                Character fisrtChar= stack.pop();
                for (Character c : stack) {
                    if (fisrtChar == c) {
                        isFlag = false;
                        break;
                    }
    }
}
if (isFlag) System.out.println("Giam dan");
else System.out.println("Khong giam dan");
    }}