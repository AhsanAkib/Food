import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPanelGUI extends JFrame
{
	JButton a,b,c,d,e;
	Database db;

	public AdminPanelGUI()
	{
		db=new Database();

		JLabel title=new JLabel("Welcome to admin panel");
		title.setFont(new Font("Elephant",Font.ITALIC,18)); 
        title.setForeground(Color.BLUE);
        this.add(title);
        JLabel title2=new JLabel("Select the list you want to see: ");
        this.add(title2);

        a=new JButton("User list");
        b=new JButton("Breakfast order list");
        c=new JButton("Lunch order list");
        d=new JButton("Evening order list");
        e=new JButton("Dinner order list");

        this.setBounds(500,280,250,260);
        this.setLayout(new FlowLayout());
        this.add(a);
        this.add(b);
        this.add(c);
        this.add(d);
        this.add(e);

        a.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					User admin=new User();
					db.userList(admin);
					UserlistGUI a=new UserlistGUI();
					a.setVisible(true);
					a.setTitle("user/breakfast");
					a.setResizable(false);
					a.getContentPane().setLayout(null);
					a.getContentPane().setBackground(Color.ORANGE);
				}
			}
		);

		b.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					Breakfast admin=new Breakfast();
					db.breakfastList(admin);
				}
			}
		);

		c.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					Lunch admin=new Lunch();
					db.lunchList(admin);
				}
			}
		);

		d.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					Evening admin=new Evening();
					db.eveningList(admin);
				}
			}
		);

		e.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					Dinner admin=new Dinner();
					db.dinnerList(admin);
				}
			}
		);
	}
	public static void main(String[] args) {
		AdminPanelGUI a=new AdminPanelGUI();
		a.setVisible(true);
		a.setTitle("login");
		a.setResizable(false);
		a.getContentPane().setLayout(null);
		a.getContentPane().setBackground(Color.PINK);
		a.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}