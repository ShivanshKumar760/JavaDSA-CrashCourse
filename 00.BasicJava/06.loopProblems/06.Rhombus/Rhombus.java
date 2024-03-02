public class Rhombus
{
	public static void main(String[] args)
	{
		int row = 5;
		for(int rowCounter=1;rowCounter<=row;rowCounter++)
		{
			for(int numberStar=1;numberStar<=row;numberStar++)
			{
				if(numberStar==1)
				{
					for(int numSpace=row-rowCounter;numSpace>=1;numSpace--)
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