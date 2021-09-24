import java.util.Scanner;

public class ForLoopChallengeWithStaticVoid
	{

		static Scanner userIntInput = new Scanner(System.in);
		
		public static void main(String[] args)
			{
				challenge1();
				challenge2();
				challenge3();
				challenge4();
				challenge5();
				challenge6();
				challenge7();
				
			}
				
		
				public static void challenge1()
						{
				
				
				
				for (int i = 1; i <=5; i++)
					{
						System.out.println("I love cinnamon rolls!");
					}
						}
				
				
				public static void challenge2()
				{
				
				for (int i = 1; i <= 5; i++)
					{
						System.out.print(i);
					}
				
				System.out.println();
				}
				
				
						
						
				public static void challenge3()
				{
				for (int i = 5; i >= 1; i--)
					{
						System.out.print(i);
					}
				System.out.println();
				}
				
				
				
			
				public static void challenge4()
				{
				for (int i = 5; i <= 100; i += 5)
					{
						System.out.print(i + " ");
					}
				System.out.println();
				}
				
				
			
				public static void challenge5()
				{
				int sum = 0;
				
				for (int i = 5; i <= 100; i += 5)
					{
						sum += i;
						
					}
				System.out.print(sum + " ");
				System.out.println();
				}
				
				
				public static void challenge6()
				{
				System.out.println("Please input a lowerbound for a set of numbers");
				int lowerBound = userIntInput.nextInt();
				System.out.println("Please input a upperbound for that same set of numbers");
				int upperBound = userIntInput.nextInt();				
				
				int total = 0;
				
				for (int i = lowerBound; i <= upperBound; i ++)
					{
						total += i;
						
					}
				System.out.print("The sum of the numbers in your range are: " + total);
				}
				
				
				public static void challenge7()
				{
				System.out.println();
				System.out.println();
				
				System.out.println("*********");
			    for (int i = 1; i <= 7; i++)
			    	{
			    		System.out.println("*       *");
			    	}
			    System.out.println("*********");
				
				}
				
			
	}

	
