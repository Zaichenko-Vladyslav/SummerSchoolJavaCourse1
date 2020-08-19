package zaichenko.edu.course.service.group.impls;/*
 @author Vladyslav Zaichenko
 @since 09 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zaichenko.edu.course.datastorage.DataFake;
import zaichenko.edu.course.model.Group;
import zaichenko.edu.course.model.Teacher;
import zaichenko.edu.course.repository.GroupRepository;
import zaichenko.edu.course.repository.TeacherRepository;
import zaichenko.edu.course.service.group.interfaces.IGroupService;
import zaichenko.edu.course.service.teacher.interfaces.ITeacherService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class GroupServiceImpl implements IGroupService {

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public Group create(Group group) {
        group.setCreatedAt(LocalDateTime.now());
        group.setUpdateAt(LocalDateTime.now());
        return groupRepository.save(group);
    }

    @Override
    public Group get(String id) {
        return groupRepository.findById(id).orElse(null);
    }

    @Override
    public Group delete(String id) {
        Group group = this.get(id);
        groupRepository.deleteById(group.getId());
        return group;
    }

    @Override
    public Group update(Group group) {
        group.setUpdateAt(LocalDateTime.now());
        return groupRepository.save(group);
    }

    @Override
    public List<Group> getAll() {
        return groupRepository.findAll();
    }

    public void reloadDataBase()
    {
        dataFake.init();
    }
}

