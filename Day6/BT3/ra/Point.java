package Day6.BT3.ra;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    //ktra:
    public static void main(String[] args) {
        // Test the Point class
        Point point = new Point(2.5f, 3.5f);

        System.out.println("Point coordinates: " + point);

        // Test setters and getters
        point.setX(4.0f);
        point.setY(5.0f);

        System.out.println("Updated point coordinates: " + point);
    }
}
