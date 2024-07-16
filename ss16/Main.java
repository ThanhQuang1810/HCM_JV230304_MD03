package ss16;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new MyThread();

        t1.start();
        System.out.println("Main thread");
 Runnable t2=new Myrunnable() ;
   Thread t3=new Thread(t2);
      t3.start();
    }
}
