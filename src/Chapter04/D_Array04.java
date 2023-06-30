package Chapter04;

public class D_Array04 {

	public static void main(String[] args) {
		
		int[][] array;
		array = new int[3][3];
		
		int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		array[0][0] = 1;
		array[0][1] = 2;
		array[0][2] = 3;
		array[1][0] = 4;
		array[1][1] = 5;
		array[1][2] = 6;
		array[2][0] = 7;
		array[2][1] = 8;
		array[2][2] = 9;
		
		int[][] array3 = new int[3][];
		
		array3[0] = new int[2];
		array3[1] = new int[3];
		array3[2] = new int[1];
		
		
		int value = array[0][0];
		
		System.out.println(value);
		
		array[0][0] = 10;
		
		System.out.println(array[0][0]);
		System.out.println(value);
		
		int[][] array4 = new int[3][4];
		int count = 1;
		for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 3; j++) {
				array4[i][j] = count++;
				System.out.print(array4[i][j] + " ");
				
			}
			System.out.println();
		}
		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; i < 4; i++) {
//				System.out.print(array4[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		System.out.println("==================");
	
		
		int[][] array5 = new int[6][3];
		int store = 1;
		
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j <= 2; j++) {
				if(store % 2 == 1) {
					array5[i][j] = store++;
				}
				store++;	
				
				System.out.print(array5[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("==================");
		
		int[][] A = {{1, 2, 3}, {4 ,5, 6}, {7, 8, 9}};
		int[][] B = {{9, 8, 7}, {6 ,5, 4}, {3, 2, 1}};
		int[][] C = new int[3][3];
		
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				C[i][j] = A[i][j] + B[i][j];
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
