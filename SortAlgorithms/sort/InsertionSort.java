package sort;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		didn't get much on this
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++ ) {
			
			int newElement = intArray[firstUnsortedIndex];
			
			int i;
			
			for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--) {
				intArray[i] = intArray[i-1];
			}
			
			intArray[i] = newElement;
		}
		
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}

}
