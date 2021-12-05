import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener 
{
	JTextField uname;
	JPasswordField password;
	JButton admin,login,registration;

	Database db;

	public Login()
	{
		db=new Database();

		uname=new JTextField(10);
		password=new JPasswordField(10);
		registration=new JButton("Sign up now");
		login=new JButton("Login");
		admin=new JButton("Go to admin");

		JLabel title=new JLabel("NoWaB   Foodhouse");
		title.setFont(new Font("Elephant",Font.BOLD,19)); 
        title.setForeground(Color.BLUE);
        this.add(title);

        JLabel title2=new JLabel("where healthy food is the first priority");
		title2.setFont(new Font("Segoe UI Emoji",Font.ITALIC,13)); 
        title2.setForeground(Color.RED);
        this.add(title2);

		this.add(new JLabel("Username: "));
		this.add(uname);
		this.add(new JLabel("password: "));
		this.add(password);
		this.add(registration);
		this.add(login);
		this.add(admin);

		admin.addActionListener(this);
		login.addActionListener(this);
		registration.addActionListener(this);

		this.setBounds(500,280,260,220);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ev)
	{
		if(ev.getSource().equals(login))
		{
			if(validateField())
			{
				User user=new User(uname.getText(),new String(password.getPassword()));
				if(db.validateUser(user))
				{
					JOptionPane.showMessageDialog(null,"Login successfull");
					UserGUI home=new UserGUI();
					home.setVisible(true);
					home.setTitle("login/user");
					home.setResizable(false);
					home.getContentPane().setLayout(null);
					home.getContentPane().setBackground(Color.YELLOW);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Provided information is not valid");
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please fill up all the blanks");
			}
		}
		else if(ev.getSource().equals(registration))
		{
			RegGUI reg=new RegGUI();
			reg.setVisible(true);
			reg.setTitle("login/reg");
			reg.setResizable(false);
			reg.getContentPane().setLayout(null);
			reg.getContentPane().setBackground(Color.YELLOW);
		}
		else if(ev.getSource().equals(admin))
		{
			AdminGUI admin=new AdminGUI();
			admin.setVisible(true);
			admin.setTitle("login/admin");
			admin.setResizable(false);
			admin.getContentPane().setLayout(null);
			admin.getContentPane().setBackground(Color.YELLOW);
		}
	}

	boolean validateField()
	{
		boolean result=true;

		if(uname.getText()==null || password.getText()==null || uname.getText().equals("") || new String(password.getPassword()).equals(""))
		{
			result=false;
		}
		return result;
	}
}