public class Main {
    public static void main(String[] args) {
        // Setup repositories
        IStudentRepository studentRepo = new InMemoryStudentRepository();
        ICourseRepository courseRepo = new InMemoryCourseRepository();

        // Create some students and courses
        Student student = new Student("S1", "John Doe");
        Course course = new Course("C1", "Introduction to Programming");

        studentRepo.addStudent(student);
        courseRepo.addCourse(course);

        // Create an EnrollmentManager
        IEnrollmentService enrollmentService = new EnrollmentManager(studentRepo, courseRepo);

        // Enroll the student in the course
        enrollmentService.enrollStudentInCourse("S1", "C1");

        // Output the results
        Student enrolledStudent = studentRepo.getStudentById("S1");
        System.out.println(enrolledStudent.getName() + " is enrolled in:");
        for (Course enrolledCourse : enrolledStudent.getEnrolledCourses()) {
            System.out.println("- " + enrolledCourse.getCourseName());
        }
    }
}
