package org.example;
public class App {
    public static void main( String[] args ) {

        int arr[] = {4, 7, 1, 3, 5, 2, 6};
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
            System.out.print("Sorted array: ");
            for (int i = 0; i < length; i++)
                System.out.print(arr[i] + " ");
    }
}
