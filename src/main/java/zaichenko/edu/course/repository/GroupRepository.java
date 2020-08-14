package zaichenko.edu.course.repository;/*
 @author Vladyslav Zaichenko
 @since 09 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zaichenko.edu.course.model.Group;

@Repository
public interface GroupRepository extends MongoRepository<Group, String> {
}
