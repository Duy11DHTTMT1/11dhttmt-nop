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
public class LAB1BAI4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính delta cua phuong trình bac 2!");
        System.out.print("Nhap a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhap b = ");
        double b = scanner.nextDouble();
        System.out.print("Nhap c = ");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("delta < 0");
        } else {
            System.out.printf("Can delta = %.2f", Math.sqrt(delta));
        }
        scanner.close();
    }

}
