import javax.swing.*; 
import java.awt.*;
public class Main 
{
	public static void main(String[] args)
	{
		Login a=new Login();
		a.setVisible(true);
		a.setTitle("login");
		a.setResizable(false);
		a.getContentPane().setLayout(null);
		a.getContentPane().setBackground(Color.PINK);
	}
}