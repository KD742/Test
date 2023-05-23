package MyBatis.dao;

import MyBatis.pojo.Student;
import MyBatis.pojo.Teacher;

import java.util.List;
import java.util.Map;

public interface StudentMapper {
    //获取所有学生及对应老师的信息
    List<Student> getStudents(Map map);

    Teacher getTeacher();
    int updateStudent(Map map);
}
