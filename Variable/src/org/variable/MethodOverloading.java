package org.variable;

public class MethodOverloading {
           private void empData(String name,int age) {
        	   System.out.println("my name is " + name+ "\n" + "her age is :"+age );
        	  
           }
           private void empData(int age,String name) {
        	   System.out.println("my name is " + name+ "\n" + "her age is :"+age );
        	 
           }
           public void CompStatus(String comp) {
        	   System.out.println("my company name is  " + comp);
           }
           public static void main(String[] args) {
			MethodOverloading m =new MethodOverloading();
			m.empData("navaneetha",20);
			m.empData(50, "sowmiya ");
		}
}

