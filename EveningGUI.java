import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EveningGUI extends JFrame
{
	JButton ok,confirm;
	Database db;

	public EveningGUI()
	{
		ok=new JButton("Total price");
		confirm=new JButton("Confirm");

		db=new Database();

		JLabel title=new JLabel("Items for evening");
		title.setFont(new Font("Elephant",Font.ITALIC,20)); 
        title.setForeground(Color.BLUE);

        JLabel a=new JLabel("List of price:");
        a.setFont(new Font("Elephant",Font.BOLD,17));
        JLabel b=new JLabel("1 plate beef pasta: 250 tk");
        JLabel c=new JLabel("1 plate chicken pasta: 230 tk");
        JLabel d=new JLabel("1 beef cheese pizza 8inch: 270 tk");
        JLabel e=new JLabel("1 chicken cheese pizza 8inch: 250 tk");
        JLabel f=new JLabel("1 beef cheese burger: 220 tk");
        JLabel g=new JLabel("1 chicken cheese burger: 200 tk");
        JLabel g1=new JLabel("1 beef shawarma: 140 tk");
        JLabel g2=new JLabel("1 chicken shawarma: 120 tk");
        JLabel h=new JLabel("Mountain Dew 400ml (1 bottle): 30 tk");
        JLabel i=new JLabel("Diet pepsi 500ml (1 bottle): 30 tk");
        JLabel j=new JLabel("Mineral water 500ml (1 bottle): 15 tk");

		JLabel labelItems=new JLabel("Items you want to buy for evening: ");
		labelItems.setFont(new Font("Elephant",Font.BOLD,14));
		JLabel pasta=new JLabel("Pasta 1 plate: ");
		String pastaList[]={"None","Beef","Chicken"};
		JComboBox list1 = new JComboBox(pastaList);
		JLabel pizza=new JLabel("Cheese pizza 8inch: ");
		String pizzaList[]={"None","Beef","Chicken"};
		JComboBox list2 = new JComboBox(pizzaList);
		JLabel burger=new JLabel("1 Cheese burger : ");
		String burgerList[]={"None","Beef","Chicken"};
		JComboBox list3 = new JComboBox(burgerList);
		JLabel shawarma=new JLabel("1 Shawarma: ");
		String shawarmaList[]={"None","Beef","Chicken"};
		JComboBox list4 = new JComboBox(shawarmaList);
		JLabel drinks=new JLabel("Drinks(1 bottle): ");
		String drinkList[]={"None","Dew 400ml","Pepsi 500ml","Water 500ml"};
		JComboBox list5=new JComboBox(drinkList);

		this.setBounds(500,110,270,590);
		this.setLayout(new FlowLayout());
		this.add(title);
		this.add(a);
		this.add(c);
		this.add(b);
		this.add(d);
		this.add(e);
		this.add(f);
		this.add(g);
		this.add(g1);
		this.add(g2);
		this.add(h);
		this.add(i);
		this.add(j);
		this.add(labelItems);

		this.add(pasta);
		this.add(list1);
		this.add(pizza);
		this.add(list2);
		this.add(burger);
		this.add(list3);
		this.add(shawarma);
		this.add(list4);
		this.add(drinks);
		this.add(list5);
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
					if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						JOptionPane.showMessageDialog(null,"You have selected nothing");
					else 
					{
						int beef1=250;
						int chicken1=230;
						int beef2=270;
						int chicken2=250;
						int beef3=220;
						int chicken3=200;
						int beef4=140;
						int chicken4=120;
						int dew=30;
						int pepsi=30;
						int water=15;
						if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}



						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+beef3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+chicken3;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+beef3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+beef3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+chicken3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+chicken3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+beef3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+beef3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+chicken3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+chicken3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+beef3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+beef3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+chicken3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+chicken3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+beef3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+beef3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+chicken3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+chicken3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+beef3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+beef3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+chicken3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+chicken3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+beef3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+beef3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+chicken3+beef4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+chicken3+chicken4;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+beef3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+beef3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+beef3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+chicken3+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+chicken3+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+chicken3+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+beef3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+beef3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+beef3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+beef3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+beef3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+beef3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+chicken3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+chicken3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+chicken3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+chicken3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+chicken3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+chicken3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+beef3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+beef3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+beef3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+beef3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+beef3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+beef3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+chicken3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+chicken3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+chicken3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+chicken3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+chicken3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+chicken3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+beef3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+beef3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+beef3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+beef3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+beef3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+beef3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+chicken3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+chicken3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+chicken3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+chicken3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+chicken3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+chicken3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+beef3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+beef3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+beef3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+beef3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+beef3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+beef3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+chicken3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+chicken3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+chicken3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+chicken3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+chicken3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+chicken3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+beef3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+beef3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+beef3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+beef3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+beef3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+beef3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+chicken3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+chicken3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+chicken3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+chicken3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+chicken3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+chicken3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+beef3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+beef3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+beef3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+beef3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+beef3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+beef3+chicken4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+chicken3+beef4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+chicken3+beef4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+chicken3+beef4+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+chicken3+chicken4+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+chicken3+chicken4+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+chicken3+chicken4+water;
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
					Evening x=new Evening();
					x.pasta=list1.getSelectedItem().toString();
					x.pizza=list2.getSelectedItem().toString();
					x.burger=list3.getSelectedItem().toString();
					x.shawarma=list3.getSelectedItem().toString();
					x.drinks=list4.getSelectedItem().toString();

					if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						JOptionPane.showMessageDialog(null,"You have selected nothing");
					else 
					{
						int beef1=250;
						int chicken1=230;
						int beef2=270;
						int chicken2=250;
						int beef3=220;
						int chicken3=200;
						int beef4=140;
						int chicken4=120;
						int dew=30;
						int pepsi=30;
						int water=15;
						if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+beef3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+chicken3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+beef3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+chicken3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+beef3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+chicken3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+beef3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+chicken3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+beef3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+chicken3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+beef3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+chicken3;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+beef3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+beef3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+chicken3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef2+chicken3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+beef3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+beef3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+beef3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+chicken3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+chicken3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+chicken3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+beef3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+beef3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+chicken3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken2+chicken3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+beef3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+beef3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+beef3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+chicken3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+chicken3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+chicken3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+beef3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+beef3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+chicken3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+beef2+chicken3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+beef3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+beef3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+chicken3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=beef1+chicken2+chicken3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+beef3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+beef3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+chicken3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+beef2+chicken3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+beef3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+beef3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+chicken3+beef4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("None"))
						{
							int total=chicken1+chicken2+chicken3+chicken4;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+beef3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+beef3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+beef3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+chicken3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+chicken3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+chicken3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+beef3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+beef3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+beef3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+chicken3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+chicken3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+chicken3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+beef3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+beef3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+beef3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+chicken3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+chicken3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+chicken3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+beef3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+beef3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+beef3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+chicken3+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+chicken3+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("None") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+chicken3+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+beef3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+beef3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+beef3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+beef3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+beef3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+beef3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+chicken3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+chicken3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+chicken3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef2+chicken3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef2+chicken3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef2+chicken3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+beef3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+beef3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+beef3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+beef3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+beef3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+beef3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+chicken3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+chicken3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+chicken3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken2+chicken3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken2+chicken3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken2+chicken3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+beef3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+beef3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+beef3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+beef3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+beef3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+beef3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+chicken3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+chicken3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+chicken3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+beef2+chicken3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+beef2+chicken3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+beef2+chicken3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+beef3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+beef3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+beef3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+beef3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+beef3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+beef3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+chicken3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+chicken3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+chicken3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef1+chicken2+chicken3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef1+chicken2+chicken3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Beef") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef1+chicken2+chicken3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+beef3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+beef3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+beef3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+beef3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+beef3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+beef3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+chicken3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+chicken3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+chicken3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+beef2+chicken3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+beef2+chicken3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+beef2+chicken3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+beef3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+beef3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+beef3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+beef3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+beef3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Beef") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+beef3+chicken4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+chicken3+beef4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+chicken3+beef4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Beef") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+chicken3+beef4+water;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken1+chicken2+chicken3+chicken4+dew;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken1+chicken2+chicken3+chicken4+pepsi;
							x.tk=total;
							db.evening(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Chicken") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chicken") && list4.getSelectedItem().toString().equals("Chicken") && list5.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken1+chicken2+chicken3+chicken4+water;
							x.tk=total;
							db.evening(x);
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