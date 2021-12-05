import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BreakfastGUI extends JFrame
{
	JButton ok,confirm;
	Database db;

	public BreakfastGUI()
	{
		ok=new JButton("Total price");
		confirm=new JButton("Confirm");

		db=new Database();

		JLabel title=new JLabel("Items for breakfast");
		title.setFont(new Font("Elephant",Font.ITALIC,20)); 
        title.setForeground(Color.BLUE);

        JLabel a=new JLabel("List of price:");
        a.setFont(new Font("Elephant",Font.BOLD,17));
        JLabel b=new JLabel("Bun parotta 2 pcs: 50 tk");
        JLabel c=new JLabel("Muglai parotta 2 pcs: 60 tk");
        JLabel d=new JLabel("Beef khichuri 1 plate: 100 tk");
        JLabel e=new JLabel("Chicken khichuri 1 plate: 80 tk");
        JLabel f=new JLabel("Normal chicken noodles 1 plate: 70 tk");
        JLabel g=new JLabel("Chilli chicken noodles 1 plate: 80 tk");
        JLabel h=new JLabel("Mountain Dew 400ml (1 bottle): 30 tk");
        JLabel i=new JLabel("Diet pepsi 500ml (1 bottle): 30 tk");
        JLabel j=new JLabel("Mineral water 500ml (1 bottle): 15 tk");

		JLabel labelItems=new JLabel("Items you want to buy for breakfast: ");
		labelItems.setFont(new Font("Elephant",Font.BOLD,14));
		JLabel parotta=new JLabel("Parotta 2 pcs: ");
		String parottaList[]={"None","Bun","Muglai"};
		JComboBox list1 = new JComboBox(parottaList);
		JLabel khichuri=new JLabel("Khichuri 1 plate: ");
		String khichuriList[]={"None","Beef","Chicken"};
		JComboBox list2 = new JComboBox(khichuriList);
		JLabel noodles=new JLabel("Chicken noodles 1 plate: ");
		String noodlesList[]={"None","Normal","Chilli"};
		JComboBox list3 = new JComboBox(noodlesList);
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

		this.add(parotta);
		this.add(list1);
		this.add(khichuri);
		this.add(list2);
		this.add(noodles);
		this.add(list3);
		this.add(drinks);
		this.add(list4);
		this.add(ok);
		this.add(confirm);
		JLabel message=new JLabel("Once you confirmed,");
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
						int bun=50;
						int muglai=60;
						int beef=100;
						int chicken=80;
						int normal=70;
						int chilli=80;
						int dew=30;
						int pepsi=30;
						int water=15;
						if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=normal;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chilli;
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
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+beef+normal+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+beef+normal+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+beef+normal+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+beef+chilli+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+beef+chilli+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+beef+chilli+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+chicken+normal+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+chicken+normal+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+chicken+normal+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+chicken+chilli+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+chicken+chilli+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+chicken+chilli+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}

						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+beef+normal+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+beef+normal+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+beef+normal+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+beef+chilli+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+beef+chilli+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+beef+chilli+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+chicken+normal+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+chicken+normal+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+chicken+normal+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+chicken+chilli+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+chicken+chilli+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+chicken+chilli+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+beef;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+chicken;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+normal;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+chilli;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+beef;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+chicken;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+normal;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+chilli;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef+normal;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef+chilli;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken+normal;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken+chilli;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=normal+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=normal+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=normal+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chilli+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chilli+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chilli+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+beef+normal;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+beef+chilli;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+chicken+normal;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+chicken+chilli;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+beef+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+beef+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+beef+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+chicken+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+chicken+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+chicken+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+normal+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+normal+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+normal+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+chilli+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+chilli+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+chilli+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+beef+normal;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+beef+chilli;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+chicken+normal;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+chicken+chilli;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+beef+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+beef+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+beef+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+chicken+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+chicken+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+chicken+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+normal+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+normal+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+normal+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+chilli+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+chilli+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+chilli+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef+normal+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef+normal+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef+normal+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef+chilli+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef+chilli+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef+chilli+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken+normal+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken+normal+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken+normal+water;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken+chilli+dew;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken+chilli+pepsi;
							String a="Total price: ";
							String b=a+total+" tk";
							JOptionPane.showMessageDialog(null,b);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken+chilli+water;
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
					Breakfast x=new Breakfast();
					x.parotta=list1.getSelectedItem().toString();
					x.khichuri=list2.getSelectedItem().toString();
					x.noodles=list3.getSelectedItem().toString();
					x.drinks=list4.getSelectedItem().toString();

					if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						JOptionPane.showMessageDialog(null,"You have selected nothing");
					else 
					{
						int bun=50;
						int muglai=60;
						int beef=100;
						int chicken=80;
						int normal=70;
						int chilli=80;
						int dew=30;
						int pepsi=30;
						int water=15;
						if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai;
							x.tk=total;
							db.breakfast(x);
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
							int total=beef;
							x.tk=total;
							db.breakfast(x);
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
							int total=chicken;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=normal;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chilli;
							x.tk=total;
							db.breakfast(x);
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
							db.breakfast(x);
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
							db.breakfast(x);
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
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+beef+normal+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+beef+normal+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+beef+normal+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+beef+chilli+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+beef+chilli+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+beef+chilli+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+chicken+normal+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+chicken+normal+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+chicken+normal+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+chicken+chilli+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+chicken+chilli+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+chicken+chilli+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}

						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+beef+normal+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+beef+normal+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+beef+normal+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+beef+chilli+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+beef+chilli+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+beef+chilli+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+chicken+normal+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+chicken+normal+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+chicken+normal+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+chicken+chilli+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+chicken+chilli+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+chicken+chilli+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+beef;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+chicken;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+normal;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+chilli;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+beef;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+chicken;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+normal;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+chilli;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef+normal;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=beef+chilli;
							x.tk=total;
							db.breakfast(x);
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
							int total=beef+dew;
							x.tk=total;
							db.breakfast(x);
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
							int total=beef+pepsi;
							x.tk=total;
							db.breakfast(x);
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
							int total=beef+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken+normal;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=chicken+chilli;
							x.tk=total;
							db.breakfast(x);
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
							int total=chicken+dew;
							x.tk=total;
							db.breakfast(x);
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
							int total=chicken+pepsi;
							x.tk=total;
							db.breakfast(x);
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
							int total=chicken+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=normal+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=normal+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=normal+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chilli+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chilli+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chilli+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+beef+normal;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+beef+chilli;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+chicken+normal;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=bun+chicken+chilli;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+beef+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+beef+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+beef+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+chicken+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+chicken+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+chicken+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+normal+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+normal+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+normal+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=bun+chilli+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=bun+chilli+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Bun") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=bun+chilli+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+beef+normal;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+beef+chilli;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+chicken+normal;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("None"))
						{
							int total=muglai+chicken+chilli;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+beef+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+beef+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+beef+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+chicken+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+chicken+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("None") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+chicken+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+normal+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+normal+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+normal+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=muglai+chilli+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=muglai+chilli+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("Muglai") && list2.getSelectedItem().toString().equals("None") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=muglai+chilli+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef+normal+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef+normal+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef+normal+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=beef+chilli+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=beef+chilli+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Beef") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=beef+chilli+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken+normal+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken+normal+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Normal") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken+normal+water;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Dew 400ml"))
						{
							int total=chicken+chilli+dew;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Pepsi 500ml"))
						{
							int total=chicken+chilli+pepsi;
							x.tk=total;
							db.breakfast(x);
							JOptionPane.showMessageDialog(null,"Thanks for your order");

							PaymentGUI a=new PaymentGUI();
							a.setVisible(true);
							a.setTitle("payment");
							a.setResizable(false);
							a.getContentPane().setLayout(null);
							a.getContentPane().setBackground(Color.GREEN);
						}
						else if(list1.getSelectedItem().toString().equals("None") && list2.getSelectedItem().toString().equals("Chicken") && list3.getSelectedItem().toString().equals("Chilli") && list4.getSelectedItem().toString().equals("Water 500ml"))
						{
							int total=chicken+chilli+water;
							x.tk=total;
							db.breakfast(x);
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