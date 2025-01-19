package day3;

public class Bài1 {


		public static void main(String[] args) {
			int [] Arr = {5,35,25,10,15,20,40,50,45};
			sapXepGiamDan(Arr);
			inMang(Arr);
			
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

}
