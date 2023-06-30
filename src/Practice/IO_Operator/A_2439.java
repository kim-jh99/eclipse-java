package Practice.IO_Operator;

import java.util.Scanner;

public class A_2439 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		for(int r = 0; r < row; r++) {
			for(int s = 0; s < row - (r + 1); s++) {
				System.out.print(" ");
			}
			for(int t = 0; t <= r; t++) {
				System.out.print("*");
			}
		System.out.println();	
			
		}

	}

}
