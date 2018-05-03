package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static Map<String, Double> map;

    public static void main(String[] args) throws Exception {
        map = new TreeMap<>();

        //args = new String[] {"com/javarush/task/task19/task1920/file"};

        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            while (fileReader.ready()) {
                String line = fileReader.readLine();
                String[] data = line.split(" ");

                addToMap(data[0], data[1]);
            }
        }

        List<Map.Entry<String, Double>> list = new ArrayList(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> m1, Map.Entry<String, Double> m2) {
                int result = -Double.compare(m1.getValue(), m2.getValue());

                if(result == 0)
                    return m1.getKey().compareTo(m2.getKey());

                return result;
            }
        });

        Double top = list.get(0).getValue();

        for (Map.Entry<String, Double> m : list) {
            if (m.getValue().equals(top)) System.out.println(m.getKey());
            else break;
        }
    }

    public static void addToMap(String key, String value) {
        Double d = Double.parseDouble(value);

        Double v = map.get(key);
        if (v == null) v = 0.0;

        map.put(key, (v + d));
    }
}

