package Practice.IO_Operator;

import java.util.Scanner;

public class A_10869 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int A = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int B = sc.nextInt();
		
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);

	}

}
