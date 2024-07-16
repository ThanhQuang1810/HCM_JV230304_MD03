package src.ss9.Bt9;

public class Student {
    private String name;
    private int StudentId;
    private double averageScore;




    //constructor
    public Student(String name, int StudentId, double averageScore) {
        this.name = name;
        this.StudentId = StudentId;
        this.averageScore = averageScore;
    }

    ;

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return StudentId;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", StudentId=" + StudentId +
                ", averageScore=" + averageScore +
                '}';
    }
}


