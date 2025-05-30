package arraysPrograms;

public class BubbleSortExample {

	public static void main(String[] args) {
int[] arr = {5, 2, 8, 1, 3};
        
        // Bubble sort algorithm to sort the array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Swap if the current element is greater than the next element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        // Printing the sorted array
        System.out.print("Sorted array in ascending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

	}

}
