package com.intel.Test;


import java.util.*; 

public class WeekDay { 
  
    public static String day(String days, int k) 
    { 
  
       
        List<String> day = new ArrayList<String>() 
        		{
            add("Monday"); 
            add("Tuesday"); 
            add("Wednesday"); 
            add("Thursday"); 
            add("Friday"); 
            add("Saturday"); 
            add("Sunday"); 
         
        		}
       
        int index  = day.indexOf(days); 
  
       
        return day.get((index + k) % 7); 
    } 
  
    // Driver function 
    public static void main(String[] args) 
    { 
  
        String str = "Monday"; 
  
        System.out.println(day(str, 3)); 
    } 
} 