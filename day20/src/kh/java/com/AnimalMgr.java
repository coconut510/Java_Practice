package kh.java.com;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

public class AnimalMgr <T extends Animal>  
{
	public T data;
//	public ArrayList<? super Animal> list ;
	ArrayList<Integer> numList = new ArrayList<Integer>();
	public AnimalMgr(T data)
	{
		this.data = data;
	}
	
	public void testSuper(Collection<? super Animal> num)
	{
		
	}
}
