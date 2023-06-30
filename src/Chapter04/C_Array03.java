package Chapter04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class C_Array03 {

	public static void main(String[] args) {
		
		int[] array1 = {1, 3, 8, 6, 7};
		System.out.println(Arrays.toString(array1));
		
		
		Arrays.sort(array1);
		System.out.println("오름차순" + Arrays.toString(array1));
		
		Integer[] array2 = {1, 3, 8, 6 ,7};
		Arrays.sort(array2, Comparator.reverseOrder());
		System.out.println("내림차순" + Arrays.toString(array2));
		
		int[] array3 = {1, 2, 3};
		
		int[] shallowArray = array3;
		
		System.out.println("array3 배열 : " + Arrays.toString(array3));
		shallowArray[1] = 5;
		
		System.out.println("array3 배열 : " + Arrays.toString(array3));
		System.out.println("shallowArray 배열 : " + Arrays.toString(shallowArray));
		
		System.out.println("=====================");
		
		
		int[] card = {1, 6, 8, 7, 2, 3};
		int[] newCard = new int[card.length];
		
		for(int i = 0; i < card.length; i++) {
			newCard[i] = card[i];
			
		
		}
		
		
		card[1] = 10;
		
		System.out.println("card 배열 : " + Arrays.toString(card));
		System.out.println("newCard 배열 : " + Arrays.toString(newCard));
		
		
		
		
//		int[] arrayDelete = new int[] {9, 10, 15};
//		for(int i = 1; i < arrayDelete.length - 1; i++) {
//			
//			
//		}
		
		int[] numbers = {21, 3, 22, 5, 42, 2, 29};
		
		System.out.println("짝수를 찾았습니다 : ");
		
		for(int number : numbers) {
			if(number % 2 == 0) {
				System.out.println(number);;
			}
	
		}
		
		System.out.println("홀수를 찾았습니다 : ");
		
		for(int number : numbers) {
			if(number % 2 == 1) {
				System.out.println(number);;
			}
				
		}
		
		
		int[] numbersA = {10, 20, 30, 40, 50};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을 데이터를 입력해 주세요.");
		int target = sc.nextInt();
		boolean found = false;
		
	
		
		for(int numbersB : numbersA) {
			if(numbersB == target) {
				found = true;
				break;
				
			}
		}
		
		if(found) System.out.println("데이터를 찾았습니다.");
		else System.out.println("데이터를 찾지 못했습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
