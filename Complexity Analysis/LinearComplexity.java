package org.example;

public class LinearComplexity {
    static int search(int[] arr, int N, int x)
    {
        for (int i = 0; i < N; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 10;
        int N = arr.length;

        int result = search(arr, N, x);
        if (result == -1) {
            System.out.println(
                    "Element is not present in array");
        }
        else {
            System.out.println(
                    "Element is present at index " + result);
        }
    }
}
