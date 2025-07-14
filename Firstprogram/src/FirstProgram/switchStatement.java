package FirstProgram;

import java.util.Scanner;

public class switchStatement {
	public static void main (String args []) {
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int month =sc.nextInt();
		int year = sc.nextInt();
		printNumbers(a);
		calculateMonths(month,year);
	}
	public static void printNumbers(int a) {
		switch(a) {
	case 0:
			System.out.println("zero");
		    break;
	case 1:
		System.out.println("one");
		break;
	case 2:
		System.out.println("two");
		break;
	case 3:
		System.out.println("three");
		break;
	case 4:
		System.out.println("four");
		break;
	case 5:
		System.out.println("five");
		break;
	default:
		System.out.println("default value");
	    break;
			
	}
	

}
	public static void calculateMonths(int month,int year) {
		switch(month) {
		case 1:
			System.out.println("31 days");
			break;
		case 2:
			if(year%4==0) {
				if(year % 100 !=0 || year%400==0) {
					System.out.println("29 days");
				}
			}
			else {
			System.out.println("28 days ");}
			break;
		case 3:
			System.out.println("31 days");
			break;
		case 4:
			System.out.println("30 days");
			break;
		case 5:
			System.out.println("31 days");
			break;
		case 6:
			System.out.println("30 days");
			break;
		case 7:
			System.out.println("31 days");
			break;
		case 8:
			System.out.println("31 days");
			break;
		case 9:
			System.out.println("30 days");
			break;
		case 10:
			System.out.println("31 days");
			break;
		case 11:
			System.out.println("30 days");
			break;
		case 12:
			System.out.println("31 days");
			break;
		default:
				System.out.println("wrong month");
				break;
		}
	}
}
