package hashTables;

import java.util.HashMap;
import java.util.Map;

public class HashTableExercises {
    public int mostFrequent(int[] items) {
        Map<Integer, Integer> map = new HashMap<>();

        for (var item : items) {//O(n)
            var count = map.containsKey(item) ? map.get(item) : 0;
            map.put(item, count + 1);
        }

        int currentItem = 0;
        for (var item : items) {
            var prevItemCounts = map.get(item);
            if (prevItemCounts >  currentItem)
                currentItem = prevItemCounts;
        }

        for (var item : items) {
            if (map.get(item) == currentItem)
                return item;
        }

        return 0;
    }

    public int countPairWithDiff(int[] items, int diff) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int countDiff = 0;

        for (var item : items)
            map.put(count++, item);

        for (int i = 0; i < count; i++)
//            for (int j = 0; j < count; j++)
            if (Math.abs(map.get(i) - map.get(i + 1)) == diff )
                countDiff += 1;

        return countDiff;
    }
}
