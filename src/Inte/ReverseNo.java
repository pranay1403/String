package Inte;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		 int num; int rev = 0;
		 
		 try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a Number");
			 
			 num=sc.nextInt();
		}
		 
		 int num2=num;
		 while(num!=0) {
			 rev=rev*10+num%10;
			num=num/10;		 
			 
		 }
		 System.out.println("Reverse No"+ " "+ rev);
		 
		 int rev1=rev;
		 
		 if(num2==rev1) {
			 System.out.println("it's pallindrome number");
		 }else {
			 System.out.println("It is not pallidrom number");
		 }

	}

}
