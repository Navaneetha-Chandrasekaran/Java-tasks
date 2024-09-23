package org.abstraction;

//child
public class FullParent implements FullAbstarctionChild {
	

	  public  void userName( String name) {
		  System.out.println("name :" +name);
	  }
	  public  void userMail( int id, String email) {
		  System.out.println("mailid is "+ id + "\n" +"mail name is " +email);
	  }
	  public void userAddress(String add) {
		  System.out.println("address is " +add);
	  }
	  public static void main(String[] args) {
		FullParent f = new FullParent();
		f.userName("nithya");
		f.userMail(33,"navaneetha@gmail.com");
		f.userAddress("qwertyuiop");
	}
	 
	  }

