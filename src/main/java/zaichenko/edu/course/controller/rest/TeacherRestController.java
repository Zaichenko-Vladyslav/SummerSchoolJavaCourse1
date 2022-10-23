package zaichenko.edu.course.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import zaichenko.edu.course.model.Teacher;
import zaichenko.edu.course.service.teacher.impls.TeacherServiceImpl;
import java.util.List;

@RestController
@RequestMapping ("/api/teacher")
public class TeacherRestController {

    @Autowired
    TeacherServiceImpl teacherService;

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello, from Teacher Controller</h1>";
    }

    @RequestMapping(value = "get/list", method = RequestMethod.GET)
    List<Teacher> getTeacherList() {
        return teacherService.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    Teacher getTeacher(@PathVariable("id") String id) {
        return teacherService.get(id);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    Teacher deleteTeachers(@PathVariable("id") String id) {
        return teacherService.delete(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Teacher createTeachers(@RequestBody Teacher teacher) {
        return teacherService.create(teacher);
    }
}