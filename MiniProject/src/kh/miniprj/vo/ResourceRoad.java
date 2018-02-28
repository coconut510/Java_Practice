package kh.miniprj.vo;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ResourceRoad {
	public Image getImage()
	{
		URL url;

		try {
			url = new URL("https://drive.google.com/open?id=11bi8mzXGyjX1aBjEqlt9MUuXwpn5wkBz");
			Image image;			
			try {
				image = ImageIO.read(url);
				return image;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	
		
	}
}
