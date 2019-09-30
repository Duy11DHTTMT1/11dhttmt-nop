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
public class LAB2BAI4 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+--------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+--------------------------------------+");
        System.out.print("Chọn chức năng: ");
        byte option = scanner.nextByte();
        switch (option) {
            case 1:
                System.out.print("Nhập a = ");
                float a = scanner.nextFloat();
                System.out.print("Nhập b = ");
                float b = scanner.nextFloat();
                Lab2Bai4.giaiPTB1(a, b);
                break;
            case 2:
                System.out.print("Nhập a = ");
                float x = scanner.nextFloat();
                System.out.print("Nhập b = ");
                float y = scanner.nextFloat();
                System.out.print("Nhập c = ");
                float z = scanner.nextFloat();
                Lab2Bai4.giaiPTB2(x, y, z);
                break;
            case 3:
                System.out.print("Nhập vào số ký điện của tháng = ");
                long soDien = scanner.nextLong();
                long tien = Lab2Bai4.tinhTienDien(soDien);
                long soKyDien;
                do {
                    System.out.print("Nhập vào số ký điện của tháng = ");
                    soKyDien = scanner.nextLong();
                    if (soKyDien <= 0)
                        System.out.println("Số ký điện không được nhỏ hơn hoặc bằng 0");
                } while (soKyDien <= 0);
                long tien = Lab2Bai4.tinhTienDien(soKyDien);
                System.out.print("Tiền điện phải trả là : " + tien);
                break;
            case 4:
                break;
        }
        scanner.close();
    }
}
