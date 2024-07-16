package src.ss21.test;

public class MyRunnable implements Runnable {
    public void run() {
        for (int i = -1; i >= -100; i--) {
            System.out.println("Thread is running" + i);
            try {
                Thread.sleep(500); // Ngủ 1 giây
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
