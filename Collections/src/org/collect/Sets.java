package org.collect;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;



public class Sets {
public static void main(String[] args) {
	Set n=new HashSet();
	System.out.println(" ========Hashset========");
	n.add(20);
	n.add("nava");
	n.add(true);
	n.add(23.456);
	n.add("N");
	n.add(null);
	System.out.println(n);
	
	System.out.println("========Linked Hashset=========");
	Set n2=new LinkedHashSet();
	n2.add(20);
	n2.add("nava");
	n2.add(true);
	n2.add(23.456);
	n2.add("N");
	n2.add(null);
	System.out.println(n2);
    
	
	System.out.println("============Treeset=============");
	Set n3=new TreeSet();
	n3.add(20);
	n3.add(58);
	n3.add(10);
	n3.add(23);
	n3.add(17);
	n3.add(2);
	System.out.println(n3);
	
	System.out.println("==========Remove===========");
	Object remove=n2.remove(20);
	System.out.println(remove);
	System.out.println(n2);
	
	System.out.println("==========Size==========");
	System.out.println(n.size());
	System.out.println(n2.size());
	System.out.println(n3.size());
	
//	System.out.println(n3.removeAll(n3));
	System.out.println(n3);
	
	System.out.println("====addAll=======");
	 Object s=n.addAll(n3);
	 System.out.println(s);
	 System.out.println(n);
	 
	 
	 System.out.println("===for each====");
	 for(Object n5:n) {
		 System.out.println(n5);
	 }
}
}