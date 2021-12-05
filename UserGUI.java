import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UserGUI extends JFrame implements ActionListener
{
	JButton breakfast,lunch,evening,dinner;
	public UserGUI()
	{
		breakfast=new JButton("Breakfast type food");
		lunch=new JButton("Lunch type food");
		evening=new JButton("Evening type food");
		dinner=new JButton("Dinner type food");

		JLabel title=new JLabel("Welcome to homepage");
		title.setFont(new Font("Elephant",Font.ITALIC,18)); 
        title.setForeground(Color.BLUE);
        this.add(title);

		this.add(new JLabel("Types of food you want to order: "));

		this.add(breakfast);
		this.add(lunch);
		this.add(evening);
		this.add(dinner);

		breakfast.addActionListener(this);
		lunch.addActionListener(this);
		evening.addActionListener(this);
		dinner.addActionListener(this);

		this.setBounds(500,280,240,240);
		this.setLayout(new FlowLayout());
	}

	public void actionPerformed(ActionEvent ev)
	{
		if(ev.getSource().equals(breakfast))
		{
			BreakfastGUI a=new BreakfastGUI();
			a.setVisible(true);
			a.setTitle("user/breakfast");
			a.setResizable(false);
			a.getContentPane().setLayout(null);
			a.getContentPane().setBackground(Color.ORANGE);
		}
		else if(ev.getSource().equals(lunch))
		{
			LunchGUI a=new LunchGUI();
			a.setVisible(true);
			a.setTitle("user/lunch");
			a.setResizable(false);
			a.getContentPane().setLayout(null);
			a.getContentPane().setBackground(Color.ORANGE);
		}
		else if(ev.getSource().equals(evening))
		{
			EveningGUI a=new EveningGUI();
			a.setVisible(true);
			a.setTitle("user/evening");
			a.setResizable(false);
			a.getContentPane().setLayout(null);
			a.getContentPane().setBackground(Color.ORANGE);
		}
		else if(ev.getSource().equals(dinner))
		{
			DinnerGUI a=new DinnerGUI();
			a.setVisible(true);
			a.setTitle("user/dinner");
			a.setResizable(false);
			a.getContentPane().setLayout(null);
			a.getContentPane().setBackground(Color.ORANGE);
		}
	}
}