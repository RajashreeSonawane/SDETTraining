package PracticeExample;

public class SortArray {
	public static void main(String[] args) {
		int arr[] = { 2, 0, 2, 1, 1, 0 };
		int n = arr.length;
		System.out.println("Original Array input is:");
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = 0;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorting Array Output is:");
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
	}
}
