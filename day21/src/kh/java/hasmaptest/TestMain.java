package kh.java.hasmaptest;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(180101, "È«±æµ¿");
		hm.put(160101, "±è¸»¶Ë");
		hm.put(170101, "°í±æ¶Ë");
		hm.put(150101, "È²Áö¶Ë");
		hm.put(150102, "È²Áö¶Ë");
	
		Iterator<Integer> data = hm.keySet().iterator();
		for(int i =0;i<hm.size();i++)
		{
			int key = data.next();
			System.out.println( key+" "+ hm.get(key));
		}
		
		if(!hm.containsKey(150102))
		{
			hm.put(150102, "ÇÑ¼Ò¶Ë");
		}
		else
		{
			System.out.println("ÇÐ¹øÀÌ Áßº¹µË´Ï´Ù.");
		}
		hm.remove(150101);
		System.out.println(hm);
		System.out.println(hm.get(171101));
	}
}
