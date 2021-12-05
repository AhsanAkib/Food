import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DinnerGUI extends JFrame
{
	JButton ok,confirm;
	Database db;

	public DinnerGUI()
	{
		ok=new JButton("Total price");
		confirm=new JButton("Confirm");

		db=new Database();

		JLabel title=new JLabel("Items for dinner");
		title.setFont(new Font("Elephant",Font.ITALIC,20)); 
        title.setForeground(Color.BLUE);

        JLabel a=new JLabel("List of price:");
        a.setFont(new Font("Elephant",Font.BOLD,17));
        JLabel b=new JLabel("1 plate beef plane rice: 120 tk");
        JLabel c=new JLabel("1 plate chicken plane rice: 100 tk");
        JLabel d=new JLabel("1 plate beef biriyani: 140 tk");
        JLabel e=new JLabel("1 plate chicken biriyani: 120 tk");
        JLabel f=new JLabel("1 plate beef khichuri: 130 tk");
        JLabel g=new JLabel("1 plate chicken khichuri: 110 tk");
        JLabel h=new JLabel("Mountain Dew 400ml (1 bottle): 30 tk");
        JLabel i=new JLabel("Diet pepsi 500ml (1 bottle): 30 tk");
        JLabel j=new JLabel("Mineral water 500ml (1 bottle): 15 tk");

		JLabel labelItems=new JLabel("Items you want to buy for dinner: ");
		labelItems.setFont(new Font("Elephant",Font.BOLD,14));
		JLabel polao=new JLabel("Plane rice 1 plate: ");
		String polaoList[]={"None","Beef","Chicken"};
		JComboBox list1 = new JComboBox(polaoList);
		JLabel tehari=new JLabel("Biriyani 1 plate: ");
		String tehariList[]={"None","Beef","Chicken"};
		JComboBox list2 = new JComboBox(tehariList);
		JLabel biriyani=new JLabel("Khichuri 1 plate: ");
		String biriyaniList[]={"None","Beef","Chicken"};
		JComboBox list3 = new JComboBox(biriyaniList);
		JLabel drinks=new JLabel("Drinks(1 bottle): ");
		String drinkList[]={"None","Dew 400ml","Pepsi 500ml","Water 500ml"};
		JComboBox list4=new JComboBox(drinkList);

		this.setBounds(500,110,270,520);
		this.setLayout(new FlowLayout());
		this.add(title);
		this.add(a);
		this.add(c);
		this.add(b);
		this.add(d);
		this.add(e);
		this.add(f);
		this.add(g);
		this.add(h);
		this.add(i);
		this.add(j);
		this.add(labelItems);

		this.add(polao);
		this.add(list1);
		this.add(tehari);
		this.add(list2);
		this.add(biriyani);
		this.add(list3);
		this.add(drinks);
		this.add(list4);
		this.add(ok);
		this.add(confirm);
		JLabel message=new JLabel("Once you confirmed");
		message.setFont(new Font("Elephant",Font.BOLD,14));
		this.add(message);
		JLabel message2=new JLabel("you can't cancel the order");
		message2.setFont(new Font("Elephant",Font.BOLD,14));
		this.add(message2);

		ok.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						JOptionPane.showMessageDialog(null,"You have selected nothing");
					else 
					{
						int beef1=120;
						int chicken1=100;
						int beef2=140;
						int chicken2=120;
						int beef3=130;
						int chicken3=110;
						int dew=30;
						int pepsi=30;
						int water=15;
						if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef2;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}

						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
					}
				}
			}
		);
		confirm.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					Dinner x=new Dinner();
					x.polao=list1.getSelectedItem().toString();
					x.tehari=list2.getSelectedItem().toString();
					x.biriyani=list3.getSelectedItem().toString();
					x.drinks=list4.getSelectedItem().toString();

					if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						JOptionPane.showMessageDialog(null,"You have selected nothing");
					else 
					{
						int beef1=120;
						int chicken1=100;
						int beef2=140;
						int chicken2=120;
						int beef3=130;
						int chicken3=110;
						int dew=30;
						int pepsi=30;
						int water=15;
						if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef2;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+beef3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+beef3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+beef3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+chicken3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+chicken3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+chicken3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+beef3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+beef3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+beef3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+chicken3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+chicken3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+chicken3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+beef3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+beef3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+beef3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+chicken3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+chicken3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+chicken3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+beef3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+beef3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+beef3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+chicken3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+chicken3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+chicken3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+beef3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+chicken3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+beef3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+chicken3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}

						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+beef3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+chicken3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+beef3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+chicken3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+beef3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+chicken3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+beef3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+chicken3;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+beef3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+beef3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+beef3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+chicken3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+chicken3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+chicken3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+beef3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+beef3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+beef3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+chicken3+dew;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+chicken3+pepsi;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+chicken3+water;
							x.tk=total;
							db.dinner(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
					}
				}
			}
		);
	}
}