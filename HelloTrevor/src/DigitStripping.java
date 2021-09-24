import java.util.Scanner;

public class DigitStripping
	{

		public static void main(String[] args)
			{
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("How many people do you think go to Mullen?");
				int mullenStudents = userIntInput.nextInt();
				
				int sum = 0;
				
				
				System.out.println("The reverse of the number you inputed is: ");
				
				
				while (mullenStudents > 0)
					{
						int lastNumber = mullenStudents % 10;
						
						mullenStudents = mullenStudents / 10;
						
						System.out.print(lastNumber);
						
					}
				
				
				
			}

	}
