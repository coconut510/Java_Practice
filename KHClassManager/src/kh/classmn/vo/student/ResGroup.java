package kh.classmn.vo.student;

import java.awt.Color;

import org.w3c.dom.css.RGBColor;

public class ResGroup {
	private Color blackBlue;
	private Color orange;
	private Color skyBlue;
	private Color white;
	private Color gray;
	
	private ResGroup resGroup;
	public ResGroup() {
		getGray();
		getBlackBlue();
		getOrange();
		getSkyBlue();
		getWhite();
		resGroup= new ResGroup();
	}
	public static ResGroup getInstance()
	{
		
		return new ResGroup();
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
	
}
