package day3;
import java.util.Scanner;

public class homeWork {
	public static void main(String[] args) {
		int [] Arr = {5,35,25,10,15,20,40,50,45};
		sapXepGiamDan(Arr);
		inMang(Arr);
		timSoChiaHetCho2Va3();
	}
	
	//Bài 1
	public static void sapXepGiamDan(int[]Arr) {
		int tmp;
		for (int i=0; i< Arr.length; i++)
			for (int j=0; j< Arr.length - 1; j++)
			{
				if(Arr[j]< Arr[j+1])
				{
					tmp = Arr[j+1];
					Arr[j+1]= Arr[j];
					Arr[j]= tmp;
				}
			}	
	}
	public static void inMang(int[]Arr) {
		for (int i=0; i< Arr.length; i++)
			System.out.print(Arr[i]+ " ");
	}
	
	
	//Bài 2
	public static void timSoChiaHetCho2Va3()
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập độ dài của dãy số: ");
        int length = scanner.nextInt();

        int[] arr = new int[length];
        System.out.println("Nhập các phần tử của dãy:");
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();

            // Kiểm tra điều kiện thoát
            if (arr[i] % 6 == 0) {
                System.out.println("Điều kiện thoát xảy ra!");
                break;
            }
		}
	}
}

