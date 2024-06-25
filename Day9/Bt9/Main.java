package Day9.Bt9;

public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.showAll();

        studentManagement.addStudent(new Student("Quang",1, 7));
        studentManagement.addStudent(new Student("Anh",2, 5));
        studentManagement.showAll();

//        studentManagement.removeStudent(5);
//        studentManagement.removeStudent(1);
        System.out.println(studentManagement.findStudentById(1));
        System.out.println(studentManagement.getAverageScore());

        studentManagement.sortByScore();

    }
}
