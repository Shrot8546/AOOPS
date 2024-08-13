public class EnrollmentManager implements IEnrollmentService {
    private final IStudentRepository studentRepository;
    private final ICourseRepository courseRepository;

    public EnrollmentManager(IStudentRepository studentRepository, ICourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void enrollStudentInCourse(String studentId, String courseId) {
        Student student = studentRepository.getStudentById(studentId);
        Course course = courseRepository.getCourseById(courseId);

        if (student == null) {
            throw new IllegalArgumentException("Student not found with ID: " + studentId);
        }

        if (course == null) {
            throw new IllegalArgumentException("Course not found with ID: " + courseId);
        }

        student.enrollInCourse(course);
        course.addStudent(student);
    }
}
