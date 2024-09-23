package org.overriding;

public class OverRiding extends OldTax {
   public void tax(int tax) {
	   System.out.println("New tax limit :" +tax);
	   super.tax(250000);
}
   public static void main(String[] args) {
	OverRiding o = new OverRiding();
	o.tax(500000);
}
}

