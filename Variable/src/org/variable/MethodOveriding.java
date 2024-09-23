package org.variable;
// this and super
public class MethodOveriding extends MethodOverloading  {
	 private void empData1(String name,int age) {
  	   System.out.println("my name is " + name+ "\n" + "her age is :"+age );
  	   this.empData1(10, "hi");
  	   super.CompStatus("Deloitte");
     }
     private void empData1(int age,String name) {
  	   System.out.println("my name is " + name+ "\n" + "her age is :"+age );
  	   
     }
     public static void main(String[] args) {
			MethodOveriding m =new MethodOveriding();
			m.empData1("navaneetha",20);
     }
}
