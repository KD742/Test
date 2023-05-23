import MyBatis.dao.UserMapper;
import MyBatis.pojo.User;
import MyBatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyTest {
    static Logger logger = Logger.getLogger(MyTest.class);
    @Test
    public void test(){
        SqlSession session = MybatisUtils.getSession();
        List<User> users = session.selectList("MyBatis.dao.UserMapper.selectUser");
        for (User user:users
             ) {
            System.out.println(user);
        }
        session.close();
    }
    @Test
    public void test1(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }
    @Test
    public void test2(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int kd = mapper.addUser(new User(4, "kd", "123456"));
        session.commit();
        session.close();
        System.out.println(kd);
    }
    @Test
    public void Test3(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int kd = mapper.updateUser(new User(3, "kd", "123456"));
        session.commit();
        session.close();
        System.out.println(kd);
    }
    @Test
    public void Test4(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int i = mapper.deleteUser(1);
        session.commit();
        session.close();
        System.out.println(i);
    }
    @Test
    public void test5(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map map = new HashMap<>();
        map.put("id",1);
        map.put("name","张三");
        map.put("pwd","123456");
        int i = mapper.addUser2(map);
        session.commit();
        session.close();
        System.out.println(i);
    }
    @Test
    public void test6(){
        logger.info("info:进入selectUser方法");
        logger.debug("debug:进入selectUser方法");
        logger.error("error:进入selectUser方法");
        SqlSession session = MybatisUtils.getSession();
        List<User> users = session.selectList("MyBatis.dao.UserMapper.selectUser");
        for (User user:users
        ) {
            System.out.println(user);
        }
        session.close();
    }
    @Test
    public void test7(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        Map map = new HashMap<>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> users = mapper.selectUserByLimit(map);
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void test8(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser1();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
