package Multi_Level_University;

public class Main {
    public static void main(String[] args) {

        // Department 1: Exam-based courses
        Course<ExamCourse> examDept = new Course<>();
        examDept.addCourse(new ExamCourse("Mathematics"));
        examDept.addCourse(new ExamCourse("Physics"));

        // Department 2: Assignment-based courses
        Course<AssignmentCourse> assignmentDept = new Course<>();
        assignmentDept.addCourse(new AssignmentCourse("Computer Programming"));
        assignmentDept.addCourse(new AssignmentCourse("Data Structures"));

        // Department 3: Research-based courses
        Course<ResearchCourse> researchDept = new Course<>();
        researchDept.addCourse(new ResearchCourse("Machine Learning Research"));
        researchDept.addCourse(new ResearchCourse("Cybersecurity Research"));

        // Display all types using Wildcard Method
        CourseDisplay.displayCourses(examDept.getCourses());
        CourseDisplay.displayCourses(assignmentDept.getCourses());
        CourseDisplay.displayCourses(researchDept.getCourses());
    }
}

