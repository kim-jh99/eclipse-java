package Chapter05;

public class A_OOP {

	public static void main(String[] args) {
		class Car{
			String color;
			int speed;
			
			void accelerate() {
				speed += 10;
			}
			
			void brake() {
				speed -= 10;
			}
		}
		
		Car myCar = new Car();
		myCar.color = "Red";
		myCar.speed = 0;
		
		myCar.accelerate();
		System.out.println("현재 속도 : " + myCar.speed);
		
		class Animal {
			void makeSound() {
				System.out.println("동물이 소리를 내고 있습니다.");
			}
		}
		
		class Dog extends Animal {
			void makeSound() {
				System.out.println("멍");
			}
		}
		
		Dog myDog = new Dog();
		
		myDog.makeSound();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
