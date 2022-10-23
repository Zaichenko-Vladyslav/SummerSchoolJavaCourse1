package zaichenko.edu.course.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zaichenko.edu.course.model.Workload;
import zaichenko.edu.course.service.workload.impls.WorkloadServiceImpl;
import java.util.List;

@RestController
@RequestMapping("/api/workload")
public class WorkloadRestController {

    @Autowired
    WorkloadServiceImpl workloadService;

    @GetMapping("/hello")
    String getHello() {
        return "<h1>Hello, from Workload Controller</h1>";
    }

    @RequestMapping(value = "get/list", method = RequestMethod.GET)
    List<Workload> getWorkloadList() {
        return workloadService.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Workload getWorkload(@PathVariable("id") String id) {
        return workloadService.get(id);
    }
}