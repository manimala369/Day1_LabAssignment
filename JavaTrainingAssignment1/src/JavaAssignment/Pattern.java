package JavaAssignment;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of rows: ");
		int rows=sc.nextInt();
		for(int i = 1; i <= rows; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

	}

}
