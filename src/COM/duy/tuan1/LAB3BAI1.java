/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COM.duy.tuan1;

import java.util.Scanner;

/**
 *
 * @author duy
 */
public class LAB3BAI1 {
     public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trinh kiểm tra số nguyên tố");
        System.out.print("Nhập vào 1 số nguyên N = ");
        int n = scanner.nextInt();
        boolean ok = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ok = false;
                break;
            }
        }
        if (ok) System.out.print(n + " là số nguyên tố");
        if (ok && n > 1) System.out.print(n + " là số nguyên tố");
        else System.out.print(n + " không phải là số nguyên tố");
    }

}

