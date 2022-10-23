package zaichenko.edu.course.service.teacher.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zaichenko.edu.course.datastorage.DataFake;
import zaichenko.edu.course.model.Teacher;
import zaichenko.edu.course.repository.TeacherRepository;
import zaichenko.edu.course.service.teacher.interfaces.ITeacherService;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public Teacher create(Teacher teacher) {
        teacher.setCreatedAt(LocalDateTime.now());
        teacher.setUpdateAt(LocalDateTime.now());
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher get(String id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public Teacher update(Teacher teacher) {
        teacher.setUpdateAt(LocalDateTime.now());
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher delete(String id) {
        Teacher teacher = this.get(id);
        teacherRepository.deleteById(teacher.getId());
        return teacher;
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    public void reloadDataBase() {
        dataFake.init();
    }
}