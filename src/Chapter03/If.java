package Chapter03;

import java.util.Scanner;

/*
 * 
 * 조건문 ( condition )
 * 프로그램에게 특정 조건을 검사하고, 그 결과에 따라 다른 행동을 하도록 명령하는 방식
 * 
 * if문, els문, 중복 if문, switch문
 * 
 * if문
 * 조건에 따라 실행시키고자 하는 로직(프로세스)이 다를 때 사용하는 구문
 * 조건이 true일 때 실행할 코드를 지정하는 구문
 * 사용방법(기본형)
 *
 */
//if (조건) {
//	//조건이 true일 때 실행할 코드
//}

// 조건 : true, false의 결과를 반환하는 boolean 형태의 표현식
// 조건 : true일 경우에만 {}에 작성한코드 블럭이 실행



public class If {

	public static void main(String[] args) {
		
		System.out.println("=== 기본 if문 ===");
		
		int age = 12;

		if (age > 19) {
				System.out.println("성인입니다.");
				}

		// if문의 경우 코드 블럭에 오는 실행할 코드가 하나의 구문(;이 한 개)이면
		// {}를 제거하고 사용 가능

		if (age < 19) System.out.println("성인입니다.");

		System.out.println("=========if else========");
		// 조건이 true일 경우와 false일 때 실해오디는 코드를 각각 지정한 구문
		// else문 : 조건이 false일 경우에만 실행할 코드 블록을 결정
		
		// 사용방법(기본형)
		
//		if (조건) {
//			// 조건이 참일 때 실행할 코드 블럭
//		} else {
//			// 조건이 거짓일 때 실행할 코드 블럭
//		}
//		
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자 입니다.");
		}
		
		// if-else문을 삼항연산자로 치환
		
		String message = age > 19 ? "성인입니다." : "미성년자 입니다.";
		
		
		//if문과 마찬가지로 else문도 코드 블럭에 오는 실행할 코드가
		//하나의 구문이면 {}를 제거하고 사용 가능
		
		if (age > 19) System.out.println("성인입니다.");
		else System.out.println("미성년자 입니다.");
		
		System.out.println("=== 중첩 if문 ===");
		// 중첩 if문
		// else문의 코드블록에 오는 코드가 한 줄일 때 {}를 제거 할 수 있음을 이용
		
		if (age > 19) System.out.println("성인입니다.");
		else if (age < 8) System.out.println("미취학 아동 입니다.");
		else System.out.println("청소년 입니다.");
		
		
		System.out.println("=== if문 실습 - 학점계산기 ===");
		
		// A, B, C, D, F 학점
		// 점수 0 ~ 100점
		
		
		// 0점 미만 100점 초과 : 유효하지 않은 점수입니다.
		
		// 89점 초과 : A 학점
		// 79점 초과 : B 학점
		// 69점 초과 : C 학점
		// 59점 초과 : D 학점
		// 나머지 F 학점
		
		// 결과값 출력
		
		int score = 84;
		String result = null;
		
		
		if (score < 0 || score > 100) System.out.println("유효하지 않은 점수입니다.");
		else if (score > 89) System.out.println("A학점 입니다.");
		else if (score > 79) System.out.println("B학점 입니다.");
		else if (score > 69) System.out.println("C학점 입니다.");
		else if (score > 59) System.out.println("D학점 입니다.");
		else System.out.println("F학점 입니다.");
		
		if (score < 0 || score > 100) result = "유효하지 않은 점수";
		else if (score > 89) result = "A";
		else if (score > 79) result = "B";
		else if (score > 69) result = "C";
		else if (score > 59) result = "D";
		else result = "F";
		System.out.println("결과 : " + result + "학점 입니다.");
		
		System.out.println("=== if문 실습 - 함수 위치 구하기 ===");
		
	/*
	 * x 변수를 선언
	 * y 변수를 선언
	 * 출력
	 * 
	 * x : 10
	 * y : 2
	 * 결과 : 1사분면
	 * 
	 * 1 사분면 : x,y 양수
	 * 2 사분면 : x 음수 , y 양수
	 * 3 사분면 : x, y 음수
	 * 4 사분면 : x 양수, y 음수
	 * 
	 * 
	 * 
	 */
//		
//		int x = 10, y = 2;
//		if (x > 0 && y > 0) result = "1";
//		else if (x < 0 && y > 0) result = "2";
//		else if (x < 0 && y < 0) result = "3";
//		else if(x > 0 && y < 0) result = "4";
//		System.out.println("결과 : " + result + "사분면 입니다.");
//		
		
		
		
	// 자바출력
	System.out.println("출력");
		
	// 자바입력
	Scanner sc = new Scanner(System.in);
	
	int x = 0, y = 0;
	String result2 = null;
	
	System.out.println("x값을 입력하세요.");
	x = sc.nextInt();
	
	System.out.println("y값을 입력하세요.");
	y = sc.nextInt();
	
	if (x > 0 && y > 0) result2 = "1사분면";
	else if (x < 0 && y > 0) result2 = "2사분면";
	else if (x < 0 && y < 0) result2 = "3사분면";
	else result2 = "4사분면";
	System.out.println("결과 : " + result2 + "입니다.");
	
	// FAQ //
	
	// 조건문에서는 불필요한 조건을 사용하지 않는 것이 중요
	// if ( x === true ) {} (권장 X)
	// if (x) (권장 O)
	
	// if ( x !== true) {}
	// if (!x)
	
	
	// Quiz
	String message2 = true ? "성인입니다." : "미성년자 입니다.";
	String message3 = false ? "성인입니다." : "미성년자 입니다.";
	
//	String message4 = true || "성인입니다." ; // 출력X
//	String message5 = false && "성인입니다." ; // 출력O


	
	
	
	
	
	
	
	
	
	
		
	}

}
