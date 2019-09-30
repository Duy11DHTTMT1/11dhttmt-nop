/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duy.tuan1;

import java.util.Scanner;

/**
 *
 * @author duy
 */
public class LAB1BAI2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính chu vi, dien tích hình chu nhat!");
        System.out.print("Nhap vào chieu dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhap vào chieu rong: ");
        double rong = scanner.nextDouble();
        double chiVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double min = Math.min(dai, rong);
        System.out.println("Chu vi = " + chiVi);
        System.out.printf("Dien tích = %.2f\n", dienTich);
        System.out.println("Canh nho nhat = " + min);
        scanner.close();
    }
}
    
