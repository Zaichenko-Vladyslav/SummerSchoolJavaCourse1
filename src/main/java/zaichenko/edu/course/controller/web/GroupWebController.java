package zaichenko.edu.course.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zaichenko.edu.course.service.group.impls.GroupServiceImpl;

@Controller
@RequestMapping("web/group")
public class GroupWebController {

    @Autowired
    GroupServiceImpl groupService;

    @RequestMapping("get/list")
    String showAll(Model model) {
        model.addAttribute("list", groupService.getAll());
        return "groupList";
    }
}