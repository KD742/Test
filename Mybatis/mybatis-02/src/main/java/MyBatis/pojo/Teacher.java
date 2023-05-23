package MyBatis.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data

public class Teacher {
    private int id;
    private String name;
    private List<Student> students;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
