package arraysPrograms;

import java.util.Scanner;

public class ArraySortAscending {

    public static void main(String[] args) {
        int a[] = new int[5];
        int temp;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 5 numbers:");

        // Taking input
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        // Sorting the array (Selection Sort)
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) { // Swap if a[i] is greater than a[j]
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // Printing sorted array
        System.out.println("Sorted Array in Ascending Order:");
        for (int num : a) {
            System.out.print(num + " ");
        }

        s.close(); // Close scanner to avoid resource leak
    }
}
