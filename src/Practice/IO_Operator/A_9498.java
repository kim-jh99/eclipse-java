package Practice.IO_Operator;

import java.util.Scanner;

public class A_9498 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score < 0 || score > 100) System.out.println("잘못된 점수 입니다.");
		else if (score >= 90) System.out.println("A");
		else if (score >= 80) System.out.println("B");
		else if (score >= 70) System.out.println("C");
		else if (score >= 60) System.out.println("D");
		else System.out.println("F");
	}

}
