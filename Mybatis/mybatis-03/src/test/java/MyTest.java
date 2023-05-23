import MyBatis.dao.StudentMapper;
import MyBatis.pojo.Student;
import MyBatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {
    @Test
    public void test(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Map map = new HashMap<>();
        map.put("id",1);
        List<Student> students = mapper.getStudents(map);
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }
    @Test
    public void test1(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Map map = new HashMap<>();
        map.put("id",1);
        map.put("name","小张");
        int i = mapper.updateStudent(map);
        System.out.println(i);
        session.commit();
        session.close();
    }
    @Test
    public void test2(){
        SqlSession session = MybatisUtils.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Map map = new HashMap<>();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        map.put("ids",ids);
        List<Student> students = mapper.getStudents(map);
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }
}
