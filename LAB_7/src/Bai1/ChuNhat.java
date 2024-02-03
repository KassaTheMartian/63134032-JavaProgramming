package Bai1;

import java.util.*;

public class ChuNhat {
	protected double dai;
	protected double rong;
	
	
	public ChuNhat(double dai, double rong) {
		super();
		this.dai = dai;
		this.rong = rong;
	}


	public ChuNhat() {
		super();
	}

	
	public void xuat()
	{
		System.out.println("Hình chữ nhật");
		System.out.println("Chiều dài: " + dai +", Chiều rộng: "+ rong);
		System.out.println("Chu vi: " + this.getChuVi() +"cm, Diện tích: "+ this.getDienTich()+" cm^2");
		System.out.println();
	}
	
	public void nhap()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Chiều dài: ");
		do {
            System.out.print("Nhập chiều dài: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Vui lòng nhập một số.");
                System.out.print("Nhập độ dài (phải là số dương): ");
                scanner.next(); // Bỏ qua giá trị không phải số
            }
            dai = scanner.nextDouble();

            if (dai <= 0) {
                System.out.println("Độ dài phải là số dương. Vui lòng nhập lại.");
            }
        } while (dai <= 0);
		
		do {
            System.out.print("Nhập chiều rộng: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Vui lòng nhập một số.");
                System.out.print("Nhập độ dài (phải là số dương): ");
                scanner.next(); // Bỏ qua giá trị không phải số
            }
            rong = scanner.nextDouble();

            if (rong <= 0) {
                System.out.println("Độ dài phải là số dương. Vui lòng nhập lại.");
            }
        } while (rong <= 0);
	}
	
	public double getChuVi()
	{
		return (dai+rong)*2;
	}
	
	
	public double getDienTich()
	{
		return dai*rong;
	}
	

	public double getDai() {
		return dai;
	}


	public void setDai(double dai) {
		this.dai = dai;
	}


	public double getRong() {
		return rong;
	}


	public void setRong(double rong) {
		this.rong = rong;
	}

}
