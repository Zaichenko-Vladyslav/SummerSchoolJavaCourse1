package zaichenko.edu.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zaichenko.edu.course.model.Group;

@Repository
public interface GroupRepository extends MongoRepository<Group, String> {

}