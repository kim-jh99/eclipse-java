package Chapter05.D_Inheritance;

class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void introiduce() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
	
}

class Student extends Person{
	private String school;
	
	public Student(String name, int age, String school){
		super(name, age);
		this.school = school;
	}
	
	@Override
	void introiduce() {
		super.introiduce();
		System.out.println("학교 : " + school);
	}
	
	
	
}


public class Z_Practice01 {
	public static void main(String[] args) {
		Student st = new Student("김주현", 25, "donga");
		st.introiduce();
		
	}
}
