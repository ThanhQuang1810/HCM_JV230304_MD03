package src.Session21_Threading.exercise.bt1;

public class TimeCounter implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Second: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println("Counting finished.");
    }

    public static void main(String[] args) {
        TimeCounter counter = new TimeCounter();
        Thread thread = new Thread(counter);
        thread.start();
//        Thread thread = new Thread(new TimeCounter());
//        thread.start();
    }
}
