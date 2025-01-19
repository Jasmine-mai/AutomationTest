package day5_inherritance;

public class GiaoVien extends Nguoi {
	public String monHoc;
	public void diDay() {
		System.out.println("Giáo viên CodeStar dạy môn "+monHoc + " tối thứ 4 và tối CN hàng tuần");
	}
	 @Override
	public void diChoi() {
		System.out.println("Giáo viên CodeStar đi chơi sau khi dạy xong");
	}

}
