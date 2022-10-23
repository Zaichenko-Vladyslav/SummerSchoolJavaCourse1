package zaichenko.edu.course.service.group.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zaichenko.edu.course.model.Group;
import zaichenko.edu.course.repository.GroupRepository;
import zaichenko.edu.course.service.group.interfaces.IGroupService;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class GroupServiceImpl implements IGroupService {

    @Autowired
    GroupRepository groupRepository;

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
}