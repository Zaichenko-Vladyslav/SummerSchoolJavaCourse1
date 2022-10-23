package zaichenko.edu.course.service.group.interfaces;

import zaichenko.edu.course.model.Group;
import java.util.List;

public interface IGroupService {

    Group create(Group group);
    Group get(String id);
    Group delete(String id);
    Group update(Group group);
    List<Group> getAll();
}