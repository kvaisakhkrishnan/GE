import java.lang.Math;
import java.util.Scanner;
class CoinFlip{
	public static void main(String args[])
	{
		float  headCount = 0, tailCount = 0;
		int trials;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of times: ");
		trials = scanner.nextInt();
		for(int i = 0; i < trials; i++)
		{
			if(Math.random() < 0.5){
				tailCount += 1;
			}
			else{
				headCount += 1;
			}
		}
		float headVsTails = headCount / tailCount;
		System.out.println("Head vs Tails: "+ headVsTails * 100 + "%");
		
	}
}
