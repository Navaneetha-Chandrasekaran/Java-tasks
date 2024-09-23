package org.abstraction;
//child
public  class PartialChild extends PartialAbstraction{
	  public  void accSin(int sin) {
		  System.out.println("sinnumber is"+sin);
	  }
	  
	  public static void main(String[] args) {
		PartialChild c = new  PartialChild();
		c.accSin(3456);
		c.accName("NAVA");
		c.accId(97);
	}
} 
