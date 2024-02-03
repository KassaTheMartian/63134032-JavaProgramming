package Bai2;

public abstract class SinhVienNTU {
	protected String hoTen;
	protected String nganh;
	
	public SinhVienNTU(String hoTen, String nganh) {
		super();
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	
	public SinhVienNTU() {
		super();
	}

	//Phương thức trừu tượng tính điểm
    public abstract double getDiem();
    
    //Phương thức xếp loại học lực
    public String getHocLuc() {
        double diem = getDiem();

        if (diem < 5) {
            return "Yếu";
        } else if (diem < 6.5) {
            return "Trung bình";
        } else if (diem < 7.5) {
            return "Khá";
        } else if (diem < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
    

	

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
	

}
