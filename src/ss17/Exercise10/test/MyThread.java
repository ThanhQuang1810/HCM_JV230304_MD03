package src.Session21_Threading.test;

public class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread is running" + i);
            try {
                Thread.sleep(1000); // Ngủ 1 giây
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
