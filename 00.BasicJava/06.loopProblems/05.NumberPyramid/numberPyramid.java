public class numberPyramid
{
	public static void main(String[] args) {
		int row=5;
		for (int rowCounter=1;rowCounter<=row ;rowCounter++ ) {
			for (int num=1;num<=rowCounter ;num++ ) {
				System.out.print(num);	
			}
			System.out.println();
		}
	}
}