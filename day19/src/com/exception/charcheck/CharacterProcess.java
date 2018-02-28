package com.exception.charcheck;

import java.util.StringTokenizer;

public class CharacterProcess {
	public int countAlpha(String s) throws CharCheckException
	{
		int alphaCount = 0;
	
		for(int i = 0; i<s.length();i++) 
		{
			char c = s.charAt(i);
			if(c==' ') throw new CharCheckException("공백이 포함되면 안됩니다.");
			if(('a'<=c && c<='z') || ('A'<=c && c<='Z')) alphaCount+=1;
		}
		return alphaCount;
	}
}
