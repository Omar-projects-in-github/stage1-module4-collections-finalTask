package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> projectList = new ArrayList<>();

        for (Map.Entry<String, Set<String>> element : projects.entrySet()) {
            Set<String> developers = element.getValue();
            if (developers.contains(developer))
                projectList.add(element.getKey());
        }

        Collections.sort(projectList, new ProjectNameComparator());
        return projectList;
    }
}

class ProjectNameComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        int lengthComparison = Integer.compare(str2.length(), str1.length());

        if (lengthComparison != 0)
            return lengthComparison;
        else
            return str2.compareTo(str1);
    }
}
