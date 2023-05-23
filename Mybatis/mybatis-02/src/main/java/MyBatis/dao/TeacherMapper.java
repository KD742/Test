package MyBatis.dao;

import MyBatis.pojo.Student;
import MyBatis.pojo.Teacher;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {
    Teacher getTeacher(int id);
}
