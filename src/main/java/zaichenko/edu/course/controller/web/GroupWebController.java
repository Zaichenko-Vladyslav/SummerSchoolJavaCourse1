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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zaichenko.edu.course.form.GroupForm;
import zaichenko.edu.course.model.Group;
import zaichenko.edu.course.service.group.impls.GroupServiceImpl;

import java.util.List;
import java.util.Map;

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

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteGroup(@PathVariable("id") String id, Model model) {
        groupService.delete(id);
        model.addAttribute("list", groupService.getAll());
        return "redirect:/web/group/get/list";
    }

    @RequestMapping(value = "/reloadDB", method = RequestMethod.GET)
    String reloadDataBase() {
        groupService.reloadDataBase();
        return "redirect:/web/group/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createGroup(Model model){
        GroupForm groupForm = new GroupForm();
        model.addAttribute("groupForm", groupForm);
        return "addGroup";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createGroup(Model model, @ModelAttribute("groupForm") GroupForm groupForm){
        Group group = new Group();
        group.setName(groupForm.getName());
        group.setSpecialty(groupForm.getSpecialty());
        group.setDescription(groupForm.getDescription());
        groupService.create(group);

        model.addAttribute("groups",groupService.getAll());
        return "redirect:/web/group/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateGroup(@PathVariable("id") String id, Model model){
        Group group = groupService.get(id);
        GroupForm groupForm = new GroupForm(
                group.getId(),
                group.getName(),
                group.getSpecialty(),
                group.getDescription(),
                group.getDepartment(),
                group.getAmountOfStudents()
        );
        model.addAttribute("groupForm", groupForm);
        return "updateGroup";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateGroup(Model model, @PathVariable("id") String id, @ModelAttribute("groupForm") GroupForm groupForm){
        Group group = new Group();
        group.setId(id);
        group.setName(groupForm.getName());
        group.setSpecialty(groupForm.getDescription());
        group.setDescription(groupForm.getDescription());
        groupService.update(group);

        model.addAttribute("groups",groupService.getAll());
        return "redirect:/web/group/get/list";
    }
}
