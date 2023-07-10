package Chapter05.C_Constructor;

class Food {
	private String name;
	private int Price;
	private int Stock;
	
	Food(){}
	
	Food(String name, int Price, int Stock) {
		this.name = name;
		this.Price = Price;
		this.Stock = Stock;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getPrice() {
		return Price;
	}
	
	void setPrice(int Price) {
		if (Price < 0) {
			System.out.println("가격을 잘못 입력히였습니다.");
			return;
		}
		else {
			this.Price = Price;
		}
	}
	
	int getStock() {
		return Stock;
	}
	
	void setStock(int Stock) {
		if (Stock < 0) {
			System.out.println("재고를 잘못 입력히였습니다.");
			return;
		}
		else {
			this.Stock = Stock;
			
		}
	}
	
	void printInfo() {
		System.out.println("음식 : " + name + ", 가격 : " + Price);
	}
	
}




public class Z_Practice {

	public static void main(String[] args) {

		Food food = new Food("피자", 21000, 2);
		food.printInfo();
		
		food.setStock(10);
		System.out.println("재고 : " + food.getStock());
		
		
		
		
	}

}
