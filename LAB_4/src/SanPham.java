import java.util.*;

public class SanPham {
	
	private String tenSp;
	private double donGia;
	private double giamGia;
	
    public SanPham() 
    {
        this(null,0,0);
    }
	
    public SanPham(String tenSp, double donGia)
    { 
    	this(tenSp, donGia, 0);
    } 
    
    public SanPham(String tenSp, double donGia, double giamGia) 
    {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
	
	public double getThueNhapKhau()
	{
        return 0.1 * donGia;
	}
	public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sản phẩm: ");
        tenSp = scanner.nextLine();

        System.out.print("Nhập đơn giá: ");
        donGia = scanner.nextDouble();

        System.out.print("Nhập giảm giá: ");
        giamGia = scanner.nextDouble();

        // Đọc ký tự mới sau khi nhập giá trị số
        scanner.nextLine();
        scanner.close();
    }
	
	
	public static void main(String[] args) {
        // Sử dụng lớp SanPham
        SanPham sp = new SanPham("Laptop", 1000, 100);
        sp.xuat();

        // Nhập thông tin từ người dùng
        SanPham spMoi = new SanPham();
        spMoi.nhap();
        spMoi.xuat();
	}

}
