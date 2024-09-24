package org.collect;

import java.util.ArrayList;
import java.util.List;
public class Lists {
 public static void main(String[] args) {
	 List li =new ArrayList(10);
	 li.add(23);
	 li.add("heello");
	 li.add(23.456);
	 li.add(true);
	 li.add("n");
	 li.add(23);
	
	 
	 for(int i=0;i<=5;i++) {
		 Object s =li.get(i);
		 System.out.println(s);
	 }
	 
     for(Object s:li) {
    	 System.out.println(li);
     }
}
}
