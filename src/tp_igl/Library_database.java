package tp_igl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library_database {
	List<Book> list_of_books = new ArrayList<>();

	public Library_database() {
	}

	public void Add() {

		Scanner TappedValue = new Scanner(System.in);
		System.out.println("Enter book title :");
		String title = TappedValue.nextLine();
		System.out.println("Enter book auther :");
		String auther = TappedValue.nextLine();
		System.out.println("Enter book ISBN :");
		String ISBN = TappedValue.nextLine();
		System.out.println("Enter book publisher :");
		String publisher = TappedValue.nextLine();

		Book book = new Book(title, auther, ISBN, publisher);

		list_of_books.add(book);
		System.out.println("Add book successfully");
	}

	public void Delete() {

	}

	public void Update() {

	}

	public void Display() {

	}

	public void Search(String bookTitle) {

		for (int i = 0; i < list_of_books.size(); i++) {

			if (list_of_books.get(i).getTitle().equals(bookTitle)) {

				System.out.println("Search resault :");

				list_of_books.get(i).show_bookinfos();

			} else {
				System.out.println("Not Found !");
			}
		}

	}

}
