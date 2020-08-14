package zaichenko.edu.course.service.teacher.interfaces;/*
 @author Vladyslav Zaichenko
 @since 08 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import zaichenko.edu.course.model.Teacher;

import java.util.List;

public interface ITeacherService {

    // crud
    Teacher create (Teacher teacher);
    Teacher get(String id);
    Teacher delete (String id);
    Teacher update (Teacher teacher);
    List<Teacher> getAll();

}
