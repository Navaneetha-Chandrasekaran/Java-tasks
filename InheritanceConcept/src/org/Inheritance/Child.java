package org.Inheritance;
//child
import org.sSingle.*;
public class Child extends Parent {
  private void childname() {
 System.out.println("child name");
}
  public static void main(String[] args) {
	Child c =new Child();
	c.parenntName();
	c.childname();
} 
}
