package org.sample;
import org.phone.ExternalStorage;
public class Master {
	private void MasterId() {
		 System.out.println("1Master Id");
	 }
	private void MasterName() {
		 System.out.println("1Master Name");
	 }
	public static void main(String[] args) {
		Master m= new Master();
		m.MasterId();
		m.MasterName();
		
		ExternalStorage s = new ExternalStorage();
	    s.size();
	}
}
