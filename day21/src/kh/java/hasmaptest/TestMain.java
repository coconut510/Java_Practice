package kh.java.hasmaptest;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestMain {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(180101, "ȫ�浿");
		hm.put(160101, "�踻��");
		hm.put(170101, "����");
		hm.put(150101, "Ȳ����");
		hm.put(150102, "Ȳ����");
	
		Iterator<Integer> data = hm.keySet().iterator();
		for(int i =0;i<hm.size();i++)
		{
			int key = data.next();
			System.out.println( key+" "+ hm.get(key));
		}
		
		if(!hm.containsKey(150102))
		{
			hm.put(150102, "�ѼҶ�");
		}
		else
		{
			System.out.println("�й��� �ߺ��˴ϴ�.");
		}
		hm.remove(150101);
		System.out.println(hm);
		System.out.println(hm.get(171101));
	}
}
