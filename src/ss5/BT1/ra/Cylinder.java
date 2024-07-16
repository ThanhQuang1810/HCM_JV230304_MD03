package src.ss5.BT1.ra;

public class Cylinder extends Circle {
    // Thuộc tính
    private double height;

    // Phương thức khởi tạo
    public Cylinder() {
        super(); // Gọi phương thức khởi tạo mặc định của lớp Circle
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius); // Gọi phương thức khởi tạo của lớp Circle với radius
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius); // Gọi phương thức khởi tạo của lớp Circle với radius
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color); // Gọi phương thức khởi tạo của lớp Circle với radius và color
        this.height = height;
    }

    // Getter và Setter cho height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Phương thức tính thể tích
    public double getVolume() {
        return getArea() * height;
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() + ", height=" + height + ", color=" + getColor() + "]";
    }

}
