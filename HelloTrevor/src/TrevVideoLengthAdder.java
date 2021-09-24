import java.util.Scanner;


public class TrevVideoLengthAdder
	{

		public static void main(String[] args)
			{
				Scanner userIntInput = new Scanner(System.in);
				System.out.println("I hear you have two videos and you would like to find the combined time of each. \nHow many hours is the first video?");
				int numberOfHours1 = userIntInput.nextInt(); 
				
				System.out.println("How many minutes is that same video?");
				int numberOfMinutes1 = userIntInput.nextInt();
				
				System.out.println("How many seconds is that same video?");
				int numberOfSeconds1 = userIntInput.nextInt();
				
				
				
				System.out.println("Wow, thats a lot of time! How many hours is your second video?");
				int numberOfHours2 = userIntInput.nextInt();
			
				System.out.println("How many minutes is that same video?");
				int numberOfMinutes2 = userIntInput.nextInt();
				
				System.out.println("How many seconds is that same video?");
				int numberOfSeconds2 = userIntInput.nextInt();
				
				int totalSeconds = (numberOfSeconds1 + numberOfSeconds2);
				int totalMinutes = (numberOfMinutes1 + numberOfMinutes2);
				int totalHours = (numberOfHours1 + numberOfHours2);
				
				
				if(totalSeconds > 60)
					{
						int finalSeconds = totalSeconds%60;
						
						
							if(totalMinutes > 60)
								{
									int finalMinutes = totalMinutes%60 + 1;
									int newHours = totalHours + 1;
									
									System.out.println("Your combined time is " + newHours + " hours: " + finalMinutes + " minutes: " + finalSeconds + " seconds" );
								}
							else
								{
									System.out.println("Your combined time is " + totalHours + " hours: " + totalMinutes + " minutes: " + finalSeconds + " seconds" );
								}
					}
				else
					{
						if(totalMinutes > 60)
							{
								int finalMinutes2 = totalMinutes%60;
								int newHours2 = totalHours + 1;
								
								System.out.println("Your combined time is " + newHours2 + " hours: " + finalMinutes2 + " minutes: " + totalSeconds + " seconds" );
								
							}
						else
							{
								System.out.println("Your combined time is " + totalHours + " hours: " + totalMinutes + " minutes: " + totalSeconds + " seconds" );
							}
					}
				
			
				
			
				
				
				
				
			}

	}
