package Chapter03;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		for(int index = 10; index <= 20; index += 2) System.out.println(index);
			
		System.out.println("=============");
			
		for(int i = 10; i <= 20; i++) {
			if ( i % 2 == 0) System.out.println(i);
		}
		
		System.out.println("====== 구구단 3단 =======");
		
		int number = 3;
		
		for(int num = 1; num <= 9; num++) {
			System.out.println(number + "X" + num + "=" + (number * num));
			
		}
		
		
		System.out.println("====== 평균값 구하기 =======");
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int index = 1; index <= 5; index++) {
			
			System.out.println(index + "번째 숫자를 입력하세요.");
			int numbers = sc.nextInt();
			sum += numbers;
		}
		
		double average = sum / 5;
		System.out.println("입력한 숫자의 평균은 " + average + "입니다.");
		
		
	}

}
