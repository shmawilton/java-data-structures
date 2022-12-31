package hashTables;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashTable table = new HashTable(5);
        table.put(6, "wilton");
        table.put(8, "Nigel");
        table.put(11, "Lameck");

        System.out.println(table.get(19));
        System.out.println(table.get(14));

        //interview questions  
//        CharacterFinder finder = new CharacterFinder();
//        var ch = finder.getFirstNonRepeatedVal("a green apple");
//        var ch2 = finder.getFirstRepeatedVal("green apple");
//
//        System.out.println(ch2);





    }
}
