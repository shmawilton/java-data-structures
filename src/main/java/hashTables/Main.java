package hashTables;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //get the most frequent item in an integer array
        HashTableExercises hashTableExercises = new HashTableExercises();
//        int[] items = {1, 2, 4, 4, 4, 4, 2, 2};
//        var output = hashTableExercises.mostFrequent(items);
        int[] items2 = {1, 7, 5, 9, 2, 12, 3};
        var output2 = hashTableExercises.countPairWithDiff(items2, 2);
        System.out.println(output2);


        //implemented hash table
//        HashTable table = new HashTable(5);
//        table.put(6, "wilton");
//        table.put(8, "Nigel");
//        table.put(11, "Lameck");
//
//        System.out.println(table.get(19));
//        System.out.println(table.get(14));

        //interview questions  
//        CharacterFinder finder = new CharacterFinder();
//        var ch = finder.getFirstNonRepeatedVal("a green apple");
//        var ch2 = finder.getFirstRepeatedVal("green apple");
//
//        System.out.println(ch2);





    }
}
