package Chapter01;

import java.util.Scanner;

public class IO {

	public static void main(String[] args) {
		
		//실행 단축키 : ctrl + f11
		// console
		// console을 통해서 개발자로 부터 입력을 받을 때 scanner 객체를 사용한다
		
		//입출력
		
		//console로 데이터를 출력할 때 system 객체를 사용한다.
		
		// 1. 출력
		// 출력의 기본형 : System.out.println(출력하고하는 변수 혹은 상);
		System.out.println();
		//syso
		
		// ctrl + fn + space : 자동완성 기능
		// syso 입력 후 ctrl + fn + space 사용
		System.out.println("안녕하세요. 이것은 리터럴 상수 문자열입니다.");
		
		String comment = "안녕하세요.  변수에 저장 된 문자열입니다";
		System.out.println(comment);
		
		//2. 입력
		// 입력의 기본형 : Scanner sc = new Sacanner(System.in);
		
		Scanner sc = new Scanner(System.in);
		//Scanner 객체 .next**(); 기능(메서드)를 사용해서 입력 받을 수 있다.
		
		int inputInteger = sc.nextInt();
		System.out.println("입력 받은 값 :  ");
		System.out.println(inputInteger);
		
		
	}

}
