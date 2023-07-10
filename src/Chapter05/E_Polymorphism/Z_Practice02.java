package Chapter05.E_Polymorphism;

// Person이라는 부모 클래스 생성
// 이 클래스를 상속하는 Student와 Teacher 두 개의 자식 클래스 생성
// 세개의 클래스 모두는 각자의 방식으로 자신을 소개하는 introduce() 메서드

class Person{
	public void introduce() {
		System.out.println("사람에 속합니다.");
	}
}

class Student extends Person {
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("그 중 학생입니다.");
	}
}

class Teacher extends Person {
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("그 중 선생입니다.");
	}
}

class PersonDemo {
	public void Check(Person ps) {
		if(ps instanceof Student) System.out.println("학생에 속합니다.");
		else if(ps instanceof Teacher) System.out.println("선생에 속합니다.");
		else System.out.println("알 수 없습니다.");
	}
}

// PersonDemo라는 클래스에서 다형성을 보여주는 코드를 작성
public class Z_Practice02 {
	public static void main(String[] args) {
		
		Person st = new Student();
		st.introduce();
		Person tc = new Teacher();
		tc.introduce();
		Person ps = new Person();
		ps.introduce();
		
		System.out.println();
		System.out.println("======인스턴스 확인=======");
		System.out.println();
		
		PersonDemo pd = new PersonDemo();
		Person me1 = new Student();
		pd.Check(me1);
		Person me2 = new Teacher();
		pd.Check(me2);
		Person me3 = new Person();
		pd.Check(me3);
		
		
	}
}