package src.ss9.Bt9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showAll() {
        if (students.isEmpty()) System.out.println("Ko có hs");
        else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
    public void removeStudent(int studentId) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == studentId) {
                students.remove(i);
                System.out.println("Xóa học sinh có mã " + studentId + " thành công!!!");
                return;
            }
        }
        System.out.println("Không tìm thấy id");
    }
    public Student findStudentById(int studentId) {
        boolean isExist = false;
        Student studentFind = null;
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                studentFind = student;
                isExist = true;
                break;
            }
        }
        if (isExist) {
            System.out.println("Tìm thấy học sinh có mã " + studentId + " thành công!!!");
            return studentFind;
        }

        return null;
    }

    //Phương thức getAverageScore tính và trả về điểm trung bình của tất cả student.
    public double getAverageScore() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageScore();
        }
        return sum / students.size();
    }

    //Phương thức sortByScore sắp xếp sinh viên theo điểm tăng dần.
    public void sortByScore() {
        students.sort(Comparator.comparing(Student::getAverageScore));
        System.out.println("Sắp xếp sinh viên theo điểm tăng dần thành công!!!");
        showAll();
    }
}



