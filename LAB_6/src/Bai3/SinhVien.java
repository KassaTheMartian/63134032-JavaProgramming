package Bai3;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Bai2.SanPham;

public class SinhVien {
	private String ten;
	private String email;
	private String sdt;
	private String cmnd;
	
	public SinhVien(String ten, String email, String sdt, String cmnd) {
		super();
		this.ten = ten;
		this.email = email;
		this.sdt = sdt;
		this.cmnd = cmnd;
	}

	public SinhVien() {
		super();
	}



	public static void main(String[] args) {
		ArrayList<SinhVien> danhSachSv = new ArrayList<SinhVien>();
		
		for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sinh viên " + (i + 1) + ":");
            SinhVien sv = new SinhVien();
            sv.nhap();
            danhSachSv.add(sv);
        }		
		
		for (SinhVien sv : danhSachSv)
		{
			sv.xuat();
		}
	}
	
	
	 public void nhap() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập tên sinh viên: ");
	        ten = scanner.nextLine();

	        do {
	            System.out.print("Nhập email: ");
	            email = scanner.nextLine();

	            if (isValidEmail(email)) {
	                System.out.println("Email hợp lệ.");
	            } else {
	                System.out.print("\nEmail không hợp lệ. Vui lòng nhập lại: ");
	            }
	        } while (!isValidEmail(email));
	        
	        
	        do {
	            System.out.print("Nhập số điện thoại: ");
	            sdt = scanner.nextLine();

	            if (isValidPhoneNumber(sdt)) {
	                System.out.println("Số điện thoại hợp lệ.");
	            } else {
	                System.out.print("\nSố điện thoại không hợp lệ. Vui lòng nhập lại: ");
	            }
	        } while (!isValidPhoneNumber(sdt));
	        
	        do {
	            System.out.print("Nhập số CMND: ");
	            cmnd = scanner.nextLine();

	            if (isValidCMND(cmnd)) {
	                System.out.println("Số CMND hợp lệ.");
	            } else {
	                System.out.print("\nSố CMND không hợp lệ. Vui lòng nhập lại: ");
	            }
	        } while (!isValidCMND(cmnd));
	        
	        System.out.println("");
	 }
	
	
	
	public void xuat() 
	{
		System.out.println("Tên: " + ten);
		System.out.println("Email: " + email);
		System.out.println("Số điện thoại: " + sdt);
		System.out.println("CMND: " + cmnd);
		System.out.println("");

	}
	
 	// Email check
	public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Phone number check
    public static boolean isValidPhoneNumber(String phone) {
    	String regex = "^0\\d{9,10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    // Id number check
    public static boolean isValidCMND(String cmnd) {
        String regex = "^[0-9]{12}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cmnd);
        return matcher.matches();
    }

	
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

}
