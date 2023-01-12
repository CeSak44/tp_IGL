package tp_igl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Library_Management_Sys {
	
	private String type;

	private String username;

	private String password;
	
	private ArrayList<User> users ;
	
	public Library_database database ;

	public Library_Management_Sys() {
		this.database = new Library_database() ;
		this.users = new ArrayList<>();
	}

	public void Login(String username, String password) {
		
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername() == username & users.get(i).getPassword() == password ) {
                System.out.println("successful login welcome Mr: " + username);
            }
        }
	}

	public void Register(String username, String password) {
        Random read = new Random();
        int id = read.nextInt(10000);

        User user = new User(id, username, password);
        users.add(user);
        System.out.println("users ::::=> "+ users);
        System.out.println("Successful creation of user: " + username);
        
	}

	public void Logout() {
        System.out.println("Bye Bye");
	}

	public void show_all_books() {
        List<Book> bookList = database.list_of_books;
        if (bookList.size() > 0) {
            for (int i = 0; i < bookList.size(); i++){
                System.out.println("book number: " + i);
                bookList.get(i).show_bookinfos();
            }
        } else {
            System.out.println("There is no saved books");
        }
	}

	public void show_all_users() {
        if (users.size() > 0) {
            for (int i = 0; i < users.size(); i++) {
                System.out.println("User number: " + i);
                users.get(i).show_user_infos();
            }
        } else {
            System.out.println("There is no registred users");
        }
	}

}
