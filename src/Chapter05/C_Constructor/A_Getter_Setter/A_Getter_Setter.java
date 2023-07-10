package Chapter05.C_Constructor.A_Getter_Setter;



public class A_Getter_Setter {

	public static void main(String[] args) {
		
			Person juhyeon = new Person();
			juhyeon.name = "김주현";
			juhyeon.job = "Developer";
			juhyeon.age = -99;
			System.out.println(juhyeon.age);
			
//			juhyeon.setAge(-10);
			juhyeon.setAge(90);
			
//			System.out.println(juhyeon.name + "의 나이는 " + juhyeon.setAge() + "세 입니다.");
					
	}

}
