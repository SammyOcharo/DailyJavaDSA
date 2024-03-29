package com.dev.DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ReturnKeyValue {
    //Return the Objects Keys and Values
    //Create a method that takes a Map<String, String> and return the values as a separate array.
    // Return the keys sorted alphabetically, and their corresponding values in the same order.
    //
    //Examples
    //getValues({ "a": "1", "b": "2", "c": "3" } )
    //➞ ["1", "2", "3"]
    //
    //getValues({ "a": "Apple", "b": "Microsoft", "c": "Google" })
    //➞ ["Apple", "Microsoft", "Google"]
    //
    //getValues({ "key1": "true", "key2": "false", "key3": "undefined" })
    //➞ ["true", "false", "undefined"]

    public static List<String> getValues(Map<String, String> map){
        TreeMap<String, String> sortedMap = new TreeMap<>(map);
        List<String> values = new ArrayList<>();
        for(Map.Entry<String, String> entry: sortedMap.entrySet()){
            values.add(entry.getValue());
        }

        return values;
    }


}
