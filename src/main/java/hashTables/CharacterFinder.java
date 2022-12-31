package hashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharacterFinder {

    public char getFirstRepeatedVal(String input) {
        Set<Character> set = new HashSet<>();

        var characters = input.toCharArray();
        for (var ch : characters) {
            if (set.contains(ch))
                return ch;

            set.add(ch);
        }

        return Character.MIN_VALUE;
    }


    public char getFirstNonRepeatedVal(String input) {
        Map<Character, Integer> map = new HashMap<>();

        var chars = input.toCharArray();
        for (var item : chars) {
            var count = map.containsKey(item) ? map.get(item) : 0;
            map.put(item, count + 1);
        }

        for (var ch : chars)
            if (map.get(ch) == 1)
                return ch;
        return Character.MAX_VALUE;
    }
}
