import java.util.Scanner;

public class HelloTrev {

	public static void main(String[] args) {
	
		Scanner userStringInput = new Scanner(System.in);
		System.out.println("What is your name");
		String name = userStringInput.nextLine();
		System.out.println("Hello, " + name + "!");
		
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = userIntInput.nextInt(); 
		
		
		
		
		
		if (name.equals("Bob"))  
			{
				System.out.println("cool");
			}
		else 
			{
				System.out.println("Go away, lol");
			}
	}

}
