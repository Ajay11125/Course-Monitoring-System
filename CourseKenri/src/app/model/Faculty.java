package app.model;

public class Faculty {
	public String facultyName;
	public String facultyAddress;
	public String mobile;
	public String email;
	public String Username;
	public String Password;
	public Faculty(String facultyName, String facultyAddress, String mobile, String email, String username,
			String password) {
		super();
		this.facultyName = facultyName;
		this.facultyAddress = facultyAddress;
		this.mobile = mobile;
		this.email = email;
		Username = username;
		Password = password;
	}
	
}
