package org.sSingle;

//child

public class Child2  extends Parent{
           private  void Childs() {
			System.out.println("i am a child");
		}
           public static void main(String[] args) {
			Child2 c = new Child2();
			c.Childs();
			c.parenntName();
			c.grandparent();
		}
}
