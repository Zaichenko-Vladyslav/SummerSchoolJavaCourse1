package zaichenko.edu.course.datastorage;/*
 @author Vladyslav Zaichenko
 @since 08 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import zaichenko.edu.course.model.Group;
import zaichenko.edu.course.model.Teacher;
import zaichenko.edu.course.model.WorkLoad;
import zaichenko.edu.course.repository.GroupRepository;
import zaichenko.edu.course.repository.TeacherRepository;
import zaichenko.edu.course.repository.WorkLoadRepository;

import javax.annotation.PostConstruct;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    WorkLoadRepository workLoadRepository;

    private List<Teacher> teachers = new LinkedList<>(
            Arrays.asList(
                    new Teacher("Anastasiia", "Havryliuk","teacher","+380668423900",10),
                    new Teacher("Vlad", "Zaichenko","teacher","+380973793905",10),
                    new Teacher("Viktor", "Stepanov","teacher","+380964536863",9),
                    new Teacher("Oleh", "Shevchenko","teacher","+380954638753",3)
            )
    );

    private List<Group> groups = new LinkedList<>(
            Arrays.asList(
                    new Group("group 1", "Digital Economy","FIT","description",25),
                    new Group("group 2", "Software Engineering","FFO","description",20),
                    new Group("group 2", "Software Engineering","FFO","description",20),
                    new Group("group 2", "Software Engineering","FFO","description",20),
                    new Group("group 3", "Computer Science","FKT","description",15)
            )
    );

    private List<WorkLoad> workLoads = new LinkedList<>(
            Arrays.asList(
                    new WorkLoad(groups.get(0),teachers.get(0),"nirjbe","C#",120,8.10),
                    new WorkLoad(groups.get(1),teachers.get(1),"java","vreovn",160,8.90),
                    new WorkLoad(groups.get(1),teachers.get(1),"java","vreovn",160,8.90),
                    new WorkLoad(groups.get(1),teachers.get(1),"java","vreovn",160,8.90),
                    new WorkLoad(groups.get(2),teachers.get(2),"Ruby","erv",150,9.80)
            )
    );

    @PostConstruct
    public void init(){
        teacherRepository.deleteAll();
        teacherRepository.saveAll(teachers);
        groupRepository.deleteAll();
        groupRepository.saveAll(groups);
        workLoadRepository.deleteAll();
        workLoadRepository.saveAll(workLoads);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<WorkLoad> getWorkLoads() {
        return workLoads;
    }

    public void setWorkLoads(List<WorkLoad> workLoads) {
        this.workLoads = workLoads;
    }
}
