package ss12.Bt3.business;

import ss12.Bt3.entity.Department;
import ss12.Bt3.entity.Employee;

import java.util.Collections;
import java.util.List;

public class EmployeeBusiness implements IEmployeeDesign{
    @Override
    public int calEmployeeAvg() {
        return 0;
    }

    @Override
    public List<Department> mostCrowded() {
        return Collections.emptyList();
    }

    @Override
    public Employee managerMostEmploy() {
        return null;
    }

    @Override
    public List<Employee> employeeAgeMax() {
        return Collections.emptyList();
    }

    @Override
    public List<Employee> employeeSalaryMax() {
        return Collections.emptyList();
    }

    @Override
    public boolean create(Employee employee) {
        return false;
    }

    @Override
    public List<Employee> findAll() {
        return Collections.emptyList();
    }

    @Override
    public boolean update(Employee employee) {
        return false;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public Employee findById(String id) {
        return null;
    }
}
