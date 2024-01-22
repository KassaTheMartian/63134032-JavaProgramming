package Bai2;

import java.util.*;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
        ArrayList<String> danhSachHoTen = new ArrayList<>();

        while (true) {
            menu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới sau khi nhập lựa chọn

            switch (choice) {
                case 1:
                    nhap(danhSachHoTen, scanner);
                    break;
                case 2:
                    xuat(danhSachHoTen);
                    break;
                case 3:
                    ngaunhien(danhSachHoTen);
                    break;
                case 4:
                    sapxep(danhSachHoTen);
                    break;
                case 5:
                    xoa(danhSachHoTen, scanner);
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
	}
	
	
    static void menu() {
        System.out.println("\t========================================");
        System.out.println("\t1. Nhập danh sách họ và tên");
        System.out.println("\t2. Xuất danh sách vừa nhập");
        System.out.println("\t3. Xuất danh sách ngẫu nhiên");
        System.out.println("\t4. Sắp xếp giảm dần và xuất danh sách");
        System.out.println("\t5. Tìm và xóa họ tên nhập từ bàn phím");
        System.out.println("\t6. Kết thúc");
        System.out.println("\t========================================");

        System.out.print("Chọn chức năng: ");
    }
	
    static void nhap(ArrayList<String> danhSachHoTen, Scanner scanner) {
    	while (true) {
            System.out.print("Nhập họ tên (N để thoát): ");
            String hoTen = scanner.nextLine();
            if (hoTen.equalsIgnoreCase("N")) break;
            danhSachHoTen.add(hoTen);
    	}
        System.out.println("Nhập danh sách thành công.");
    }
    
    static void xuat(ArrayList<String> danhSachHoTen) {
        System.out.println("Danh sách họ và tên:");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }
    
    static void sapxep(ArrayList<String> danhSachHoTen) {
        Collections.sort(danhSachHoTen);
        Collections.reverse(danhSachHoTen);
        System.out.println("Danh sách sau khi sắp xếp giảm dần:");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }
    
    static void ngaunhien(ArrayList<String> danhSachHoTen) {
        Collections.shuffle(danhSachHoTen);
        System.out.println("Danh sách ngẫu nhiên:");
        for (String hoTen : danhSachHoTen) {
            System.out.println(hoTen);
        }
    }
    static void xoa(ArrayList<String> danhSachHoTen, Scanner scanner) {
        System.out.print("Nhập họ tên cần xóa: ");
        String hoTenCanXoa = scanner.nextLine();
        boolean found = false;

        for (String hoTen : danhSachHoTen) {
            if (hoTen.equalsIgnoreCase(hoTenCanXoa)) {
                danhSachHoTen.remove(hoTen);
                found = true;
                System.out.println("Đã xóa thành công.");
                break; // Ngắt vòng lặp sau khi xóa
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy họ tên cần xóa trong danh sách.");
        }
    }
}
