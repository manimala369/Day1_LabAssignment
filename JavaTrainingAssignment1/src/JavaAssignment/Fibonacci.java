package JavaAssignment;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of terms");
		int n=sc.nextInt();
		int i=0,j=1,nextTerm;
		float sum = 0.0f;
		System.out.println("The first 20 Fibonacci numbers are: ");
		for(int c=1;c<=n;c++)
		{
		if(c<=1)
		nextTerm=c;
		else
		{
		nextTerm=i+j;
		i=j;
		j=nextTerm;
		sum += nextTerm;
		}
		System.out.print(nextTerm +" ");
		
		}System.out.print("\nThe average is " );
		System.out.format("%.1f", (sum/n));
		

	}

}
