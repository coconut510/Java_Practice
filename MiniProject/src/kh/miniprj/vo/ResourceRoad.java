package kh.miniprj.vo;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.*;
public class ResourceRoad {
	public static ResourceRoad resorseRoad;
	private Image[] imageArr = new Image[100];
	private String imagePath = "C:\\Users\\user\\Documents\\GitDesktop\\JavaKH\\Java_Practice\\MiniProject\\src\\res\\";
	public ResourceRoad()
	{
		resorseRoad = this;
		setMainBgImage();
	}
	public void setMainBgImage()
	{	
		try {
			File imageFile = new File(imagePath+"mainBG.png");
			Image image = ImageIO.read(imageFile).getScaledInstance(450, 800, Image.SCALE_SMOOTH);
			imageArr[0] = image;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
	public Image getMainBgImage() { return imageArr[0];}
	

}
