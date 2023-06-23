package hw5;

import java.util.List;
import java.util.stream.Collectors;

public class StudyGroupService {
    public Student getStudentByIdFromStudyGroup(Integer id, List<StudyGroup> groups){
        return groups.stream().flatMap(g -> g.getStudents().stream().filter(s -> s.getId()==id)).collect(Collectors.toList()).get(0);
    }

}
