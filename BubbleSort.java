package day3;

public class BubbleSort {
	public static void main(String[] args) {
		int [] Arr = {5,3,6,2,7,34,25};
		sapXepTangDan(Arr);
		inMang(Arr);
	}
	public static void sapXepTangDan(int[]Arr) {
		int tmp;
		for (int i=0; i< Arr.length; i++)
			for (int j=0; j< Arr.length - 1; j++)
			{
				if(Arr[j]> Arr[j+1])
				{
					tmp = Arr[j+1];
					Arr[j+1]= Arr[j];
					Arr[j]= tmp;
				}
			}	
	}
	public static void inMang(int[]Arr) {
		for (int i=0; i<Arr.length; i++)
			System.out.print(Arr[i]+ " ");
	}
}
