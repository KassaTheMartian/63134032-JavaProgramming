package Bai1;

import java.util.*;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Nhập danh sách số thực (n/N để hủy):");

        while(true){ 
        	try {
                System.out.print("Nhập số thực: ");
                double x = scanner.nextDouble();
                list.add(x);

                System.out.print("Nhập thêm (Y/N)? ");
                scanner.nextLine(); // Đọc ký tự mới sau khi nhập số
                String choice = scanner.nextLine();

                if (choice.equalsIgnoreCase("N")) {
                    break;
                }
            } catch (InputMismatchException e) {
                // Xử lý ngoại lệ khi người dùng nhập không phải số thực
                System.out.println("Lỗi: Vui lòng nhập số thực.");
                scanner.nextLine(); // Đọc dòng mới để tránh lặp vô hạn
            }
        } 
        
        System.out.println("Danh sách số thực đã nhập:");
        for (double number : list) {
            System.out.print(number + "\t");
        }
        
        // Tính tổng của danh sách
        double sum = 0;
        for (double number : list) {
            sum += number;
        }

        // Xuất tổng
        System.out.println("\nTổng của danh sách là: " + sum);
		scanner.close();
	}
	
}
