package zaichenko.edu.course.controller.web;/*
 @author Vladyslav Zaichenko
 @since 09 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import zaichenko.edu.course.service.group.impls.GroupServiceImpl;
import zaichenko.edu.course.service.teacher.impls.TeacherServiceImpl;

@Controller
@RequestMapping("web/group")
public class GroupWebController {
    @Autowired
    GroupServiceImpl groupService;

    @RequestMapping("get/list")
    String showAll(Model model){
        model.addAttribute("list",groupService.getAll());
        return "grouplist";
    }
}