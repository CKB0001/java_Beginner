
import java.awt.*;
import java.io.File;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class backlogOfUnfilledOrders 
{
	public backlogOfUnfilledOrders()
	{
		
		JFrame f=new JFrame("未完成订单");
		Container c=f.getContentPane();
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(1,2));
		p.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"",TitledBorder.CENTER,TitledBorder.TOP));
		JLabel l=new JLabel("                                                    未完成订单：");
		p.add(l);
		JPanel p1=new JPanel();
		p1.setLayout(new GridLayout(1,1));
		JPanel p2=new JPanel();
		p2.setLayout(new GridLayout(1,1));
		p2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.black,2),"显示",TitledBorder.CENTER,TitledBorder.TOP));
		JTextPane label=new JTextPane();
		p2.add(label);
		//********************************加入车票
		label.setText(" 11111");
		c.add(p,BorderLayout.NORTH);
		c.add(p1,BorderLayout.SOUTH);
		c.add(p2,BorderLayout.CENTER);
		f.pack();
		f.setSize(400,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
