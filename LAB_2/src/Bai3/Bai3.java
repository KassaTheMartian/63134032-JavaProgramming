package Bai3;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double soDien = 0;
		double thanhTien = 0;

		System.out.println("chương trình nhập vào số điện sử dụng của tháng và tính tiền điện");
		try {
            System.out.print("Nhập số điện: ");
            soDien = scanner.nextDouble();

            if (soDien <= 0) {
                throw new IllegalArgumentException("Số điện phải lớn hơn 0.");
            }

            // Xử lý số điện khi là số dương
            System.out.println("Bạn đã nhập số điện là: " + soDien +" số");
        } catch (Exception e) {
            // Xử lý ngoại lệ (ví dụ: nhập không phải là số)
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            // Đóng Scanner (thực hiện sau khi nhập xong hoặc có lỗi)
            scanner.close();
        }		
		
		if (soDien < 50) thanhTien = soDien * 1000;
		if (soDien > 50) thanhTien =  50*1000 + (soDien - 50)*1200;
		
		System.out.println("Tổng số tiền là: " + thanhTien + " VND");
	}
}
