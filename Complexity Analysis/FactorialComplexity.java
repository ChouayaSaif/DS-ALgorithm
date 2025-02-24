package org.example;
import java.util.*;

// get all permutations of a string
public class FactorialComplexity {

    static void permute(char[] a, int l, int r)
    {
        // Base case
        if (l == r)
            System.out.println(new String(a));
        else {
            // Permutations made
            for (int i = l; i <= r; i++) {
                // Swapping done
                swap(a, l, i);

                // Recursion called
                permute(a, l + 1, r);

                // Backtrack
                swap(a, l, i);
            }
        }
    }

    // Function to swap characters at positions i and j in
    // the array
    static void swap(char[] arr, int i, int j)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Driver Code
    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        char[] arr = str.toCharArray();

        // Function call
        permute(arr, 0, n - 1);
    }
}
