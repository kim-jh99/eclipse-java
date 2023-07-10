package Chapter05.B_Method;

class Calc {
	void sum(int[] nums) {
		int result = 0;
		for (int index = 0; index < nums.length; index++) {
			result += nums[index];
		}
		
		System.out.println("숫자들의 합은 " + result + "입니다.");
	}
	
}

class book {
	void count(int bookNum) {
		System.out.println("책은 " + bookNum + "권 입니다");
	}
	
}

class MidTerm {
	int score(int[] scores) {
		int result = 0;
		for (int index = 0; index < scores.length; index++) {
			result += scores[index];
		}
	return result;
	}
	
	
}

class Bus {
	void take(int money) {
		while(true) {
			if(money < 2000) {
				System.out.println("교통카드를 충전해 주세요");
				return;
			}
			System.out.println("버스를 탑니다. 어서오세요.");
			money -= 1200;
		}
	}
}

public class Method03 {

	public static void main(String[] args) {
		book myBook = new book();
		myBook.count(3);
		
		int nums[] = {100, 200};
		Calc calc = new Calc();
		calc.sum(nums);
		
		
		int[] studentA = {96, 65};
		int[] studentB = {95, 66};
		
		MidTerm mid = new MidTerm();
		int sumA = mid.score(studentA);
		int sumB = mid.score(studentB);
		
		if (sumA > sumB)System.out.println("A학생");
		else if (sumA < sumB)System.out.println("B학생");
		else System.out.println("A학생 == B학생");
		
		
		int money = 10000;
		Bus bus = new Bus();
		bus.take(money);
		
	}

}
