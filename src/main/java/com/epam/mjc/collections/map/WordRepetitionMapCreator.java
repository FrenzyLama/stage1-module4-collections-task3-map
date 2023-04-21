package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordCounts = new HashMap<>();
        String[] words = sentence.toLowerCase().split("\\W+"); // split on non-word characters
        for (String word : words) {
            if (word.length() > 0) { // ignore empty strings
                int count = wordCounts.getOrDefault(word, 0);
                wordCounts.put(word, count + 1);
            }
        }
        return wordCounts;
    }
}
