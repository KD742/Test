package MyBatis.dao;

import MyBatis.pojo.Student;
import MyBatis.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    //获取所有学生及对应老师的信息
    List<Student> getStudents();

    Teacher getTeacher();
}
