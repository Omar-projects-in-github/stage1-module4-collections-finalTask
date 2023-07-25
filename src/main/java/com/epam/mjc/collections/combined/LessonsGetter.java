package com.epam.mjc.collections.combined;

import java.util.*;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> lessonsSet = new HashSet<>();

        for (Map.Entry<String, List<String>> weekdayLessons : timetable.entrySet()) {
            List<String> listOfLessonsPerDay = weekdayLessons.getValue();
            lessonsSet.addAll(listOfLessonsPerDay);
        }

        return lessonsSet;
    }
}
