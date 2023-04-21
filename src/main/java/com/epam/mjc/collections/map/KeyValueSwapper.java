package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> outputMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            String value = entry.getValue();
            int key = entry.getKey();
            if (!outputMap.containsKey(value)) {
                outputMap.put(value, key);
            } else {
                int existingKey = outputMap.get(value);
                if (key < existingKey) {
                    outputMap.put(value, key);
                }
            }
        }
        return outputMap;
    }
}
