package day3;

public class thucHanhForIfElse {
	public static void main(String[] args) {
		System.out.println("Các số nhỏ hơn 100 chia hết cho 5: ");
		inSoChiaHetCho5();
	}
		
		public static void inSoChiaHetCho5()
		{
			for(int i=0; i <=100; i++)
			{
				if(i%5==0)
					System.out.print(i + " ");
			}
		}
	}

