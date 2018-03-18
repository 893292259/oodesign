package chapter2;

import java.util.*;

public class teacher implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        List<Float> scores = new ArrayList();
        scores.add(course.getEnglish());
        scores.add(course.getChinese());
        scores.add(course.getMath());
        Float maxScore = scores.stream().max(Comparator.comparing(Float::intValue)).get();
        System.out.println(maxScore);
    }
}
