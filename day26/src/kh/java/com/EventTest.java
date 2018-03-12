package kh.java.com;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class EventTest extends JFrame 
{
	private JButton button= new JButton("����������.");
	private JButton button2 = new JButton("������ ������.");
	
	class MyListener2 implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button)
			{
				JOptionPane.showMessageDialog(null,"�˸�â");
			}
			else if(e.getSource()==button2)
			{
				JOptionPane.showMessageDialog(null,"�����������ϱ�..");
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
					JOptionPane.showMessageDialog(null,"�˸�â");
				}
			}
		});
		
		button2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button2)
				{
					JOptionPane.showMessageDialog(null,"������ ������!");
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
