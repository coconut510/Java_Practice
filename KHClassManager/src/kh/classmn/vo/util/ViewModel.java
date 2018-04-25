package kh.classmn.vo.util;

import java.awt.Insets;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewModel {
	private JFrame mainFrame;
	private HashMap<String, JPanel> panelMap = new HashMap<String, JPanel>();
	private static ViewModel vm;
	public ViewModel()
	{
		this.vm = this;
	}
	public static ViewModel getInstance() {return vm;}
	public JFrame getMainFrame() {
		return mainFrame;
	}
	public void setMainFrame(JFrame mainFrame) {
		this.mainFrame = mainFrame;
	}	
	public void addPanel(String key, JPanel panel)
	{
		if(!panelMap.containsKey(key))panelMap.put(key, panel);
	}
	public JPanel getPanel(String key)
	{
		return panelMap.get(key);
	}
	public JButton fitImageBtn(JButton b)
	{
		b.setBorderPainted(false);
		b.setBorder(null);	
		b.setMargin(new Insets(0, 0, 0, 0));
//		b.setContentAreaFilled(false);
//		b.setRolloverIcon(iconA());
		return b;
	}
	
}
