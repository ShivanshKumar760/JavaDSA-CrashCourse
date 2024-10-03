public class mirror {
	public static void main(String[] args) {
		int row=4;
		for(int rowNum=1;rowNum<=row;rowNum++)//5
		{
			for (int numStar=1;numStar<=rowNum ;numStar++ ) {
				// for(int numSpace=row-numStar;numSpace>=rowNum;numSpace--)
					
				// 	{
				// 		System.out.print(" ");
				// 	}
				
				if(numStar==1)
				{
					for(int numSpace=row-rowNum;numSpace>=1;numSpace--)
					{
						System.out.print(" ");

					}
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}