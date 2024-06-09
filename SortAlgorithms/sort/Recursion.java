package sort;

public class Recursion {
	
//	here iterativeFactorial is coming as 1 need to rectify that error

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(iterativeFactorial(3));
		System.out.println(recursiveFactorial(3));
		
	}
	
	public static int recursiveFactorial(int num) {
		if(num ==0) {
			return 1;
		}
		
		return num * recursiveFactorial(num -1);
		
	}
	
	public static int iterativeFactorial(int num) {
		if(num == 0) {
			return 1;
		}
		
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= 1;
		}
		return factorial;
	}

}
