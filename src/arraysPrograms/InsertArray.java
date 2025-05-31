package arraysPrograms;

import java.util.Arrays;

public class InsertArray {

	public static void main(String[] args) {
		
		    int[] arr = {8, 5, 2, 11, 7};
	        int position = 2; // Insert at 3rd position (index 2)
	        int newElement = 4;

	        int[] newArr = new int[arr.length + 1];

	        // Copy elements before insertion point
	        for (int i = 0; i < position; i++) {
	            newArr[i] = arr[i];
	        }

	        // Insert new element
	        newArr[position] = newElement;

	        // Copy the rest of the original array
	        for (int i = position; i < arr.length; i++) {
	            newArr[i + 1] = arr[i];
	        }

	        System.out.println("New Array: " + Arrays.toString(newArr));
		

	}

}
