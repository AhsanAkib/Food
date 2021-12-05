import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Database
{
	Connection conn=null;
	ResultSet rs=null;
	Statement st=null;

	public Database()
	{
		try
		{
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/online_food_order","root","");
			st=conn.createStatement();
		}catch(Exception ex) 
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}
	public void registerUser(User user)
	{
		String query="INSERT INTO `user` (`id`,`fname`,`lname`,`uname`,`password`,`email`,`phone`,`area`,`address`) VALUES (NULL,'"+user.fname+"','"+user.lname+"','"+user.username+"','"+user.password+"','"+user.email+"','"+user.phone+"','"+user.area+"','"+user.address+"')";
		try
		{
			st.executeUpdate(query);
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}

	public boolean validateUser(User user)
	{
		String query="select password from user where uname='"+user.username+"'";
		try
		{
			rs=st.executeQuery(query);
			while(rs.next())
			{
				if(rs.getString("password").equals(user.password))
				{
					return true;
				}
			}
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		return false;
	}

	public boolean validateAdmin(Admin admin)
	{
		String query="select adminPassword from admin where adminName='"+admin.adminName+"'";
		try
		{
			rs=st.executeQuery(query);
			while(rs.next())
			{
				if(rs.getString("adminPassword").equals(admin.adminPassword))
				{
					return true;
				}
			}
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
		return false;
	}

	public void breakfast(Breakfast x)
	{
		String query="INSERT INTO `breakfast` (`id`,`parotta`,`khichuri`,`noodles`,`drinks`,`tk`) VALUES (NULL,'"+x.parotta+"','"+x.khichuri+"','"+x.noodles+"','"+x.drinks+"','"+x.tk+"')";
		try
		{
			st.executeUpdate(query);
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}

	public void lunch(Lunch x)
	{
		String query="INSERT INTO `lunch` (`id`,`polao`,`tehari`,`biriyani`,`drinks`,`tk`) VALUES (NULL,'"+x.polao+"','"+x.tehari+"','"+x.biriyani+"','"+x.drinks+"','"+x.tk+"')";
		try
		{
			st.executeUpdate(query);
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}

	public void evening(Evening x)
	{
		String query="INSERT INTO `evening` (`id`,`pasta`,`pizza`,`burger`,`shawarma`,`drinks`,`tk`) VALUES (NULL,'"+x.pasta+"','"+x.pizza+"','"+x.burger+"','"+x.shawarma+"','"+x.drinks+"','"+x.tk+"')";
		try
		{
			st.executeUpdate(query);
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}

	public void dinner(Dinner x)
	{
		String query="INSERT INTO `dinner` (`id`,`polao`,`tehari`,`biriyani`,`drinks`,`tk`) VALUES (NULL,'"+x.polao+"','"+x.tehari+"','"+x.biriyani+"','"+x.drinks+"','"+x.tk+"')";
		try
		{
			st.executeUpdate(query);
		}catch(Exception ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}
	}

	public void userList(User user)
	{
		String query = "Select * from user";
		try{
			rs = st.executeQuery(query);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		try
		{
			System.out.println("User list:");
			while (rs.next())
			{
				System.out.print("User no:"+rs.getInt("id"));
				System.out.print("\nFirst name:"+rs.getString("fname"));
				System.out.print("\nLast name:"+rs.getString("lname"));
				System.out.print("\nUsername:"+rs.getString("uname"));
				System.out.print("\nEmail:"+rs.getString("email"));
				System.out.print("\nPhone:"+rs.getString("phone"));
				System.out.print("\nArea:"+rs.getString("area"));
				System.out.print("\nAddress:"+rs.getString("address"));
				System.out.println("\n");
			}
		}catch (Exception ex)
		{
				System.out.println(ex.getMessage());
		}	
	}

	public void breakfastList(Breakfast breakfast)
	{
		String query = "Select * from breakfast";
		try{
			rs = st.executeQuery(query);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		try
		{
			System.out.println("Breakfast order list:");
			while (rs.next())
			{
				System.out.print("Order no:"+rs.getInt("id"));
				System.out.print("\nParotta:"+rs.getString("parotta"));
				System.out.print("\nKhichuri:"+rs.getString("khichuri"));
				System.out.print("\nNoodles:"+rs.getString("noodles"));
				System.out.print("\nDrinks:"+rs.getString("drinks"));
				System.out.println("\nTk:"+rs.getInt("tk"));
				System.out.println("\n");
			}
		}catch (Exception ex)
		{
				System.out.println(ex.getMessage());
		}	
	}

	public void lunchList(Lunch lunch)
	{
		String query = "Select * from lunch";
		try{
			rs = st.executeQuery(query);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		try
		{
			System.out.println("Lunch order list:");
			while (rs.next())
			{
				System.out.print("Order no:"+rs.getInt("id"));
				System.out.print("\nPlane rice:"+rs.getString("polao"));
				System.out.print("\nBiriyani:"+rs.getString("tehari"));
				System.out.print("\nKhichuri:"+rs.getString("biriyani"));
				System.out.print("\nDrinks:"+rs.getString("drinks"));
				System.out.println("\nTk:"+rs.getInt("tk"));
				System.out.println("\n");
			}
		}catch (Exception ex)
		{
				System.out.println(ex.getMessage());
		}	
	}

	public void eveningList(Evening evening)
	{
		String query = "Select * from evening";
		try{
			rs = st.executeQuery(query);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		try
		{
			System.out.println("Evening order list:");
			while (rs.next())
			{
				System.out.print("Order no:"+rs.getInt("id"));
				System.out.print("\nPasta:"+rs.getString("pasta"));
				System.out.print("\nPizza:"+rs.getString("pizza"));
				System.out.print("\nBurger:"+rs.getString("burger"));
				System.out.print("\nShawarma:"+rs.getString("shawarma"));
				System.out.print("\nDrinks:"+rs.getString("drinks"));
				System.out.println("\nTk:"+rs.getInt("tk"));
				System.out.println("\n");
			}
		}catch (Exception ex)
		{
				System.out.println(ex.getMessage());
		}	
	}

	public void dinnerList(Dinner dinner)
	{
		String query = "Select * from dinner";
		try{
			rs = st.executeQuery(query);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		try
		{
			System.out.println("Dinner order list:");
			while (rs.next())
			{
				System.out.print("Order no:"+rs.getInt("id"));
				System.out.print("\nPlane rice:"+rs.getString("polao"));
				System.out.print("\nBiriyani:"+rs.getString("tehari"));
				System.out.print("\nKhichuri:"+rs.getString("biriyani"));
				System.out.print("\nDrinks:"+rs.getString("drinks"));
				System.out.println("\nTk:"+rs.getInt("tk"));
				System.out.println("\n");
			}
		}catch (Exception ex)
		{
				System.out.println(ex.getMessage());
		}	
	}
}