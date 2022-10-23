package zaichenko.edu.course.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zaichenko.edu.course.model.Group;
import zaichenko.edu.course.service.group.impls.GroupServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/group")
public class GroupRestController {

    @Autowired
    GroupServiceImpl groupService;

    @GetMapping("/hello")
    String getHello() {
        return "<h1>Hello, from Group Controller</h1>";
    }

    @RequestMapping(value = "get/list", method = RequestMethod.GET)
    List<Group> getGroupList() {
        return groupService.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Group getGroup(@PathVariable("id") String id) {
        return groupService.get(id);
    }
}