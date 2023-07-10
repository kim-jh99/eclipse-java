package Chapter03;

public class NestedLoop {

	public static void main(String[] args) {
		for(int i = 1 ; i <= 9; i++) {
			
			System.out.println(i + "단 구구단");
			for(int num = 1; num <= 9; num++) {
				
				System.out.println(i + " X " + num + " = " + (i*num));
			}
			System.out.println("");
		}
		
		
		System.out.println("===== 별 찍기 =====");
		
		int rows = 5;
		for(int index = 1; index <= rows; index++) {
			for(int j = 1; j <= index; j++)
				System.out.print("*");
		System.out.println();
		}
		
		
		System.out.println("===== 피라미드 별 찍기 =====");
		
		for(int i = 0; i < rows; i++) {
		
			for(int j = 0; j < rows - (i+1); j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= (2 * i); k++) { // 0행 ==> 1개, 1행 ==> 3개, 2행 ==> 5
				System.out.print("*");
			}
		System.out.println();
		}
		
		System.out.println("===== 가로 피라미드 별 찍기 =====");

		
		int row = 32, in, a;
		
		
		
		for(in = 0; in <= row; in++) {
			
			if(in <= row/2) 
			for(a = 0; a <= in; a++) System.out.print("*");
			
			else
			for(a = 0; a <= row - in; a++) System.out.print("*");
			
		System.out.println();


		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
