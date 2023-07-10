package Chapter05.E_Polymorphism;


// 1. 다형성
// Animal, Cat 그리고 Dog 클래스
// Animal 클래스는 sound 메소드
// Cat 과 Dog 클래스들은 Animal 클래스를 상속
// Cat 과 Dog 클래스들은 sound 메소드를 오버라이딩하여,
// 각각 "meow"와 "bark"를 출력

class Animal1 {
	public void sound (){
		System.out.println("The animal makes a sound");
	}
}

class Cat1 extends Animal1{
	@Override
	public void sound () {
		super.sound();
		System.out.println("meow");
	}
}

class Dog1 extends Animal1{
	@Override
	public void sound () {
		super.sound();
		System.out.println("bark");
	}
	
}

// 2. instanceof 연산자
// 위에서 정의한 Animal, Cat, Dog 클래스를 이용해서
// 다형성을 확인하는 메소드를 작성

// 메소드는 Animal 타입의 매개변수를 받고,
// instanceof 연산자를 사용하여 매개변수가 Cat의 인스턴스인지 Dog의 인스턴스인지 확인하여 출력

class AnimalChecker {
	void checkAnimalType(Animal1 animal) {
		if(animal instanceof Cat1) {
			System.out.println("This is a cat");
		}
		else if (animal instanceof Dog1){
			System.out.println("This is a dog");
		}
		else System.out.println("Unknown animal type");
	}
}



public class Z_Practice01 {
	public static void main(String[] args) {
		
		AnimalChecker animalChecker = new AnimalChecker();
		Animal1 mypet1 = new Cat1();
		animalChecker.checkAnimalType(mypet1);
		Animal1 mypet2 = new Dog1();
		animalChecker.checkAnimalType(mypet2);
		Animal1 mypet3 = new Animal1();
		animalChecker.checkAnimalType(mypet3);
		
		
		
	}

}
