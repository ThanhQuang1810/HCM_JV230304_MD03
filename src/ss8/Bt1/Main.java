package src.ss8.Bt1;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(4);
        System.out.println(c1.area());
        c1.resize(0.5);
        System.out.println(c1.area());
    }
}
