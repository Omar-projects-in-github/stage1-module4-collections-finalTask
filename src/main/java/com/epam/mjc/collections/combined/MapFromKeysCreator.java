package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> map = new HashMap<>();

        for (Map.Entry<String, Integer> element : sourceMap.entrySet()) {
            String key = element.getKey();
            int lengthOfWord = key.length();
            Set<String> temporarySet = new HashSet<>();
            if (map.containsKey(lengthOfWord)) {
                temporarySet.addAll(map.get(lengthOfWord));
                temporarySet.add(key);
                map.put(lengthOfWord, temporarySet);
            }
            else
                map.put(lengthOfWord, Set.of(key));
        }

        return map;
    }
}
