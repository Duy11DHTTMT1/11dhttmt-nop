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
public class LAB3TUAN3 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập sô phần tử của mảng: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số phần tử của mảng: ");
        byte n = scanner.nextByte();
        int[] arrNum = new int[n];
        if (n > 0) {
            int[] arrNum = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("a [ " + (i + 1) + " ] = ");
                arrNum[i] = scanner.nextInt();
            }
            nhap(arrNum);
            System.out.println("Các phần tử của mảng là:");
            for (int i = 0; i < n; i++) System.out.print(arrNum[i] + " ");
            xuat(arrNum);

            System.out.println();
            Arrays.sort(arrNum);
            System.out.println("Array Sort:");
            for (int i = 0; i < n; i++) System.out.print(arrNum[i] + " ");
            xuat(arrNum);

            System.out.println();
            int min = arrNum[0], Min = 0;
            for (int i = 1; i < n; i++) {
                Min = Math.min(min, arrNum[i]);
            }
            System.out.println("Min = " + Min);

            int tong = 0, dem = 0;
            for (int i = 0; i < n; i++) {
                if (arrNum[i] % 3 == 0) {
                    tong += arrNum[i];
                    dem++;
                }
            }
            float tbCong = tong / dem;
            System.out.println("Trung bình cộng các số chia hết cho 3 = " + tbCong);
            timMin(arrNum);

            trungBinhCongChiaHet3(arrNum);
        } else {
            System.out.print("Số phần tử phải lớn hơn 0");
        }
        scanner.close();
    }

    private static void trungBinhCongChiaHet3(int[] arrNum) {
        int tong = 0, dem = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i] % 3 == 0) {
                tong += arrNum[i];
                dem++;
            }
        }
        float tbCong = (float) tong / dem;
        System.out.println("Trung bình cộng các số chia hết cho 3 = " + tbCong);
    }

    public static void nhap(int[] arrNum) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrNum.length; i++) {
            System.out.print("a [ " + (i + 1) + " ] = ");
            arrNum[i] = scanner.nextInt();
        }
    }

    public static void xuat(int[] arrNum) {
        for (int i = 0; i < arrNum.length; i++) System.out.print(arrNum[i] + " ");
    }

    public static void timMin(int[] arrNum) {
        System.out.println();
        int min = arrNum[0], Min = 0;
        for (int i = 1; i < arrNum.length; i++) {
            Min = Math.min(min, arrNum[i]);
        }
        System.out.println("Min = " + Min);
    }

}
