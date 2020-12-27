package com.chetasmind.mapPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
 
public class SortHashMapBasedOnKey { 
         
      public static void main(String[] args) {
                
            HashMap<String,String>obj = new HashMap<>();
            obj.put("Suresh", "Bangalore");
            obj.put("Rajesh", "Goa");
            obj.put("Neha", "Mangalore");
                  
            //Returns a Set view of the keys contained in this map.
            Set<String> set = obj.keySet();
                  
           //Creating ArrayList object from set
            ArrayList<String> arrObj = new ArrayList<>(set);
                  
            //Sorting the arraylist object.
            Collections.sort(arrObj);
                  
            System.out.println("\n  Display of Key, values in ascending order of keys.");
            for(String person: arrObj) {
                   System.out.print("\n Key is :"+person);
                   System.out.print("  Value is :"+obj.get(person));   
           } // End of for loop  
            TreeMap<String,String> treeMap = new TreeMap<>(obj);
            set = treeMap.keySet();
                         
            System.out.println("\n Display of TreeMap object");
            for(String person: set) {
                 System.out.println();
                 System.out.print("Key is :"+person);
                 System.out.print("  Value is :"+treeMap.get(person));
            }
            
      }
}
