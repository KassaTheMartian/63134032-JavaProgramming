package Bai2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.print("Nhập vào chiều dài (cm): ");
		float chieuDai = scanner.nextFloat();
		System.out.print("Nhập vào chiều rộng (cm): ");
		float chieuRong = scanner.nextFloat();
		float chuVi = (chieuDai + chieuRong) * 2;
		float dienTich = chieuDai * chieuRong;
		float canhNhoNhat =  Math.min(chieuDai, chieuRong);
		System.out.println("Chu vi là : " + chuVi + " cm");
		System.out.println("Diện tích là : " + dienTich +" cm2");
		System.out.println("Cạnh nhỏ nhất là : " + canhNhoNhat +" cm");
        scanner.close();

	}

}
