package Bai2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
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
}