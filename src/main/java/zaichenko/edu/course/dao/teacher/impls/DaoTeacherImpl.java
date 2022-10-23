package zaichenko.edu.course.dao.teacher.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zaichenko.edu.course.dao.teacher.interfaces.IDaoTeacher;
import zaichenko.edu.course.datastorage.DataFake;
import zaichenko.edu.course.model.Teacher;
import java.util.List;

@Repository
public class DaoTeacherImpl implements IDaoTeacher {

    @Autowired
    DataFake dataFake;

    @Override
    public Teacher create(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher get(String id) {
        return null;
    }

    @Override
    public Teacher delete(String id) {
        return null;
    }

    @Override
    public Teacher update(Teacher teacher) {
        return null;
    }

    @Override
    public List<Teacher> getAll() {
        return null;
    }
}