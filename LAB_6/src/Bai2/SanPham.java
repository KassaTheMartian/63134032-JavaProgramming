package Bai2;

import java.util.*;

public class SanPham {
	private String tenSp;
	private double donGia;
	private String hang;
	
	public SanPham(String tenSp, double donGia, String hang) {
		super();
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.hang = hang;
	}


	public static void main(String[] args) {
		ArrayList<SanPham> danhSachSp = new ArrayList<SanPham>();
        
		for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin sản phẩm " + (i + 1) + ":");
            SanPham sp = new SanPham();
            sp.nhap();
            danhSachSp.add(sp);
        }		
		
		for (SanPham sp : danhSachSp)
		{
            if (sp.getHang().equalsIgnoreCase("Nokia"))
			{
				sp.xuat();
			}
		}
		
	}

	 public void nhap() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập tên sản phẩm: ");
	        tenSp = scanner.nextLine();

	        System.out.print("Nhập giá sản phẩm: ");
	        donGia = scanner.nextDouble();
	        scanner.nextLine(); // Đọc bỏ dòng new line

	        System.out.print("Nhập hãng sản phẩm: ");
	        hang = scanner.nextLine();
	        
	        System.out.println("");
	 }
	
	public void xuat() 
	{
		System.out.println("Tên: " + this.tenSp);
		System.out.println("Giá: " + this.donGia);
		System.out.println("Hãng: " + this.hang);
		System.out.println("");
	}
	

	public SanPham() {
		super();
	}

	public String getTenSp() {
		return tenSp;
	}


	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}


	public double getDonGia() {
		return donGia;
	}


	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}


	public String getHang() {
		return hang;
	}


	public void setHang(String hang) {
		this.hang = hang;
	}


}
