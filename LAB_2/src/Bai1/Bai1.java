package Bai1;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
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

}
