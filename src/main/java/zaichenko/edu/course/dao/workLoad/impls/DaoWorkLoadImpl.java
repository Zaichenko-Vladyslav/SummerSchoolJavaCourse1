package zaichenko.edu.course.dao.workLoad.impls;/*
 @author Vladyslav Zaichenko
 @since 09 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zaichenko.edu.course.dao.workLoad.interfaces.IDaoWorkLoad;
import zaichenko.edu.course.datastorage.DataFake;
import zaichenko.edu.course.model.WorkLoad;

import java.util.List;

@Repository
public class DaoWorkLoadImpl implements IDaoWorkLoad {

    @Autowired
    DataFake dataFake;

    @Override
    public WorkLoad create(WorkLoad workLoad) {
        return null;
    }

    @Override
    public WorkLoad get(String id) {
        return null;
    }

    @Override
    public WorkLoad delete(String id) {
        return null;
    }

    @Override
    public WorkLoad update(WorkLoad workLoad) {
        return null;
    }

    @Override
    public List<WorkLoad> getAll() {
        return null;
    }
}
