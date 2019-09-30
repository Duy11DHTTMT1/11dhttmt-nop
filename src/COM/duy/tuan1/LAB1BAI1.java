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
public class LAB1BAI1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ho và tên: ");
		String hoTen = scanner.nextLine();
		System.out.print("Ðiem TB: ");
		double diemTB = scanner.nextDouble();
		System.out.print(hoTen + " " + diemTB + " di?m\n");
		System.out.println(hoTen + " " + diemTB + " di?m");
		System.out.printf("%s %f di?m", hoTen, diemTB);
		scanner.close();
	}
    
}
