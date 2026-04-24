package demo;

import java.util.Scanner;

public class SampleTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(n);
		int count=0;
		while(n!=0)
		{
			int rem=n%10;
			System.out.println(rem);
			if(rem==0)
			{
				count++;
			}
			n=n/10;
		}
		if(count>0)
			System.out.println("Its a duck number");
		else
			System.out.println("Not a duck number");	
	}
	}

