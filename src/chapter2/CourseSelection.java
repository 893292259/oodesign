package chapter2;

import java.util.Observable;

public class CourseSelection {
    public static void main(String... args){
        Course course = new Course();
        teacher t = new teacher();
        course.addObserver(t);
        course.changescore(1,2,3);
        course.changescore(111,121,21);
        course.deleteObserver(t);
        course.changescore(22,2,1);
    }
}
