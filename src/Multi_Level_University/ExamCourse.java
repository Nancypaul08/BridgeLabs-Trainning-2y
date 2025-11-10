package Multi_Level_University;

class ExamCourse extends CourseType {
    public ExamCourse(String name) {
        super(name);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " → Evaluated through **Final Exam**");
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) {
        super(name);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " → Evaluated through **Assignments**");
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String name) {
        super(name);
    }

    @Override
    public void evaluate() {
        System.out.println(getCourseName() + " → Evaluated through **Research Project**");
    }
}
