package NhanVien;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng nhân viên
        System.out.print("Nhập số lượng nhân viên: ");
        int soLuong = scanner.nextInt();

        // Tạo mảng chứa đối tượng nhân viên
        NhanVien[] nhanVien = new NhanVien[soLuong];

        // Nhập thông tin nhân viên
        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhập tên nhân viên thứ " + (i+1) + ": ");
            String ten = scanner.next();
            nhanVien[i] = new NhanVien(ten);
        }

        System.out.println("\nDanh sách nhân viên:");
        for (NhanVien nv : nhanVien) {
            System.out.println(nv.getTen());
        }
    }

}
