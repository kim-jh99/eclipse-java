package Chapter05.C_Constructor.A_Getter_Setter;

public class Person {

	String name;
	String job;
	int age;
	
	// age의 값을 1 이상의 값으로만 받고 싶은 경우
	// if 조건문을 사용해 조건 검사 메서드르 만들어 줄 수 있다.
	
	void setAge (int num) {
		if (num <= 0) {
			System.out.println("잘못된 수를 입력하셨습니다.");
			return;
		}
		else age = num;
	}
	

}
