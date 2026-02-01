package tut01;

public class Act1 {
	public static int findMax(int arr[], int n) {
		int max = arr[0];
		for(int i = 1; i < n; i++) {
			max = arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		findMax(arr, arr.length);
		System.out.println();
	}
}
