package ss5.BTTH1.ra;

public class Dog extends Animal {
    private String color;

    public Dog() {

    }

    public Dog(String name, String color) {
        super(name);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String makeSound() {
        return "Woof";
    }
}
