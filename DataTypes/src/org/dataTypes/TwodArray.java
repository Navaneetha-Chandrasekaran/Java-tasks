package org.dataTypes;

public class TwodArray {
public static void main(String[] args) {
	int a[][]=new int[3][3];
	 a[0][0]=23;
	 a[0][1]=24;
	 a[0][2]=31;
	 a[1][0]=25;
	 a[1][1]=26;
	 a[1][2]=32;
	 a[2][0]=33;
	 a[2][1]=34;
	 a[2][2]=35;
	 
	 
	 for(int []b:a) {
		 for(int c:b) {
			 System.out.println(c);
		 }
	 }
	 System.out.println("=====================");
	 for (int i=0;i<a.length;i++) {
		 for(int j=0;j<a[i].length;j++) {
			 System.out.println(a[i][j]);
			 
		 }
	 }
} 
}
