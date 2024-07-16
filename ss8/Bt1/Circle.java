package ss8.Bt1;

public class Circle implements IResizable {
    private double size;

    public Circle(double size) {
        this.size = size;
    }

    public Circle() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double area() {
        return size * size * Math.PI;
    }


    @Override
    public void resize(double percent) {
        this.size += this.size * percent;
    }
}
