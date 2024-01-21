package Bai4;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Chương trình tính delta và căn delta của phương trình bậc 2: ax^2 + bx + c = 0");
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextInt();
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextInt();
		System.out.print("Nhập hệ số c: ");
		int c = scanner.nextInt();
		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta >= 0) {
			double canDelta = Math.sqrt(delta);

            System.out.println("Delta là: " + delta);
            System.out.println("Căn Delta là: " + canDelta);
        } else {
            System.out.println("Phương trình không có nghiệm thực.");
        }
	    scanner.close();
	}
}
