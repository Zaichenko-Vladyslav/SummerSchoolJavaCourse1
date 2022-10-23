package zaichenko.edu.course.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zaichenko.edu.course.service.workload.impls.WorkloadServiceImpl;

@Controller
@RequestMapping("/web/workload")
public class WorkloadWebController {

    @Autowired
    WorkloadServiceImpl workloadService;

    @RequestMapping("/get/list")
    String showAll(Model model) {
        model.addAttribute("list", workloadService.getAll());
        return "workloadList";
    }
}