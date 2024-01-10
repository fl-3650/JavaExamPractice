/*
 * Copyright (c) fl_3650.
 */

package ticket22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sorter<Integer> sorter = new Sorter();
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        sorter.bubbleSort(list);

        for (var item : list)
            System.out.println(item);
    }
}
