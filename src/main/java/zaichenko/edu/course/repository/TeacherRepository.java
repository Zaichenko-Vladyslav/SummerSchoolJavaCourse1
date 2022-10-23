package zaichenko.edu.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zaichenko.edu.course.model.Teacher;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher, String> {

}