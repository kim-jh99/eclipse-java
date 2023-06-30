package Chapter04;

public class B_Array02_ForEach {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.println(numbers[i]);
		}
		
		System.out.println("==============");
		
		for (int number : numbers) {
			System.out.println(number);
		}
		
	

	}

}
