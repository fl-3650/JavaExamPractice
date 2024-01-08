/*
 * Copyright (c) fl_3650.
 */

package ticket3;

import java.util.*;

class Ticket3 {
    public static boolean isUnique(Map<String, String> map) {
        Set<String> uniqueValues = new HashSet<>();

        for (var value : map.values())
            if (!uniqueValues.add(value))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Map<String, String> exampleMap = new HashMap<>();
        exampleMap.put("key1", "value1");
        exampleMap.put("key2", "value2");
        exampleMap.put("key3", "value3");

        System.out.println(isUnique(exampleMap));
    }
}
