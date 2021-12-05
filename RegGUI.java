import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegGUI extends JFrame 
{
	JButton register;
	Database db;

	public RegGUI()
	{
		db=new Database();

		JLabel title=new JLabel("Registration form for user");
		title.setFont(new Font("Elephant",Font.ITALIC,16)); 
        title.setForeground(Color.BLUE);
        this.add(title);

		JLabel labelFname=new JLabel("First Name: ");
		JLabel labelLname=new JLabel("Last Name: ");
		JLabel labelUname=new JLabel("User Name: ");
		JLabel labelPassword=new JLabel("Password: ");
		JLabel labelEmail=new JLabel("Email: ");
		JLabel labelPhone=new JLabel("Phone: ");
		//JLabel labelGender=new JLabel("Gender: ");
		JLabel labelArea=new JLabel("Select Area: ");
		JLabel labelAddress=new JLabel("Address: ");

		JTextField fname=new JTextField(20);
		JTextField lname=new JTextField(20);
		JTextField uname=new JTextField(20);
		JPasswordField password=new JPasswordField(20);
		JTextField email=new JTextField(20);
		JTextField phone=new JTextField(20);
		//ButtonGroup gender=new ButtonGroup();
		//JRadioButton male=new JRadioButton("Male");
		//JRadioButton female=new JRadioButton("Female");
		//male.setActionCommand("Male");
		//female.setActionCommand("Female");
		//gender.add(male);
		//gender.add(female);
		String areaList[]={"None","Gulshan","Badda","Kuril","Banani","Dhanmondi","Rampura","Malibag","Mirpur","Motijhil","Mohakhali","New market"};
		JComboBox area=new JComboBox(areaList);
		JTextArea address=new JTextArea(5,20);

		register=new JButton("Register");

		this.setBounds(500,110,240,540);
		this.setLayout(new FlowLayout());
		this.add(labelFname);
		this.add(fname);
		this.add(labelLname);
		this.add(lname);
		this.add(labelUname);
		this.add(uname);
		this.add(labelPassword);
		this.add(password);
		this.add(labelEmail);
		this.add(email);
		this.add(labelPhone);
		this.add(phone);
		//this.add(labelGender);
		//this.add(male);
		//this.add(female);
		this.add(labelArea);
		this.add(area);
		this.add(labelAddress);
		this.add(address);
		this.add(register);

		register.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					User user=new User();
					user.fname=fname.getText();
					user.lname=lname.getText();
					user.username=uname.getText();
					user.password=new String(password.getPassword());
					user.email=email.getText();
					user.phone=phone.getText();
					//user.gender=gender.getSelection().getActionCommand();
					user.area=area.getSelectedItem().toString();
					user.address=address.getText();

					if(uname.getText().equals("") || new String(password.getPassword()).equals("") || fname.getText().equals("") || lname.getText().equals("") || phone.getText().equals("") || email.getText().equals("") || area.getSelectedItem().toString().equals("None") || address.getText().equals("")
						|| uname.getText()==null || password.getText()==null || fname.getText()==null || lname.getText()==null || phone.getText()==null || email.getText()==null || address.getText()==null)
					{
						JOptionPane.showMessageDialog(null,"Please fill up all the blanks"); 
					}
					else
					{
						db.registerUser(user);
						JOptionPane.showMessageDialog(null,"Regestration done! Now to go log in");
					}	
				}
			}
		);
	}
}