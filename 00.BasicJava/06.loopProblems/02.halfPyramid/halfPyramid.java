public class halfPyramid {
	public static void main(String[] args) {
		/*

		*
		**
		***

		*/
		int row = 3;
		for(int rowNum=1;rowNum<=row;rowNum++)
		{
			for(int starNum=1;starNum<=rowNum;starNum++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}