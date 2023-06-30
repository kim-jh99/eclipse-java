package Chapter02;

public class practice {

	public static void main(String[] args) {
		
		
		/*
		 * 
		 * 실습
		 * 
		 * 
		 * score이라는 변수명을 가진 숫자 데이터 타입의 변수를 선언하고 초깃값으로 65를 할당해주세요
		 * result라는 변수명을 가진 문자열(String) 데이터 타입의 변수를 선언해주세요
		 * 
		 * score이 0보다 작거나 100보다 크면 (계산불가)
		 * 
		 * 89보다 크면 (A학점)
		 * 79보다 크면 (B학점)
		 * 69보다 크면 (C학점)
		 * 59보다 크면 (D학점)
		 * 나머지는 (F학점)
		 * 
		 */
		
		int score = 65;
		String result;
		
		result = score > 100 || score < 0 ? "계산 불가능 합니다"
				: score > 89 ? "A학점 입니다"
				: score > 79 ? "B학점 입니다"
				: score > 69 ? "C학점 입니다"
				: score > 59 ? "D학점 입니다" : "F학점 입니다";
		
				
		System.out.println(result);
		
		
		
		
	}

}
