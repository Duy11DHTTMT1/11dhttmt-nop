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
public class LAB3BAI2 {
     public static void main(String... args) {
        int x = 8;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) System.out.printf("%d x %d = %d \n", i, j, i * j);
            System.out.println("-----------");
        System.out.println("+--------------------------+");
        System.out.println("1. Bảng cửu chương cần tìm.");
        System.out.println("2. Bảng cửu chương.");
        System.out.println("3. Kết thúc.");
        System.out.println("+--------------------------+");
        System.out.print("Lựa chọn: ");
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        switch (n) {
            case 1:
                System.out.println("Nhập vào 1 số: ");
                int x = scanner.nextInt();
                System.out.println("Bảng cửu chương cần tìm là: ");
                bangCuuChuongCanTim(x);
                break;
            case 2:
                System.out.println("Bảng cửu chương:\n--------------");
                bangCuuChuong();
                break;
            default:
                break;
        }
        scanner.close();
    }

    public static void bangCuuChuongCanTim(int numBer) {
        for (int i = 1; i <= 10; i++) System.out.printf("%d x %d = %d \n", numBer, i, numBer * i);
        System.out.println("-----------");
    }

    public static void bangCuuChuong() {
        for (int i = 2; i <= 9; i++) {
            bangCuuChuongCanTim(i);
        }
    }

}
