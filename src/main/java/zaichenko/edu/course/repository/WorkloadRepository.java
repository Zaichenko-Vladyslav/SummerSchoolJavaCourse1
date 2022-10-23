package zaichenko.edu.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zaichenko.edu.course.model.Workload;

@Repository
public interface WorkloadRepository extends MongoRepository<Workload, String> {

}