package Chapter05.E_Polymorphism;
// 오버로딩
class DemoClass {
	void demo(int a) {
		System.out.println("a: " + a);
	}
	
	void demo(int a, int b) {
		System.out.println("a and b : " + a + " " + b);
	}
}

class SuperClass {
	void demo() {
		System.out.println("SuperClass method");
	}
}

class SubClass extends SuperClass {
	@Override
	void demo() {
		System.out.println("SubClass method");
	}
}



public class F_Overloading_Overriding {
	// 오버로딩
	// : 같은 이름의 메서드를 여러 개 가지면서 매개변수의 유형과 개수를 다르게 함.
	// : 동일한 이름의 메서드가 다른 작업을 수행
	
	// 오버로딩 특징
	// 1. 동일한 클래스 내에서 발생
	// 2. 메서드의 시그니처 (이름, 매개변수의 유형과 순서)가 다르다.
	// 3. 반환 유형은 오버로딩을 결정하는데 영향 X
	
	// 오버라이딩
	// : 하위 클래스가 상위 클래스의 메서드를 재정의 함.
	// : 하위 클래스는 상위 클래스의 메서드를 자신이 요규하는 상황에 맞게 변경 가능
	
	// 오버라이딩 특징
	// 1. 다른 클래스(주로 하위 클래스)에서 발생
	// 2. 메서드의 시그니처는 동일해야 함.
	// 3. 반환 유형도 동일해야 함.
	
}






