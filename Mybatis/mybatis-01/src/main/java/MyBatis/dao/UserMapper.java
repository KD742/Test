package MyBatis.dao;

import MyBatis.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from user")
    List<User> selectUser1();

    List<User> selectUser();
    List<User> selectUserByLimit(Map map);
    User getUserById(int id);
    int addUser(User user);
    int addUser2(Map map);
    int updateUser(User user);
    int deleteUser(int id);
}
