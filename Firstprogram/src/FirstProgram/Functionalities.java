package FirstProgram;

import java.util.jar.Attributes.Name;
import java.util.Scanner;

public class Functionalities {
	public static void main(String[] args) {
		//method
		int length=10;
		int breadth=20;
		area(length,breadth);
		area(100,2);
//		 double ans= 45.4;
		 double ans= 45;

		 //speed(ans);
		 double b= ans+speed(ans);
		 System.out.println(b);
		 
//task
		 String na="navaneetha";
		 int mark=89;
		 display(mark,na);
		 
		 // kgs to mg and grams
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter kg");
		 double kg=sc.nextDouble();
		 convertor(kg);
		 
		 
		
	}
//method 
	//in void dont need to return something
	public static void area(int l,int b) {
		int perimeter = 2*(l+b);
		System.out.println(perimeter);
	}
	 public static double speed( double a) {
		 if(a==45.4) {
		  double speed =a/2;
		  return speed;
		 }
		 return 0;
	 }
	 public static void marks(int mark) {
		 if(mark==100) {
			 System.out.println("O grade");
		 }
		 else if(mark >=90 && mark<100) {
			 System.out.println("A grade");
		 }
		 else if(mark >=70 && mark <90) {
			 System.out.println("B garde");
		 }
		 else {
			 System.out.println(" D grade");
		 }
	 }
	public static void display(int mark ,String name) {
		System.out.println(name);
		marks(mark);
	}
	public static void convertor( double kg) {
		double gms=kg/1000;
		double mg=kg/100;
		System.out.println("THE gms is " + gms);
		System.out.println("the mg is " + mg);
	}
	

}
