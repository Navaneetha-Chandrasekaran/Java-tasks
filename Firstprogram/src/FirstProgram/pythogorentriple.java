package FirstProgram;

import java.util.Scanner;

public class pythogorentriple {
// pythogoren is a^2+b^2=c^2
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a");
		int a= sc.nextInt();
		System.out.println(" Enter b");
		int b= sc.nextInt();
		System.out.println("Enter c");
		int c=sc.nextInt();
		pythagoren(a,b,c);
		
	}
	public static void pythagoren(int a,int b,int c) {
//		int g=a*a;
//		int d=b*b;
		int e= c*c;
		int f= (a*a)+(b*b);
		if(f==e) {
			System.out.println(" it is pythagoren");
		}
		else {
			System.out.println(" not pythagoren");
		}
	}
}
