package Bai1;

public class Vuong extends ChuNhat{
	
	
	public Vuong(double canh) {
		super(canh, canh);
	}

	@Override
	public void xuat() 
	{
		System.out.println("Cạnh: " + dai);
		System.out.println("Chu vi: " + this.getChuVi() +"cm, Diện tích: "+ this.getDienTich()+" cm^2");
		System.out.println();
	}
}
