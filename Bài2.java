package day3;

import java.util.Scanner;

public class Bài2 {
	public static void main(String[] args) {
		timSoChiaHetCho2Va3();
	}
		
		public static void timSoChiaHetCho2Va3()
		{
			Scanner scanner = new Scanner(System.in);
	       

	        int[] arr = new int[20];
	        System.out.println("Nhập các phần tử của dãy:");
	        for (int i = 0; i < 20; i++) {
	            arr[i] = scanner.nextInt();

	            // Kiểm tra điều kiện thoát
	            if (arr[i] % 6 == 0) {
	                System.out.println("Số thoả mãn");
	                break;
	            }
	            else if (i==19) {
	            	System.out.println("Không tìm thấy số thoả mãn");
	           
	            }
			}
		}
}
