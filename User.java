public class User 
{
	String fname;
	String lname;
	String email;
	String phone;
	//String gender;
	String area;
	String address;
	String username;
	String password;

	public User(){}
	public User(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
}