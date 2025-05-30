package test;

public class FindDuplicatesInArray {

	public static void duplicateFinder(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Element:" + arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 1, 2, 3, 4, 5, 5 };
		duplicateFinder(arr);

	}

}
