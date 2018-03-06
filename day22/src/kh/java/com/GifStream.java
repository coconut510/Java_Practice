package kh.java.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class GifStream {
	public void fileLoad()
	{
		try(BufferedReader bfr = new BufferedReader(new FileReader("quiz.txt")))
		{
			StringTokenizer sT = new StringTokenizer(bfr.readLine()," ");
			ArrayList<Byte> al = new ArrayList<Byte>();
			while(sT.hasMoreTokens())
			{
				al.add((byte)Integer.parseInt(sT.nextToken(),16));
			}
			FileOutputStream fOut = new FileOutputStream("quiz.gif");
			for(Byte i : al)
			{
				fOut.write(i);
			}
			bfr.close();
			fOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}