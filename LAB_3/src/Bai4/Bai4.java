package Bai4;

import java.util.*;

public class Bai4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sinhVien[];
		float diem[];
		int n;
		System.out.print("Nhập vào số lượng sinh viên: ");
		n = scanner.nextInt();
        sinhVien = new String[n];
        diem = new float[n];
        
		for (int i = 0; i < n; i++)
		{
            scanner.nextLine();

            System.out.printf("Nhập tên sinh viên %d: ", i + 1);
    		sinhVien[i] = scanner.nextLine();
    		
            System.out.printf("Nhập điểm sinh viên %d: ", i + 1);
    		diem[i] = scanner.nextFloat();
		}
        System.out.println("Danh sách sinh viên: ");
		inSinhVien(sinhVien, diem, n);
		
		sapXepSinhVien(sinhVien, diem, n);
		
        System.out.println("Danh sách sinh viên sau khi sắp xếp: ");
		inSinhVien(sinhVien, diem, n);
		
		scanner.close();
	}
	static void inSinhVien(String[] sinhVien, float[] diem, int n)
	{
		String hocLuc = null;
		for (int i = 0; i < n; i++)
		{
			if(diem[i]<5) hocLuc = "Yếu";
			else if(diem[i] < 6.5) hocLuc = "Trung Bình";
			else if(diem[i] < 7.5) hocLuc = "Khá";
			else if(diem[i] < 9) hocLuc = "Giỏi";
			else hocLuc = "Xuất sắc";
            System.out.println("Họ tên: " + sinhVien[i] + " Điểm: " + diem[i] + " Học Lực: " + hocLuc);
    		
		}
	}
	
	static void sapXepSinhVien(String[] sinhVien, float[] diem, int n)
	{
		boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (diem[j] > diem[j + 1]) {
                    // Hoán đổi nếu phần tử thứ j lớn hơn phần tử thứ j+1
                    float tempFloat = diem[j];
                    diem[j] = diem[j + 1];
                    diem[j + 1] = tempFloat;
                    swapped = true;
                    
                    String tempString = sinhVien[j];
                    sinhVien[j] = sinhVien[j + 1];
                    sinhVien[j + 1] = tempString;
                    swapped = true;
                }
            }

            // Nếu không có sự hoán đổi, mảng đã được sắp xếp và có thể dừng vòng lặp
            if (!swapped) {
                break;
            }
        }
	}
}
