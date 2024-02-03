package Bai3;

import Bai2.SinhVienNTU;

public class SinhVienIT extends SinhVienNTU{
	protected double diemJava;
	protected double diemHtml;
	protected double diemCss;

	public SinhVienIT(String hoTen, String nganh, double diemJava, double diemHtml, double diemCss) {
		super(hoTen, nganh);
		this.diemJava = diemJava;
		this.diemHtml = diemHtml;
		this.diemCss = diemCss;
	}

	public SinhVienIT(String hoTen, String nganh) {
		super(hoTen, nganh);
	}

	@Override
	public double getDiem() {
		return (2*diemJava + diemHtml + diemCss) / 4;
	}

}
