package entity;

public class User {
	private int uid;
	private String username;
	private String pwd;
	private String email;
	private String city;
	public User(){
		
	}
	
	public User(int uid, String username, String pwd, String email, String city) {
		super();
		this.uid = uid;
		this.username = username;
		this.pwd = pwd;
		this.email = email;
		this.city = city;
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", pwd=" + pwd + ", email=" + email + ", city=" + city
				+ "]";
	}
	
	

	
	
	
}
