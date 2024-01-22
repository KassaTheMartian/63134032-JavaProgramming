package Bai3;

public class SanPham {
    private String tenSanPham;
    private double donGia;

    public SanPham(String tenSanPham, double donGia) 
    {
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
    }
    
    public String getTenSanPham()
    {
    	return this.tenSanPham;
    }
    
    public double getDonGia()
    {
    	return this.donGia;
    }
    
    
    public void setTenSanPham(String tenSanPham)
    {
    	this.tenSanPham = tenSanPham;
    }
    
    public void setDonGia(double donGia)
    {
    	this.donGia = donGia;
    }
}
