import java.util.Scanner;

public class NumberGame
	{

		static Scanner userIntInput = new Scanner(System.in);
		
		static int secretNumber; 
		static boolean stillGuessing;
		static int counter;
		
		public static void main(String[] args)
			{
				step1();
				step2();
				step3();
				step4();
				
			}
				public static void step1()
						{
				
				System.out.println("What number am I thinking about between 1 and 5?");
					
					}
				
				
				
				public static void step2()
				{
				secretNumber = (int) (Math.random() * 5) + 1;

				// range from 1-4.99
				// starting point at 1

				stillGuessing = true;

				counter = 0;

				// int secretNumber = (int) (Math.random()*900) + 100;

				// the 900 generates the range (100-899.99)
				// the 100 generates the starting point

				// int secretNumber = 4;
				
				}

				
				public static void step3()
				{
				while (stillGuessing)
					{

						int guess = userIntInput.nextInt();

						if (guess < secretNumber)
							{
								System.out.println("You're too low. Guess again.");
							}

						else if (guess > secretNumber)
							{
								System.out.println("You're too high. Guess again.");
							}

						else
							{
								System.out.println("That's my number");
								// System.out.println(secretNumber);

								stillGuessing = false;
							}

						counter = counter + 1;	
					}
				

				System.out.println("It took you " + counter + " tries");
				}
				
				
				public static void step4()
				{
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("\nWhat is your name?");
				String name = userStringInput.nextLine();
				System.out.println("Hello, " + name + "! It's nice to meet you. Thank you for playing my game.");

				}

	}
