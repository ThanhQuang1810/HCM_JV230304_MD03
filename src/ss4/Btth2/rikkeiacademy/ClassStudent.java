package src.ss4.Btth2.rikkeiacademy;

public class ClassStudent {
    String studentId, studentName, sex, className, age, address;

    public ClassStudent(String studentId, String studentName, String sex, String className, String age,
            String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public String display() {
        return " student " + studentId + " studentName " + studentName + " sex " + sex + " className " + className
                + " age " + age + " address " + address;
    }
}