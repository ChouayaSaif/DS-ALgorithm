package org.example;
import java.util.*;

public class QuadraticComplexity {

    static boolean chkPair(int[] A, int x)
    {
        int size = A.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (A[i] + A[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    // Driver code
    public static void main(String[] args)
    {
        int[] A = { 0, -1, 2, -3, 1 };
        int x = -2;

        if (chkPair(A, x)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No " + x);
        }
    }

}
