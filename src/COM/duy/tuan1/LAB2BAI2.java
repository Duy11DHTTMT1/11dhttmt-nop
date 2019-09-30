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
public class LAB2BAI2 {
        public static void main(String ...args) {
 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình giải phương trình bậc 2");
        System.out.print("Nhập a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b = ");
        double b = scanner.nextDouble();
        System.out.print("nhập c = ");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            if (b == 0) {
                System.out.print("Phương trình vô nghiệm");
                if (c == 0) System.out.print("Phương trình vô số nghiệm");
                else System.out.print("Phương trình vô nghiệm");
            } else {
                System.out.printf("Phương trình có 1 nghiệm x = %.2f", (-c/b));
                System.out.printf("Phương trình có 1 nghiệm x = %.2f", (-c / b));
            }
        } else {
            if (delta > 0) {
                System.out.println("Phương trình có 2 nghiệm kép");
                System.out.printf("x1 = %.2f \n", (-b + Math.sqrt(delta)) / (2*a));
                System.out.printf("x2 = %.2f", (-b - Math.sqrt(delta)) / (2*a));
                System.out.printf("x1 = %.2f \n", (-b + Math.sqrt(delta)) / (2 * a));
                System.out.printf("x2 = %.2f", (-b - Math.sqrt(delta)) / (2 * a));
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép");
                System.out.printf("x = %.2f", (-b / (2*a)));
                System.out.printf("x = %.2f", (-b / (2 * a)));
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        scanner.close();
    }
}
