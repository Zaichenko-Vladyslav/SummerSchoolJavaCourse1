package zaichenko.edu.course.controller.web;/*
 @author Vladyslav Zaichenko
 @since 09 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zaichenko.edu.course.form.TeacherForm;
import zaichenko.edu.course.model.Teacher;
import zaichenko.edu.course.service.teacher.impls.TeacherServiceImpl;

import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/web/teacher")
public class TeacherWebController {
    @Autowired
    TeacherServiceImpl teacherService;

    @RequestMapping("/get/list")
    String showAll(Model model) {
        model.addAttribute("list", teacherService.getAll());
        return "teacherlist";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteTeacher(@PathVariable("id") String id, Model model) {
        teacherService.delete(id);
        model.addAttribute("list", teacherService.getAll());
        return "redirect:/web/teacher/get/list";
    }

    @RequestMapping(value = "/reloadDB", method = RequestMethod.GET)
    String reloadDataBase() {
        teacherService.reloadDataBase();
        return "redirect:/web/teacher/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createTeacher(Model model){
        TeacherForm teacherForm = new TeacherForm();
        model.addAttribute("teacherForm", teacherForm);
        return "addTeacher";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createTeacher(Model model, @ModelAttribute("teacherForm") TeacherForm teacherForm){
        Teacher teacher = new Teacher();
        teacher.setName(teacherForm.getName());
        teacher.setDescription(teacherForm.getDescription());
        teacher.setTelephone(teacherForm.getTelephone());
        teacherService.create(teacher);

        model.addAttribute("teachers",teacherService.getAll());
        return "redirect:/web/teacher/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateTeacher(@PathVariable("id") String id, Model model){
        Teacher teacher = teacherService.get(id);
        TeacherForm teacherForm = new TeacherForm(
             teacher.getId(),
             teacher.getName(),
             teacher.getSurname(),
             teacher.getDescription(),
             teacher.getTelephone(),
                teacher.getExperience()
        );
        model.addAttribute("teacherForm", teacherForm);
        return "updateTeacher";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateTeacher(Model model, @PathVariable("id") String id, @ModelAttribute("teacherForm") TeacherForm teacherForm){
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(teacherForm.getName());
        teacher.setDescription(teacherForm.getDescription());
        teacher.setTelephone(teacherForm.getDescription());
        teacherService.update(teacher);

        model.addAttribute("teachers",teacherService.getAll());
        return "redirect:/web/teacher/get/list";
    }
}


