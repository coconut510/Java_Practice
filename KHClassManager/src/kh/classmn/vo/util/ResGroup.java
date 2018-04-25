package kh.classmn.vo.util;

import java.awt.Color;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.w3c.dom.css.RGBColor;

public class ResGroup {
	private String commonPath = "../KHClassManager/src/resource/";
	private Image khLogo;
	private Color blackBlue;
	private Color orange;
	private Color skyBlue;
	private Color white;
	private Color gray;

	
	private static ResGroup resGroup;
	public ResGroup() {
		setGray();
		setBlackBlue();
		setOrange();
		setSkyBlue();
		setWhite();
		setKhLogo();
		resGroup = this;
	}
	public static ResGroup getInstance(){return resGroup;}
	
	public Image getKhLogo() {
		return khLogo;
	}
	public void setKhLogo() {
		File path = new File(commonPath+"kh_logo.jpg");
		try {
			khLogo  = ImageIO.read(path).getScaledInstance(195, 70, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Color getGray() {
		return gray;
	}
	public void setGray() {
		this.gray = new Color(235,235,235);
	}
	public Color getBlackBlue() {
		return blackBlue;
	}
	public void setBlackBlue() {
		this.blackBlue = new Color(48,61,69);
	}
	public Color getOrange() {
		return orange;
	}
	public void setOrange() {
		this.orange = new Color(250,93,65);
	}
	public Color getSkyBlue() {
		return skyBlue;
	}
	public void setSkyBlue() {
		this.skyBlue= new Color(92,190,240);
	}
	public Color getWhite() {
		return white;
	}
	public void setWhite() {
		this.white = new Color(255,255,255);
	}
	public int getFrameWidth() {
		return 	(int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.4); 
	}
	public int getFrameHeight() {
		return (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.7);
	}
	
}
