package day3;
import java.util.Scanner;

public class thucHanhIfElse {
	public static void main(String[] args) {
		//String result;
		//timSoLonHon();
		System.out.println("Số lớn hơn là: "+ timSoLonHon2()+20);
		//timSoLonHon2();
		
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhập 1 số từ bàn phím: ");
//		int number = scanner.nextInt();
//		if(number%2==0)
//			result = "Số chẵn";
//		else
//			result = "Số lẻ";
//		
//		result = (number%2==0)? "Số chẵn"  : "Số lẻ";
//			System.out.print(result);
//	}
//	public static void timSoLonHon() {
//		int st1, st2;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhập vào số thứ nhất: ");
//		st1= scanner.nextInt();
//		System.out.println("Nhập vào số thứ hai: ");
//		st2= scanner.nextInt();
//		int result = (st1>st2) ? st1:st2;
//		System.out.println("Số lớn hơn là: "+result);
	}
	public static int timSoLonHon2()
	{
		int st1, st2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số thứ nhất: ");
		st1= scanner.nextInt();
		System.out.println("Nhập vào số thứ hai: ");
		st2= scanner.nextInt();
		if (st1>st2)
			return st1;
		else
			return st2;
	}

}
