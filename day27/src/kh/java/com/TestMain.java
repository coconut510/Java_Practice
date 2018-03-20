package kh.java.com;

import java.awt.Font;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class TestMain {

	public static void main(String[] args) {
		
//		try {
//		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//		        if ("Nimbus".equals(info.getName())) {
//		            UIManager.setLookAndFeel(info.getClassName());
//		            break;
//		        }
//		    }
//		} catch (Exception e) {
//		    // If Nimbus is not available, you can set the GUI to another look and feel.
//		}
		
		//UIManager.put("Menu.font", new Font("Serif",Font.BOLD,10));
		new GuiTest();
	}
}
