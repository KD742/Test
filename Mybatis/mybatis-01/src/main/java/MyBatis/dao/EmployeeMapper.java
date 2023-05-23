package MyBatis.dao;

import MyBatis.pojo.Employee;

public interface EmployeeMapper {
    Employee selectById(int id);
    int save(Employee employee);
    int modify(Employee employee);
    int remove(int id);
}
