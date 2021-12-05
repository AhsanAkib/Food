import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PaymentGUI extends JFrame  
{
	JButton ok;
	public PaymentGUI()
	{
		JLabel title=new JLabel("Payment by:");
		
        this.add(title);
        String list[]={"None","BKash","UKash","Rocket","NexusPay"};
		JComboBox total=new JComboBox(list);
		this.add(total);

		JLabel title2=new JLabel("You must pay the delivery ");
		title2.setFont(new Font("Elephant",Font.ITALIC,15)); 
        title2.setForeground(Color.BLUE);
        this.add(title2);
        JLabel title3=new JLabel("charge which is excluded ");
		title3.setFont(new Font("Elephant",Font.ITALIC,15)); 
        title3.setForeground(Color.BLUE);
        this.add(title3);
        JLabel title4=new JLabel("with the price of total order");
		title4.setFont(new Font("Elephant",Font.ITALIC,15)); 
        title4.setForeground(Color.BLUE);
        this.add(title4);

        JLabel l=new JLabel("Delivery charge list: ");
        l.setFont(new Font("Elephant",Font.BOLD,14));
        this.add(l);

        JLabel a=new JLabel("From Gulshan: 30 tk");
        JLabel b=new JLabel("From Badda: 20 tk");
        JLabel c=new JLabel("From Kuril: 20 tk");
        JLabel d=new JLabel("From Banani: 40 tk");
        JLabel e=new JLabel("From Dhanmondi: 60 tk");
        JLabel f=new JLabel("From Rampura: 30 tk");
        JLabel g=new JLabel("From Malibag: 40 tk");
        JLabel h=new JLabel("From Mirpur: 40 tk");
        JLabel i=new JLabel("From Motijhil: 50 tk");
        JLabel j=new JLabel("From Mohakhali: 40 tk");
        JLabel k=new JLabel("From New market: 50 tk");
        this.add(a);
        this.add(b);
        this.add(c);
        this.add(d);
        this.add(e);
        this.add(f);
        this.add(g);
        this.add(h);
        this.add(i);
        this.add(j);
        this.add(k);

        JLabel q=new JLabel("Fill the gaps: ");
        q.setFont(new Font("Elephant",Font.BOLD,14));
        this.add(q);

        JLabel phone=new JLabel("Enter phone number: ");
		JLabel pin=new JLabel("Enter pin number: ");
		JLabel price=new JLabel("Ammount(with delivery charge): ");
		JTextField gap1=new JTextField(15);
		JPasswordField gap2=new JPasswordField(15);
		JTextField gap3=new JTextField(15);
		this.add(phone);
		this.add(gap1);
		this.add(pin);
		this.add(gap2);
		this.add(price);
		this.add(gap3);

		JButton ok=new JButton("Okay");
		this.add(ok);

        this.setBounds(400,100,225,600);
		this.setLayout(new FlowLayout());

		ok.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					if(gap1.getText().equals("") || new String(gap2.getPassword()).equals("") || gap3.getText().equals("")
						|| gap1.getText()==null || gap2.getText()==null || gap2.getText()==null || total.getSelectedItem().toString().equals("None"))
					{
						JOptionPane.showMessageDialog(null,"Please fill up all the blanks"); 
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Thanks for ordering from us");
					}
				}
			}
		);
	}
}