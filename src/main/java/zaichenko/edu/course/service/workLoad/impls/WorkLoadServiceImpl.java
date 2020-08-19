package zaichenko.edu.course.service.workLoad.impls;/*
 @author Vladyslav Zaichenko
 @since 09 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zaichenko.edu.course.datastorage.DataFake;
import zaichenko.edu.course.model.Teacher;
import zaichenko.edu.course.model.WorkLoad;
import zaichenko.edu.course.repository.WorkLoadRepository;
import zaichenko.edu.course.service.workLoad.interfaces.IWorkLoadService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class WorkLoadServiceImpl implements IWorkLoadService {

    @Autowired
    WorkLoadRepository workLoadRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public WorkLoad create(WorkLoad workLoad) {
        workLoad.setCreatedAt(LocalDateTime.now());
        workLoad.setUpdateAt(LocalDateTime.now());
        return workLoadRepository.save(workLoad);
    }

    @Override
    public WorkLoad get(String id) {
        return workLoadRepository.findById(id).orElse(null);
    }

    @Override
    public WorkLoad delete(String id) {
        WorkLoad workLoad = this.get(id);
        workLoadRepository.deleteById(workLoad.getId());
        return workLoad;
    }

    @Override
    public WorkLoad update(WorkLoad workLoad) {
        workLoad.setUpdateAt(LocalDateTime.now());
        return workLoadRepository.save(workLoad);
    }

    @Override
    public List<WorkLoad> getAll() {
        return workLoadRepository.findAll();
    }

    public void reloadDataBase()
    {
        dataFake.init();
    }
}
