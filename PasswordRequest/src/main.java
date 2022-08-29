import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Password: ");
		String pw = sc.nextLine();
		System.out.println("Your password is: " + pw);
		System.out.println("------------------------");
		System.out.print("Enter Name: ");
		String name = sc.nextLine();

		int i = 0;
		do {
			System.out.print("Hello " + name + " write your password to log in: ");
			String attempt = sc.nextLine();
			if (attempt.equals(pw)) {
				System.out.println("Congratulations " + name + ", you've successfully logged in");
				break;
			} else if (i == 2) {
				System.out.println("Too many attempts, you're locked out");
			} else {
				System.out.println("Wrong password, try again");

			}

			i++;
		} while (i < 3);
		sc.close();
	}

}
