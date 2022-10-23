package zaichenko.edu.course.dao.workload.interfaces;

import zaichenko.edu.course.model.Workload;
import java.util.List;

public interface IDaoWorkload {

    Workload create(Workload workLoad);
    Workload get(String id);
    Workload delete(String id);
    Workload update(Workload workLoad);
    List<Workload> getAll();
}