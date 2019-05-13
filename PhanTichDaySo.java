/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this temp1late file, choose Tools | Templates
 * and open the temp1late in the editor.
 */
package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cr- Thang
 */
public class PhanTichDaySo {

    static int countWays(int n) {
        int table[] = new int[n+1];
        
        Arrays.fill(table, 0);
        table[0] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n; j++) {
                table[j] += table[j - i];
            }
        }
        return table[n]+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int N = sc.nextInt();
        System.out.println("So cach: "+ countWays(N));
    }
}
