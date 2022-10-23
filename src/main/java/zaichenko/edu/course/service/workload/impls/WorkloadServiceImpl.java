package zaichenko.edu.course.service.workload.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zaichenko.edu.course.model.Workload;
import zaichenko.edu.course.repository.WorkloadRepository;
import zaichenko.edu.course.service.workload.interfaces.IWorkloadService;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class WorkloadServiceImpl implements IWorkloadService {

    @Autowired
    WorkloadRepository workloadRepository;

    @Override
    public Workload create(Workload workload) {
        workload.setCreatedAt(LocalDateTime.now());
        workload.setUpdateAt(LocalDateTime.now());
        return workloadRepository.save(workload);
    }

    @Override
    public Workload get(String id) {
        return workloadRepository.findById(id).orElse(null);
    }

    @Override
    public Workload delete(String id) {
        Workload workload = this.get(id);
        workloadRepository.deleteById(workload.getId());
        return workload;
    }

    @Override
    public Workload update(Workload workload) {
        workload.setUpdateAt(LocalDateTime.now());
        return workloadRepository.save(workload);
    }

    @Override
    public List<Workload> getAll() {
        return workloadRepository.findAll();
    }
}