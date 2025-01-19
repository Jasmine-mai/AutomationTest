package day5_TinhLuong;

public class TinhLuongBacSi {
//	public String loaiBacSi;
//	public int heSoLuong;
//	public double luongCoBan = 10000000;
	
	public double tinhLuong(double _heSoLuong, double _luongCoBan) {
		return _heSoLuong* _luongCoBan;
	}
	
	public double tinhLuong(double _heSoLuong, double _luongCoBan, double soNamKinhNghiem) {
		return _heSoLuong* _luongCoBan*soNamKinhNghiem;
	}
	
	public double tinhLuong(double _heSoLuong, double _luongCoBan, double soNamKinhNghiem, String loaiBacsi) {
		if (loaiBacsi.equals("Chuyen Khoa"))
		{
			return _heSoLuong*_luongCoBan*soNamKinhNghiem + _luongCoBan*0.2;
		}
		else if (loaiBacsi.equals("Da Khoa"))
		{
			return _heSoLuong* _luongCoBan*soNamKinhNghiem + _luongCoBan*0.45;
		}
		else
			return _heSoLuong*_luongCoBan*soNamKinhNghiem;
	}

	public static void main(String[] args) {
		TinhLuongBacSi bs = new TinhLuongBacSi();
		System.out.println(String.format("%.0f", bs.tinhLuong(0.5, 10000000, 2, "Chuyen Khoa")));
		System.out.println(String.format("%.0f", bs.tinhLuong(0.5, 10000000, 2, "Da Khoa")));
		System.out.println(String.format("%.0f", bs.tinhLuong(0.5, 10000000, 2, "Y ta")));

	}

}
