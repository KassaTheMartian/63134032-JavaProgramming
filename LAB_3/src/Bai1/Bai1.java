package Bai1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean flag = true; 
		int n;
		System.out.print("Nhập vào số N muốn kiểm tra là số nguyên tố: ");
		n = scanner.nextInt();
		
		for(int i=2; i < n-1; i++)
		{
			if(n % i == 0)
			{ 
				flag = false; 
				break; 
			} 
		}
		if (flag == true) System.out.println(n+ " là số nguyên tố");
		else System.out.println(n+ " không phải là số nguyên tố");

		scanner.close();
	}
}
