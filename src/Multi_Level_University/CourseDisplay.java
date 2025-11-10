package Multi_Level_University;

class CourseDisplay {
    public static void displayCourses(List<? extends CourseType> courses) {
        System.out.println("\nCourse List:");
        for (CourseType c : courses) {
            c.evaluate();
        }
    }
}

