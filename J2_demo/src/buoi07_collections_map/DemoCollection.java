package buoi07_collections_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoCollection {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        Set<Integer> mySet = new HashSet<>();
        
        myList.add(1);
        myList.add(3);
        myList.add(2);
        myList.add(3);
        myList.add(1);
        myList.add(2);
        myList.add(2);
        
        mySet.add(1);
        mySet.add(3);
        mySet.add(2);
        mySet.add(3);
        mySet.add(1);
        mySet.add(2);
        mySet.add(2);
        
        System.out.println(myList);
//        System.out.println(mySet);


        Collections.shuffle(myList);
        System.out.println("Collections.shuffle(myList)");
        System.out.println(myList);

        
        Collections.sort(myList);
        System.out.println("Collections.sort(myList)");
        System.out.println(myList);
        

        Collections.reverse(myList);
        System.out.println("Collections.reverse(myList)");
        System.out.println(myList);
        
    }
}
