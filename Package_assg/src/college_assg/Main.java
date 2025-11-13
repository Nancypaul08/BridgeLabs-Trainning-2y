package college_assg;

import college_assg.faculty.Faculty;
import college_assg.students.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Faculty f1 = new Faculty();

        s1.displayStudent("Nancy", 101);
        f1.displayFaculty("Mr. Sharma", "Computer Networks");
    }
}