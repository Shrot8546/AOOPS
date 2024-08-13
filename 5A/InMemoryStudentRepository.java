import java.util.HashMap;
import java.util.Map;

// In-memory student repository
public class InMemoryStudentRepository implements IStudentRepository {
    private final Map<String, Student> students = new HashMap<>();

    @Override
    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    @Override
    public Student getStudentById(String studentId) {
        return students.get(studentId);
    }
}

// In-memory course repository
