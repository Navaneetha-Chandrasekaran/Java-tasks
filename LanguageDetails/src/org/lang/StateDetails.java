package org.lang;

public class StateDetails {
private void southIndia() {
	System.out.println("south");
}
private void northIndia() {
	System.out.println("north");
}
public static void main(String[] args) {
	StateDetails s= new StateDetails();
	s.southIndia();
	s.northIndia();
	
	LanguageInfo l= new LanguageInfo();
	l.tamilLanguage();
	l.englishLanguage();
	l.hindiLanguage();
}
}
