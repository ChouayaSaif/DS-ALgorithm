package org.example;

// constant time complexity
public class ConstantComplexity {
    // Function to check if a number is even or odd
    public static void checkEvenOdd(int N)
    {
        int r = N % 2;

        if (r == 0) {
            System.out.println("Even");
        }
        // Otherwise
        else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args)
    {
        int N = 101;

        checkEvenOdd(N);
    }
}
