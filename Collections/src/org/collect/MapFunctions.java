package org.collect;

//import java.util.HashMap;
//import java.util.Map;

import java.util.*;
import java.util.Map.Entry;
public class MapFunctions {
public static void main(String[] args) {
	
	System.out.println("====================Hash Map=========================");
	 Map<String,Integer> m=new HashMap();
	 m.put("nava",10);
	 m.put("nithyA",8);
	 m.put(null,null);
	 m.put("divya",9);
	 m.put("aaa",null);
	 m.put("ccc",8);
	 m.put("nova",4);
	 
	 System.out.println(m);
	 
	 
	 System.out.println("====================LinkedHash Map=========================");
	 Map<String,Integer> m2=new LinkedHashMap();
	 m2.put("nava",10);
	 m2.put("nithyA",8);
	 m2.put(null,null);
	 m2.put("divya",9);
	 m2.put("aaa",null);
	 m2.put("ccc",8);
	 m2.put("nova",4);
	 
	 System.out.println(m2);
	 
	 
	 System.out.println("====================Tree Map=========================");
	 Map<String,Integer> m3=new TreeMap();
	 m3.put("nava",10);
	 m3.put("nithyA",8);
//	 m3.put(null,null);
	 m3.put("divya",9);
//	 m3.put("aaa",null);
	 m3.put("ccc",8);
	 m3.put("nova",4);
	 
	 System.out.println(m3);
	 
	 
	 System.out.println("====================Hash Tables=========================");
	 Map<String,Integer> m4=new HashMap();
	 m4.put("nava",10);
	 m4.put("nithyA",8);
//	 m4.put(null,null);
	 m4.put("divya",9);
//	 m4.put("aaa",null);
	 m4.put("ccc",8);
	 m4.put("nova",4);
	 
	 System.out.println(m4);
	 
	 
	 System.out.println("================== size =======================");
	 System.out.println(m.size());
	 System.out.println(m2.size());
	 System.out.println(m3.size());
	 
	 System.out.println("================= contains key ======================");
	 boolean containsKey = m.containsKey("nithya");
	 System.out.println(containsKey);
	  System.out.println(m.containsKey("nava"));
	
	  
     System.out.println("================= contains Value ======================");
	 boolean n=m2.containsValue(8);
	 System.out.println(n);
	 
	 System.out.println("================= remove ======================");
	 System.out.println( m2.remove("aaa"));
	System.out.println(m2);
	
	 System.out.println("===================keyset==========================");
	 Set<String> keySet = m2.keySet();
	 System.out.println(keySet);
	 
	 System.out.println("=====================values================================");
	 Collection<Integer> hlo=m.values();
	 System.out.println(hlo);
	 
	 System.out.println("====================== Entry Set ============================");
	 Set<Entry<String, Integer>> entrySet = m.entrySet();
	 for(Entry<String, Integer> e:entrySet) {
//		 System.out.println(e);
//		 System.out.println(e.getValue());
		 System.out.println(e.getKey());
		 
	 }
	 
}
}
