import java.util.*;
public class Lab702 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		double[] score = new double[5];
		double sum = 0,average = 0;
		
		for(int i = 0; i < score.length;i++)
		{
			System.out.print("Input score of student "+ (i+1)+" : " );
			score[i] = scan.nextDouble();
			sum = sum+score[i];
		}
		
		System.out.println();
		
		average = sum/score.length;
		System.out.println("Average of "+score.length+ " student is "+average);
		
			for(int i = 0; i < score.length;i++) 
			{
				if(score[i]>average) 
				{
					System.out.print("\n> Student "+(i+1)+" ("+score[i]+")");
				}
			}
	}
}