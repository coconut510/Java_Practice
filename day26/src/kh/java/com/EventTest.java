package kh.java.com;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class EventTest extends JFrame 
{
	private JButton button= new JButton("눌러보세요.");
	private JButton button2 = new JButton("누르지 마세요.");
	
	class MyListener2 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button)
			{
				JOptionPane.showMessageDialog(null,"알림창");
			}
			else if(e.getSource()==button2)
			{
				JOptionPane.showMessageDialog(null,"누르지말리니깐..");
			}
		}		
	}
	
	public void comInit()
	{
		this.add(button);
		this.add(button2);
		button.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button)
				{
					JOptionPane.showMessageDialog(null,"알림창");
				}
			}
		});
		
		button2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button2)
				{
					JOptionPane.showMessageDialog(null,"누르지 마세욧!");
				}
			}
		});
	}
	
	public EventTest()
	{
		super("Event");
		this.setLayout(new FlowLayout());
		this.setSize(450,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.comInit();
		this.setVisible(true);
	}
		
}
