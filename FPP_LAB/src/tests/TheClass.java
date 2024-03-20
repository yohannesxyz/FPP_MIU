package tests;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


class c{
	int x=7;
	
}

 class TheClass extends c{
	int outerField= 3;
    public static void main(String[] args) {
    	 TheClass x= new TheClass();
    	 
    	 Map<Integer, Integer> intMap = new HashMap<>();
    	 intMap.put(2, 5);
    	 intMap.put(2, 9);
    	 intMap.put(3, 5);
    	 
    	 System.out.print(intMap);
    }
   
    
    {
    	System.out.print(x);
      }
 
}