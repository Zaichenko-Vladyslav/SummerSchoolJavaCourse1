package zaichenko.edu.course.dao.teacher.interfaces;

import zaichenko.edu.course.model.Teacher;
import java.util.List;

public interface IDaoTeacher {

    Teacher create(Teacher teacher);
    Teacher get(String id);
    Teacher delete(String id);
    Teacher update(Teacher teacher);
    List<Teacher> getAll();
}