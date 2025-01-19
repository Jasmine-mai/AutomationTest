package day5_inherritance;

public class Application {

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien();
		sv1.setHoTen("Nguyen Van SV1");
		sv1.setDiaChi("Hanoi");
		sv1.setNgaySinh("1/1/1999");
		sv1.GPA = 9.5;
		System.out.println(sv1.getHoTen() + ", " +sv1.getDiaChi() + ", " +sv1.getNgaySinh() + ", " +sv1.GPA);
		sv1.diHoc();
		sv1.diChoi();
		
		System.out.println();
		GiaoVien gv1 = new GiaoVien();
		gv1.setHoTen("Nguyen Van GV1");
		gv1.setDiaChi("Hanoi");
		gv1.setNgaySinh("1/1/1999");
		gv1.monHoc = "Auto test";
		System.out.println(gv1.getHoTen() + ", " +gv1.getDiaChi() + ", " +gv1.getNgaySinh() + ", " +gv1.monHoc);
		gv1.diChoi();
		gv1.diDay();

	}

}
