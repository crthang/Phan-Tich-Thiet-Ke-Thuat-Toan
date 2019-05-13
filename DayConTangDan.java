package test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cr- Thang
 */
public class DayConTangDan {
    public static void timDay(int arr[], int n) {
        System.out.print("Array Input : ");
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        System.out.println();
        
        //5, 6*, 3, 5, 7, 8, 9, 1, 2*
        //max luu do dai dai nhat
        //len luu chieu dai dai nhat
        int max = 1, len = 1, maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                len++;                  
            } else {
                if (max < len) {
                    max = len; 
                    maxIndex = i - max;
                }
                len = 1;
            }
        }
        if (max < len) {
            max = len;;
            maxIndex = n - max;
        }
        System.out.print("Array Output: ");
        for (int i = maxIndex; i < max + maxIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nLength: "+max);
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 3, 5,1, 7, 8, 9, 1, 2};
        int n = arr.length;
        timDay(arr, n);
        
        int arr2[] = {1, 2, 3, 4, 9, 10, 3, 6, 7, 2, 3, 4, 5};
        int n2 = arr.length;
        timDay(arr2, n2);
    }
}
