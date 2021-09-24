import java.util.Scanner; 

public class CrazyStory
	{

		public static void main(String[] args)
			{
				Scanner userStory = new Scanner(System.in);
				System.out.println("Do you want to hear a story?");
				String response = userStory.nextLine();
				
				
				if (response.equals("yes"))
				{
					System.out.println("\t\t\t\t\t\tThere was once a circus dog who could do handstands and flips.\n\t\t\t\t\t\tOne day, the dog slipped and broke his leg. He could never do handstands or flips again.");
				}
				else
				{
					System.out.println("That's too bad");
				}
				
				
				
				
				
				Scanner userJoke = new Scanner(System.in);
				System.out.println("Do you want to hear a joke?");
				String answer = userJoke.nextLine();
				
				if (answer.equals("yes"))
					{
						//ANOTHER JOKE System.out.println("I have always felt bad for calendars. Their days are numbered.");
						
						System.out.println("If April showers bring May flowers, what do May flowers bring?");
						String hitEnter = userJoke.nextLine();
						System.out.println("Pilgrims");
						
					
					}
				else
					{
						System.out.println("Did the dog story turn you off?");
					}
				

			}

	}
