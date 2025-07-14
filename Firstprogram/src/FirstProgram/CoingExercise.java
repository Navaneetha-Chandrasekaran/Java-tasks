package FirstProgram;

import java.util.Scanner;

public class CoingExercise {
	
	// 1 gegabytes converter
//	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("enter :");
//		int kilo_bytes=sc.nextInt();
//		gegabytes(kilo_bytes);
//	}
//	public static void gegabytes(int kb) {
//		int  gb=kb/1024;
//		System.out.println("The Gegabytes is" + gb);
	
//	}
	
	//  2 barking dog
//	 public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println(" enter barking true/false :");
//		boolean bark=sc.nextBoolean();
//		System.out.println(" enter time ");
//		int time=sc.nextInt();
//	 3	wakeup(bark,time);
//        System.out.println(decimal(1.176231, 1.176232, 1.176233));		
		 
		 
		 //4 
//	}
	 //2
	 public static void wakeup(boolean b,int time) {
		 if(b== true) {
			 if((time<8 && time>0) || (time> 22 && time <24)) {
				 System.out.println("true");
			 }
			 else {
				 System.out.println("false");
			 }
		 }
		 else {
			 System.out.println("False");
		 }
	 }
	 //3
	 public static boolean decimal(double a,double b,double c) {
		 double d=Math.round(a)*10000;
		 double e =Math.round(b)*10000;
		 double f=Math.round(c)*10000;
		 System.out.println(d);
		 return (d==e) && (e==f);
	 }
	 
	 //4) 2,3,6==>2*3=6 
	 
//	 public static void main(String[] args) {
//		 System.out.println(hasequal(2,3,6));
//	}
//	 
//	public static boolean hasequal(int a,int b,int c) {
//		int d= a*b;
//		System.out.println("1 ");
//		return(d==c);
//		
//		
//	}
	
	//5 teen values (13...19)
	
	public static void main(String[] args) {
		System.out.println(hasteen(13,14,19));
	}
	public static boolean hasteen(int a,int b,int c) {
		if((a<13 && a>19) && (b<13 && b>19) && (c<13 && c>19) ) {
			return false;
		}
		
		return true;
	}
}
