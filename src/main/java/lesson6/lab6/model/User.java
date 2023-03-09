package lesson6.lab6.model;

public class User {

	public User(String username, String pwd) {
		this.username = username;
		password = pwd;
	}

	public User(String username, String pwd, Auth auth) {
		this.username = username;
		password = pwd;
		authorization = auth;
	}
	private final String username;
	private final String password;
	private Auth authorization;
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof User u)) return false;
		return username.equals(u.username) && password.equals(u.password);
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public Auth getAuthorization() {
		return authorization;
	}
}
