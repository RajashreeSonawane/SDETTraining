package PracticeExample;

public class ReverseArray {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 7, 9, 11, 15, 17, 19 };
		int size = 3;
		int n = arr.length;
		System.out.println("Original Array input is:");
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
		for (int i = 0; i < n; i += size) {
			int left = i;
			int right = Math.min(i + size - 1, n - 1);
			int temp;
			while (left < right) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left += 1;
				right -= 1;
			}
		}
		System.out.println("Reverse Array Output is:");
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
	}
}
