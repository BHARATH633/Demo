package com.intel.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {


class HashMap1 { 
  
	  
    HashMap<String, Integer> map = new HashMap<>(String,Integer); 
  
   
    public static void sorting() 
    { 
       
        TreeMap<String, Integer> tm = new TreeMap<>(); 
  
        
        tm.putAll(map); 
  
        
        for (Map.Entry<String, Integer> tp : tm.entrySet())  
        	
  System.out.println(tp.getKey() + " "+ tp.getValue());         
    } 
 
    public static void main(String args[]) 
    { 
        
        map.put("Math", 98); 
        map.put("DataStructure", 85); 
        map.put("Database", 91); 
        map.put("java", 95); 
        map.put("operating system", 79); 
        map.put("operating system", 79); 
  
       
        sorting(); 
    } 
}
}
