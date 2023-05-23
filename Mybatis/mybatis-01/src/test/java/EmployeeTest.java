import MyBatis.dao.EmployeeMapper;
import MyBatis.dao.UserMapper;
import MyBatis.pojo.Employee;
import MyBatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class EmployeeTest {
    @Test
    public void test1(){
        SqlSession session = MybatisUtils.getSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectById(2);
        System.out.println(employee);
    }
    @Test
    public void test2(){
        SqlSession session = MybatisUtils.getSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Employee employee = new Employee(2, "李四", 20, "实习生");
        int save = mapper.save(employee);
        System.out.println(save);
    }
    @Test
    public void test3(){
        SqlSession session = MybatisUtils.getSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Employee employee = new Employee(2, "李四", 22, "实习生");
        int modify = mapper.modify(employee);
        System.out.println(modify);
    }
    @Test
    public void test4(){
        SqlSession session = MybatisUtils.getSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        int remove = mapper.remove(2);
        System.out.println(remove);
    }
}
