package org.problmes;

public class Reversestring {
public static void main(String[] args) {
	String a="Navaneetha";
	//Reverse a string
	for(int i=a.length()-1;i>=0;i--) {
		System.out.println(a.charAt(i));
	}   
	
	//palindrome
	System.out.println("====================== Palindrome ============================");
	 String b="2322";
	 String c="";
	 for(int i=b.length()-1;i>=0;i--) {
		 c=c+b.charAt(i);
	 }
	 System.out.println(c);
	 if(b.equals(c)) {
		 System.out.println("Palindrome");
	 }
	 else {
		 System.out.println(" Not palindrome");
	 }
	 
	 System.out.println("================= sum & average ===========================");
	 int d[] = {10,20,30,40,50};
	 int e=0;
	 for(int i=0;i<d.length;i++) {
		 e=e+d[i];
	 }
	 System.out.println(e/d.length);
	 
}

}
