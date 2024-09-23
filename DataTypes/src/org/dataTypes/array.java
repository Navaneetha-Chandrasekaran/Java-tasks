package org.dataTypes;



public class array {
public static void main(String[] args) {
	int a[]=new int[4];
	a[0]=2;
	a[1]=2;
	a[2]=2;
	a[3]=2;
	for(int b:a) {
		System.out.println(b);
	}
	System.out.println("=================");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
