package org.condition;



public class Control {
 private void voter(int age) {

	if( age >18) {
		System.out.println("ok");
	}
	else {
		System.out.println("not oK");
	}
}
 private void even(int num) {
	if(num%2==0) {
		System.out.println("even number");
	}
	else {
		System.out.println("odd number");
	}
}
 
 public static void main(String[] args) {
       Control a=new Control();
       a.voter(10);
       a.even(18);
       a.even(7);
	
}
}
