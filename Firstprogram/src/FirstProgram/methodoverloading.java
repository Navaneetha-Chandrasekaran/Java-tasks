package FirstProgram;

//import java.util.Scanner;

public class methodoverloading {
    
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		int length=sc.nextInt();
//		int breadth=sc.nextInt();
//		double height=sc.nextDouble();
//		area(length);
//		area(length,breadth);
//		area(breadth,height);
//		minutes(120,45);
//		minutes(7245);
		System.out.println(area(-1.0,5.0));
		System.out.println(area(5.0,10.0));
		System.out.println(area(-2.0));
		days(525600);
		days(1051200);
		days(561600);
		equal(2,3,2);
		equal(2,2,2);
		equal(2,1,4);
		equal(-1,-2,-2);

	}
    
    
     public static void area(int length) {
    	 double sq_area=length*length;
    	 System.out.println(sq_area);
     }
     
     public static void area(int length,int breadth) {
    	 double rect_area=2*(length+breadth);
    	 System.out.println(rect_area);
     }
     public static void area(int breadth,double height) {
    	 double tri_area=(breadth*height)/2;
    	 System.out.println(tri_area);
     }
     
     public static void minutes(long minutes,long seconds) {
    	 long  hour=minutes/60;
    	 long  minute =minutes %60;
    	 System.out.println(hour+"h"+minute+"m"+seconds);
     }
     public static void minutes(long seconds) {
    	 long  minute=seconds/60;
    	 long  second =seconds %60;
    	 long minutes=minute%60;
    	 long hour=minute/60;
    	 System.out.println(hour+"h :"+minutes+"m :"+second+"s");
     }
     public static double area(double radius) {
    	 if(radius<0.0) 
    		 return -1.0;
    	 return radius*radius*Math.PI;
     }
     public static double area(double x,double y) {
    	 if(x>=0.0 && y>=0.0) {
    		 double rect =x*y;
    		 return rect;
    	 }
    	 return -1.0;
     }
     
     public static void days(long minutes) {
    	 if(minutes<0) {
    		 System.out.println("Invalid value");
    	 }
    	 else {
    	 long hours=minutes/60;
    	 long days=hours/24;
    	 long year=days/365;
    	 long day=days%365;
    	 System.out.println(minutes+"m="+year+"y and "+day+"d");
    	 }
     }
     public static void equal(int a,int b,int c) {
    	 if(a>0 && b>0 && c>0) {
    		 if( a==b && b==c) {
    			 System.out.println("all are equal");
    		 }
    		 else if(a!= b && a!=c && b!=c ) {
    			 System.out.println("All numbers are different");
    		 }
    		 else {
    			 System.out.println("neither  1  are same or different");
    		 }
    	 }
    	 else {
    		 System.out.println("Invalid value");
    	 }
     }
}
