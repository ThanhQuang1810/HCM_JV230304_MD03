package ss12.Bt3.business;

import ss12.Bt3.entity.Department;
import ss12.Bt3.entity.Employee;

import java.util.List;

public interface IEmployeeDesign extends IGenericDesign<Employee,String>{
    // Thống kê số lượng nhân viên trung bình của mỗi phòng
    int calEmployeeAvg();

    //Tìm ra 5 phòng có số lượng nhân viên đông nhất
List<Department> mostCrowded();

    //Tìm ra người quản lý nhiều nhân viên nhất
  Employee managerMostEmploy();
    //Tìm ra 5 nhân viên có tuổi cao nhất công ty
List<Employee> employeeAgeMax();
    //Tìm ra 5 nhân viên hưởng lương cao nhất
    List<Employee> employeeSalaryMax();
}
