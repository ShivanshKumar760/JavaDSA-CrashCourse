public class reverse {
	public static void main(String[] args) {
		/*

		***
		**
		*

		*/
		int row = 3;
		int lastRow=1;
		for(int rowNum=row;rowNum>=lastRow;rowNum--)
		{
			for(int starNum=1;starNum<=rowNum;starNum++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}