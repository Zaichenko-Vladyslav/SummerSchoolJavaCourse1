package zaichenko.edu.course.service.workload.interfaces;

import zaichenko.edu.course.model.Workload;
import java.util.List;

public interface IWorkloadService {

    Workload create(Workload workload);
    Workload get(String id);
    Workload delete(String id);
    Workload update(Workload workload);
    List<Workload> getAll();
}