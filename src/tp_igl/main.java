package tp_igl;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Library_Management_Sys library = new Library_Management_Sys();

		String T = "";

		while (T != "stop this shit") {
			System.out.println("List of commands : ");
			System.out.println("1 - to regester a new user : r");
			System.out.println("2 - to create anew book : b");
			System.out.println("3- to show all available books : books");
			System.out.println("4 - to show all user tape : users");
			System.out.println("5 - to close : exit");

			try (Scanner tappedScanner = new Scanner(System.in)) {
				String value = tappedScanner.nextLine();
                T = value;
				switch (value) {
					case "r":
						System.out.println("Enter username : ");
						String username = tappedScanner.nextLine();

						System.out.println("Enter password : ");
						String password = tappedScanner.nextLine();

						library.Register(username, password);
						break;

					case "b":
						System.out.println("create a new book");
						library.database.Add();
						break;
					case "users":
						System.out.println("all users : ");
						library.show_all_users();
						break;
					case "books":
						System.out.println("all books : ");
						library.show_all_books();
						break;
					case "exit":
						System.out.println("closing....");
						break;
					default:
						System.out.println("invalid command");
						break;
				}
			}
		}
	}

}
