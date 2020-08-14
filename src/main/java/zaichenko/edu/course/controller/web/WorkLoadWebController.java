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
import zaichenko.edu.course.service.teacher.impls.TeacherServiceImpl;
import zaichenko.edu.course.service.workLoad.impls.WorkLoadServiceImpl;

@Controller
@RequestMapping("/web/workLoad")
public class WorkLoadWebController {

    @Autowired
    WorkLoadServiceImpl workLoadService;

    @RequestMapping("/get/list")
    String showAll(Model model){
        model.addAttribute("list",workLoadService.getAll());
        return "workLoadlist";
    }
}