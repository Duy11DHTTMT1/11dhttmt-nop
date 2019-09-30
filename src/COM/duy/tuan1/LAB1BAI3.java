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
public class LAB1BAI3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính the tích khoi lap phuong!");
        System.out.print("Nhap canh cua khoi lap phuong: ");
        double canh = scanner.nextDouble();
        double theTich = Math.pow(canh, 3);
        System.out.printf("The tích cua khoi chu nhat = %.2f", theTich);
        scanner.close();
    }

    
}
