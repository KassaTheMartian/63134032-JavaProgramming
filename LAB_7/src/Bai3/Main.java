package Bai3;

import Bai2.SinhVienNTU;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		ArrayList<SinhVienNTU> danhSachSv = new ArrayList<SinhVienNTU>();

		nhap(danhSachSv);
        System.out.println("Danh sách sinh viên: ");
		xuat(danhSachSv);
		
        System.out.println("Danh sách sinh viên giỏi: ");
		SVGioi(danhSachSv);
		
        System.out.println("Danh sách sinh viên đã sắp xếp theo điểm: ");
        SapXep(danhSachSv);		
        xuat(danhSachSv);

	}

	
	public static void nhap(ArrayList<SinhVienNTU> danhSachSv)
	{
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (true) {
			String check = "Y";
			if (flag == false)
			{
            System.out.print("Y: nhập tiếp, N:dừng lại.");
            check = scanner.nextLine();
			}
			flag = false;
            if (check.equalsIgnoreCase("N")) break;
            System.out.print("Ngành: 1.IT      2.BIZ\nLựa chọn: ");
            int nganh;
            do {
                while (!scanner.hasNextInt()) {
                    System.out.println("Vui lòng nhập một số nguyên.");
                    System.out.print("Nhập 1 hoặc 2: ");
                    scanner.nextLine();                }

                nganh = scanner.nextInt();
                scanner.nextLine();
                if (nganh != 1 && nganh != 2) {
                    System.out.println("Số nhập không hợp lệ. Vui lòng nhập lại.");
                }

            } while (nganh != 1 && nganh != 2);

            if(nganh == 1)
            {
                System.out.print("Họ và tên: ");
            	String hoTen = scanner.nextLine();
                System.out.print("Điểm Java: ");
                double diemJava = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Điểm Html: ");
                double diemHtml = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Điểm Css: ");                
                double diemCss = scanner.nextDouble();
                scanner.nextLine();
        		SinhVienNTU sv1 = new SinhVienIT(hoTen, "IT", diemJava,diemHtml,diemCss);
        		try {
					danhSachSv.add(sv1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            if(nganh == 2)
            {
                System.out.print("Họ và tên: ");
            	String hoTen = scanner.nextLine();
                System.out.print("Điểm Marketing: ");
                double diemMarketing = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Điểm Sales: ");
                double diemSales = scanner.nextDouble();
                scanner.nextLine();
        		SinhVienNTU sv1 = new SinhVienBiz(hoTen, "BIZ", diemMarketing,diemSales);
        		try {
					danhSachSv.add(sv1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }

    	}
        System.out.println("Nhập danh sách thành công.");
	}
	
	public static void xuat(ArrayList<SinhVienNTU> danhSachSv)
	{
		for (SinhVienNTU sv : danhSachSv)
		{
		System.out.print("Họ tên: " + sv.getHoTen() + "    Ngành: " + sv.getNganh() + "    Điểm: " + sv.getDiem()  +"    Học lực: " +sv.getHocLuc() + "\n");
		}
	}
	public static void SVGioi(ArrayList<SinhVienNTU> danhSachSv)
	{
		for (SinhVienNTU sv : danhSachSv)
		{
			if (sv.getHocLuc().equalsIgnoreCase("Giỏi"))
			{
				System.out.print("Họ tên: " + sv.getHoTen() + "    Ngành: " + sv.getNganh() + "    Điểm: " + sv.getDiem()  +"    Học lực: " +sv.getHocLuc() + "\n");
			}
		}
	}
	
	public static void SapXep(ArrayList<SinhVienNTU> danhSachSv) 
	{
        Collections.sort(danhSachSv, new Comparator<SinhVienNTU>() {
            @Override
            public int compare(SinhVienNTU sv1, SinhVienNTU sv2) {
                return Double.compare(sv2.getDiem(), sv1.getDiem());
                //return sv1.getNganh().compareTo(sv2.getNganh());

            }
        });
	}
	

}
