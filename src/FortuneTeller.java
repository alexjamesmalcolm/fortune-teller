import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String firstName = input.next();
		System.out.print("Enter your last name: ");
		String lastName = input.next();
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		System.out.print("Enter your birth month (1-12): ");
		int month = input.nextInt();
		System.out.print("Enter your favorite color: ");
		String color = input.next();
		System.out.print("How many siblings do you have? ");
		int siblings = input.nextInt();
		
		input.close();
	}

}
