package tp_igl;

public class User {
	private int id;

	private String username;

	private String password;

	public User() {

	}

	public User(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public void Verify() {

	}

	public void CheckAccount() {

	}

	public void get_book_info() {

	}

	public void show_user_infos() {
		System.out.println("username : "+username+" password : "+password);
	}

	public String getUsername() {
		return this.username;
	}

	public String getPassword() {
		return this.password;
	}

}
