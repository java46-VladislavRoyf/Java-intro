package telran.numbers;

public class ArrayInt {
	
	public static int[] addNumber(int ar[], int number) {
		int res[] = new int[ar.length + 1]; // creates array as reference to array.length + 1 primitive

// copying from ar to res

		for(int i=0; i < ar.length; i++) {
			res[i] = ar[i];	
			
		}
		res[res.length - 1] = number;
		return res;
	}
	
	public static int[] insertNumber(int ar[], int index, int number) {
		//TODO
		return null;
	}
	
	
	public static int[] removeNumber(int ar[], int index) {
		//TODO
		return null;
	}
	
	
	public static int indexOf(int ar[], int number) {
		int res = -1;
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] == number) {
				res = i;
				break;
			}
		}
		return res;
	}
}
