package zaichenko.edu.course.datastorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zaichenko.edu.course.model.Group;
import zaichenko.edu.course.model.Teacher;
import zaichenko.edu.course.model.Workload;
import zaichenko.edu.course.repository.GroupRepository;
import zaichenko.edu.course.repository.TeacherRepository;
import zaichenko.edu.course.repository.WorkloadRepository;
import javax.annotation.PostConstruct;
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
    WorkloadRepository workLoadRepository;

    private List<Teacher> teachers = new LinkedList<>(
            Arrays.asList(
                    new Teacher("Viktor", "Surname",
                            "teacher","+380964536863",10),
                    new Teacher("Vlad", "Zaichenko",
                            "teacher","+380975173862",6),
                    new Teacher("Oleh", "Surname",
                            "teacher","+380954638753",3)
            )
    );

    private List<Group> groups = new LinkedList<>(
            Arrays.asList(
                    new Group("group 1", "Digital Economy",
                            "FIT","description",25),
                    new Group("group 2", "Design",
                            "FIT","description",20),
                    new Group("group 3", "Computer Science",
                            "FIT","description",15)
            )
    );

    private List<Workload> workloads = new LinkedList<>(
            Arrays.asList(
                    new Workload(groups.get(0), teachers.get(0), "java", 10, 8.87),
                    new Workload(groups.get(0), teachers.get(0), "java", 10, 8.87),
                    new Workload(groups.get(0), teachers.get(0), "java", 10, 8.87)
            )
    );

    @PostConstruct
    public void init(){
        teacherRepository.deleteAll();
        teacherRepository.saveAll(teachers);
        groupRepository.deleteAll();
        groupRepository.saveAll(groups);
        workLoadRepository.deleteAll();
        workLoadRepository.saveAll(workloads);
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
}