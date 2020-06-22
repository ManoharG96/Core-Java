
public class ArrayProgram {

	public static void main(String[] args) {
		int [] arr = {12,34,56,67};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2 == 0) {
				sum = sum+arr[i];
			}
		}
		System.out.println(sum);
	}
}
