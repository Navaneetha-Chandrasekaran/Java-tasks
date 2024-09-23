package org.phone;

public class InternalStorage {
	private void processorName() {
		 System.out.println("processor");
	 }
	private void ramSize() {
		 System.out.println("1267");
	 }
	public static void main(String[] args) {
		InternalStorage i= new InternalStorage();
		i.processorName();
		i.ramSize();
		
		ExternalStorage e = new ExternalStorage();
		e.size();
	}
}
