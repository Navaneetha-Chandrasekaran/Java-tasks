package FirstProgram;

import java.util.Scanner;

public class whiledowhile {
     public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
//    	 int n= sc.nextInt();
//    	 int i=1;
//    	 while(i<=10) {
//    		 int table= i*n;
//    		 System.out.println( i +"*"+ n +"=" + table);
//    		 i++;
//    	 }
    	 
    	 
    	
    	 int a=sc.nextInt();
    	 oddSum(a);
    	 evenSum(a);
    	 

     }
     //sum of digits
     public static void sumofDigits(int a) {
    	 int rem=0,sum=0,n=a;
    	 while(n!=0) {
    	 rem=n%10;
    	 sum+=rem;
    	 n=n/10;
    	 } 
    	 System.out.println(sum);
    	 
     }
     
     //palindrome
     public static void palindrome(int a) {
    	 int rem=0,n=a,c=0;
    	 while(n!=0) {
    		 rem=n%10;
    		 c=c*10+rem;
    		 n=n/10;
    	 }
    	 if(a==c) {
    		 System.out.println("palindrome");
    	 }
    	 else {
    		 System.out.println("not palindrome");
    	 }
     }
     
     //sum of 1st and last digits
     public static void sumdigits(int a) {
    	 int rem=0,lrem=0,c=0;
    	 if(a<0 ) {
    		 System.out.println("-1");
    	 }
    	 else {
    		 if(a<10) {
    		 
    		 lrem=a;
    		 rem=a%10;
    		 c=rem+lrem;
    		 System.out.println(c);
    		 
    	 }
    	 else {
    	 rem=a%10;
    	 int temp=a;
    	 while(temp>=10) {
    	 temp=temp/10;
    	 }
    	 lrem=temp;
    	 c=rem+lrem;
    	 System.out.println(c);
    	 System.out.println(rem);
    	 System.out.println(lrem);
    	 }
     }
     }
     
     //odd digit sum
     public static void oddSum(int a) {
    	 if(a>0) {
    		 int rem=0,sum=0;
    		 while(a!=0) {
    			 rem=a%10;
    			 if(rem%2!=0) {
    				 sum=sum+rem;
    			 }
    			 a=a/10;
    		 }
    		 System.out.println(sum);
    	 }
    	 else {
    		 System.out.println("-1");
    	 }
     }
     
     //even digit sum
     public static void evenSum(int a) {
    	 if(a>0) {
    		 int rem=0,sum=0;
    		 while(a!=0) {
    			 rem=a%10;
    			 if(rem%2==0) {
    				 sum=sum+rem;
    			 }
    			 a=a/10;
    		 }
    		 System.out.println(sum);
    	 }
    	 else {
    		 System.out.println("-1");
    	 }
     }
     
  
     
}
