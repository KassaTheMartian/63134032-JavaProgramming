package Bai3;

import Bai2.SinhVienNTU;


public class SinhVienBiz extends SinhVienNTU {
	protected double diemMarketing;
	protected double diemSales;

	public SinhVienBiz(String hoTen, String nganh, double diemMarketing, double diemSales) {
		super(hoTen, nganh);
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}

	public SinhVienBiz(String hoTen, String nganh) {
		super(hoTen, nganh);
	}

	@Override
	public double getDiem() 
	{
		return (2*diemMarketing + diemSales) / 3;
	}

}
