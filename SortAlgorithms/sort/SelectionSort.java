package sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		for(int lastUnsorttedIndex = intArray.length-1; lastUnsorttedIndex > 0; lastUnsorttedIndex--) {
			
			int largest = 0;
			
			for (int i = 1; i <= lastUnsorttedIndex; i++) {
				if(intArray[i] > intArray[largest]) {
					largest=i;
				}	
			}
			
			swap(intArray,largest,lastUnsorttedIndex);
		}
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}
	
	public static void swap(int[] array, int i, int j) {
		if(i == j) {
			return;
		}
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
		
	}
	

}
