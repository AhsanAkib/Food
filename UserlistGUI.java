import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class UserlistGUI extends JFrame  
{
	Connection conn=null;
	ResultSet rs=null;
	Statement st=null;

	public UserlistGUI()
	{
		this.setBounds(400,100,300,600);
		this.setSize(160,500);
		this.setLayout(new FlowLayout());

		try
		{
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/online_food_order","root","");
			st=conn.createStatement();
		}catch(Exception ex) 
		{
			JOptionPane.showMessageDialog(null,ex.getMessage());
		}

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
				int num=rs.getInt("id");
				JLabel title=new JLabel("User no:"+num);
				

				String a=rs.getString("fname");
				JLabel title2=new JLabel("First Name:"+a);
				

				String b=rs.getString("lname");
				JLabel title3=new JLabel("Last Name:"+b);
		

				String c=rs.getString("uname");
				JLabel title4=new JLabel("User Name:"+c);


				String d=rs.getString("email");
				JLabel title5=new JLabel("Email:"+d);
				

				String e=rs.getString("phone");
				JLabel title6=new JLabel("Phone:"+e);
				

				String f=rs.getString("area");
				JLabel title7=new JLabel("Area:"+f);
				

				String g=rs.getString("address");
				JLabel title8=new JLabel("Address:"+g);
				
				this.add(title);
				this.add(title2);
				this.add(title3);
				this.add(title4);
				this.add(title5);
				this.add(title6);
				this.add(title7);
				this.add(title8);

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
}