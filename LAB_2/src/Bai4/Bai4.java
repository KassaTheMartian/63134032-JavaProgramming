package Bai4;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		menu();
	}

	public static void menu()
	{
		System.out.println("+---------------------------------------------------+ \r\n"
				+ "1. Giải phương trình bậc nhất \r\n"
				+ "2. Giải phương trình bậc 2 \r\n"
				+ "3. Tính tiền điện \r\n"
				+ "4. Kết thúc \r\n"
				+ "+---------------------------------------------------+");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
        case 1:
        	giaiPhuongTrinhBac1();
            break;
        case 2:
        	giaiPhuongTrinhBac2();
        	break;
        case 3:
        	tinhTienDien();
            break;
        default:
            System.out.println("Lựa chọn không hợp lệ.");
		}
		scanner.close();

	}
	public static void giaiPhuongTrinhBac1()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chương trình tính nghiệm phương trình bậc nhất: ax + b = 0");
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextInt();
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextInt();
		if(a == 0){ 
			if(b == 0){ 
				System.out.println("Phương trình có vô số nghiệm");
			} 
			else{ 
				System.out.println("Phương trình vô nghiệm");
			}
			}
		else{ 
			double nghiem = -b/a;
			System.out.println("Phương trình có nghiệm là: " + nghiem);
		} 
		
	    scanner.close();
	}
	public static void giaiPhuongTrinhBac2()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chương trình tính nghiệm của phương trình bậc 2: ax^2 + bx + c = 0");
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextInt();
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextInt();
		System.out.print("Nhập hệ số c: ");
		int c = scanner.nextInt();
		if (a == 0) {
			PhuongTrinhBacNhat(b,c);
			scanner.close();
			return;
		}
		double delta = Math.pow(b, 2) - 4 * a * c;
		PhuongTrinhBacHai(delta,a,b,c);
		scanner.close();
	}
	public static void PhuongTrinhBacNhat(double a, double b)
	{
		if(a == 0){ 
			if(b == 0){ 
				System.out.println("Phương trình có vô số nghiệm");
			} 
			else{ 
				System.out.println("Phương trình vô nghiệm");
			}
			}
		else{ 
			double nghiem = -b/a;
			System.out.println("Phương trình có nghiệm là: " + nghiem);
		} 
	}
	
	public static void PhuongTrinhBacHai(double delta, double a, double b, double c)
	{
		if (delta < 0) {
            System.out.println("Phương trình không có nghiệm thực");
			return;
        }
		else if( delta == 0) {
			double nghiemKep =  -b/(2*a);
            System.out.println("Phương trình có nghiệm kép là: " + nghiemKep);	
		}
		else if( delta > 0) {
			double x1 = (- b + Math.sqrt(delta)) / (2 * a);
			double x2 = (- b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt là: ");	
            System.out.println("X1 = " + x1);	
            System.out.println("X1 = " + x2);	

		}

	}
 	public static void tinhTienDien() {	
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
