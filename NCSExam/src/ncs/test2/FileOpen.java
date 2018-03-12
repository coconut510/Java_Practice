package ncs.test2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileOpen {
	public void fileOpen(String fileName)
	{
		try(BufferedReader bfr = new BufferedReader(new FileReader(fileName))) {
			String line = null;
			while(true)
			{
				line = bfr.readLine();
				if(line == null)
				{  	
					bfr.close();
					break;
				}
				else System.out.println(line);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
