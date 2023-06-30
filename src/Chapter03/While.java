package Chapter03;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		int number = 0;
		
		while(true) {
			if((number % 2) == 0) {
				number++;
				continue;
			}
			
			System.out.println(number);
			number++;
			if(number == 200) break;
	
		}
		
		int i = 1;
		
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		
		int number2 =0;
		
		do {System.out.println(number2);
			number2++;	
		} while (number2 <= 20);
		
		
		
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		do {System.out.println("yes 또는 no를 입력하세요.");
		input = sc.next();
		} while(!input.equals("yes") && !input.equals("no"));
		
		System.out.println(input);
		
		
		
		
		
		int number3 = 100;
		while(number3 >= 1) {
			number3 /= 2;
			System.out.println(number3);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
