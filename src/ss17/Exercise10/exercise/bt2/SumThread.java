package src.Session21_Threading.exercise.bt2;

public class SumThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to 1000 is: " + sum);
    }

    public static void main(String[] args) {
//        Thread thread = new SumThread();
        SumThread thread = new SumThread();
        Thread thread1 = new Thread(thread);
        thread.start();
    }
}
