package org.example;



// a binary search to show logarithmic Complexity
public class LogarithmicComplexity {
    static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in the left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in the right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when the element is not present in the array
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int n = arr.length;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element is not present in the array");
        else
            System.out.println("Element is present at index " + result);
    }
}
