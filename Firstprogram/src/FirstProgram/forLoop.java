package FirstProgram;

import java.util.Scanner;

public class forLoop {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
//		int n=sc.nextInt();
//		primeNumbers(n);
		int start=sc.nextInt();
		int end=sc.nextInt();
		evenSum(start,end);
	}
	//prime numbers
	public static void primeNumbers(int n) {
		int count=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				count=count+1;
  			}
		}
		if(count>0) {
			System.out.println(" prime number");
		}
		else {
			System.out.println(" not a prime number");
		}
		
		
	}
	
	public static boolean evenNum(int even) {
		if(even <=0 || even%2!=0) {
			return false;
		}
		else {
		return true;
		}
	}
	public static void evenSum(int start,int end) {
		if(start==end) {
			System.out.println(start);
		}
		else if(start <= 0 || end <=0) {
			System.out.println("-1");
		}
		else {
			int store= 0;
		for(int i=start;i<=end;i++) {
			
			if( evenNum(i)) {
				store=store+i;
			}
			
		}
		System.out.println(store);
		}
	}
	
	

}
