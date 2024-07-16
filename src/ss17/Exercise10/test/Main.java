package src.Session21_Threading.test;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.start();
        System.out.println("Kết thúc hàm main");
        Runnable t2 = new MyRunnable();
        Thread t3 = new Thread(t2);
        t3.start();


    }
}
