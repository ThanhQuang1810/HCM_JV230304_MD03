package ss12.Bt3.business;

import ss12.Bt3.entity.Department;

public interface IDepartmentDesign extends IGenericDesign <Department,String>{
    boolean existDepartmentId(Integer departmentId );

}
