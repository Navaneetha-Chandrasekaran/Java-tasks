package org.strings;

public class StringsMethods {
public static void main(String[] args) {
	String a="Navaneetha";
    String b="   Sugeetha   ";
    String c="navaneetha";
    
	char charAt = a.charAt(3);
	System.out.println(charAt);
	
	int indexOf = b.indexOf("g");
	System.out.println(indexOf );
	
	int lastIndexOf = a.lastIndexOf("a");
	System.out.println(lastIndexOf);
	
	int length = a.length();
	System.out.println(length);
	int length1 = b.length();
	System.out.println(length1);
	
	boolean d=a.isEmpty();
	System.out.println(d);
	
	boolean contains =a.contains("e");
	System.out.println(contains);
	
	String trim=b.trim();
	System.out.println(trim);
	
	boolean start=a.startsWith("na");
	System.out.println(start);
	
	
	boolean end=a.endsWith("tha");
	System.out.println(end);
	
	String upper =a.toUpperCase();
	System.out.println(upper);
	
	String lower = a.toLowerCase();
	System.out.println(lower);
	
	boolean equal =a.equals(b);
	System.out.println(equal);
	
	boolean equalto=a.equalsIgnoreCase(c);
	System.out.println(equalto);
	
	String replace=a.replace("Na", "an");
	System.out.println(replace);
	
	
	String replaceall=a.replaceAll("Navaneetha","Nithya");
	System.out.println(replaceall);
	
     String s =a.substring(5);
     System.out.println(s);
     
     String m =b.substring(3, 8);
     System.out.println(m);
	
     
     int comapre=a.compareTo(b);
     System.out.println(comapre);
}
}
