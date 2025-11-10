package Multi_Level_University;

import java.util.ArrayList;
import java.util.List;

class Course<T extends CourseType> {
    private List<T> offeredCourses = new ArrayList<>();

    public void addCourse(T course) {
        offeredCourses.add(course);
    }

    public List<T> getCourses() {
        return offeredCourses;
    }
}

