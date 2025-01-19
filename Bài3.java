package day3;
import java.util.Scanner;

public class Bài3 {
	public static void main(String[] args) {
		timGiaTriNhoNhat();	
		timGiaTriLonNhat();
	}
		
	//a,Tìm giá trị nhỏ nhất trong mảng số nguyên
	public static void timGiaTriNhoNhat()
		{	
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.print("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = arr[0]; 
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
	
	
	//b, Tìm giá trị lớn nhất trong mảng số thập phân
	public static void timGiaTriLonNhat()
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();

        double[] arr = new double[n];
        System.out.print("Nhập các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        double max = arr[0]; 
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
    }
}

