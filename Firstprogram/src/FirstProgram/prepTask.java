package FirstProgram;

import java.util.Scanner;

public class prepTask {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
//		int b=sc.nextInt();
//		boolean c=sharedDigit(n,b);
//		System.out.println(c);
//		int c=sc.nextInt();
//		
//		lastdigitchecker(n,b,c);
//		gcd(n,b);
//		factors(n);
//		perfectnumber(n);
		numtowords(n);
	}
	
	//shared digit-->The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; 
//	otherwise, the method should return false.
    public static  boolean sharedDigit(int a ,int b) {
    	if(a>=10 && a<=199 && b>=10 && b<=199) {
    		int rem=0;
    		while(a!=0) {
    			rem=a%10;
    			 while(b!=0) {
    				 int rem2=b%10;
    				 if(rem==rem2) {
    					 return true;
    				 }
    				 b=b/10;
    			 }
    			a=a/10;
    		}
    	}
    	return false;
    }
    
    public static void lastdigitchecker(int a ,int b,int c) {
    	int rem1=a%10;
    	int rem2=b%10;
    	int rem3=c%10;
    	if(rem1 == rem2 || rem1==rem3|| rem2== rem3) {
    		System.out.println("true");
    	}
    	else {
    	System.out.println("false");
    	}
    }
    
    // greatest common divisor 
    public static void gcd(int n,int b) {
    	int great = 0;
    	for(int i=1;((i<=n)&&(i<=b));i++) {
    		if( (n%i==0) && (b%i==0) ) {
    			great=i;
    		}
    	}
    	System.out.println(great);
    }
    
    //factors
    public static void factors(int n) {
    	for(int i=1;i<=n;i++) {
    		if(n%i==0) {
    		System.out.print(i +" ");
    		}
    	}
    }
    
    public static void perfectnumber(int n) {
    	int sum=0;
    	for(int i=1;i<n;i++) {
    		if(n%i==0) {
    			sum=sum+i;
    		}
    	}
    	if(n==sum) {
    		System.out.println("true");
    	}
    	else {
    		System.out.println("false");
    	}
    }
    
    //num to words
    public static void numtowords(int a) {
    	String c="";
    	
    	while(a!=0) {
    		int r=a%10;
    		c=c+r;
    		a=a/10;
    	}
//    	System.out.println(c);
    	int d=Integer.parseInt(c);
//    	System.out.println(d);
    	int rem;
    	while(d!=0) {
    		rem=d%10;
    		switch(rem) {
    		case 1:
    			System.out.print("one ");
    			break;
    		case 2:
    			System.out.print("two ");
    			break;
    		case 3:
    			System.out.print("three ");
    			break;
    		case 4:
    			System.out.print("four ");
    			break;
    		case 5:
    			System.out.print("five ");
    			break;
    		case 6:
    			System.out.print("six ");
    			break;
    		case 7:
    			System.out.print("seven ");
    			break;
    		case 8:
    			System.out.print("eight ");
    			break;
    		case 9:
    			System.out.print("nine ");
    			break;
    		default:
    			System.out.println("zero");
    			break;
    		}
    		d=d/10;
    	}
    }
}
