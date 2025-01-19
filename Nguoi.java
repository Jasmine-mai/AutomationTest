package day5_inherritance;

public class Nguoi {
	public String hoTen;
	public String diaChi;
	public String ngaySinh;
	
	public void setHoTen(String _hoTen)
	{
		this.hoTen = _hoTen;
	}
	public String getHoTen()
	{
		return hoTen;
	}
	public String getDiaChi()
	{
		return diaChi;
	}
	public void setDiaChi(String _diaChi)
	{
		this.diaChi = _diaChi;
	}
	public String getNgaySinh()
	{
		return ngaySinh;
	}
	public void setNgaySinh(String _ngaySinh)
	{
		this.ngaySinh = _ngaySinh;
	}

	
	public void diChoi()
	{
		System.out.println("Đi chơi khi có tiền");
	}
		

}
