import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminGUI extends JFrame implements ActionListener
{
	JTextField adminName;
	JPasswordField adminPassword;
	JButton go;

	Database db;

	public AdminGUI()
	{
		db=new Database();

		adminName=new JTextField(10);
		adminPassword=new JPasswordField(10);
		go=new JButton("Go");

		JLabel title=new JLabel("Welcome to admin site");
		title.setFont(new Font("Elephant",Font.ITALIC,18)); 
        title.setForeground(Color.BLUE);
        this.add(title);

		this.add(new JLabel("Admin Name: "));
		this.add(adminName);
		this.add(new JLabel("Admin Pass: "));
		this.add(adminPassword);
		this.add(go);

		go.addActionListener(this);

		this.setBounds(500,280,250,160);
		this.setLayout(new FlowLayout());
	}

	public void actionPerformed(ActionEvent a)
	 {
	 	if(a.getSource().equals(go))
	 	{
			if(validateField())
			{
				Admin admin=new Admin(adminName.getText(),new String(adminPassword.getPassword()));
				if(db.validateAdmin(admin))
				{
					JOptionPane.showMessageDialog(null,"Login successfull");
					AdminPanelGUI home=new AdminPanelGUI();
					home.setVisible(true);
					home.setTitle("login/admin/home");
					home.setResizable(false);
					home.getContentPane().setLayout(null);
					home.getContentPane().setBackground(Color.ORANGE);
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
	 }

	boolean validateField()
	{
		boolean result=true;

		if(adminName.getText()==null || adminPassword.getText()==null || adminName.getText().equals("") || new String(adminPassword.getPassword()).equals(""))
		{
			result=false;
		}
		return result;
	}
}