package kh.java.listEx;
import java.util.ArrayList;
import java.util.Collections;
public class TestMain {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(42);
		al.add(90);
		al.add(50);
		al.add(98);
		al.add(29);
		al.add(88);
		al.add(76);
		Collections.sort(al);
		for(Object o : al)
		{
			System.out.println(o);
		}
//		ArrayList<Member> ml = new ArrayList<Member>();
//		ml.add(new Member("홍길동", 20,"경기도"));
//		ml.add(new Member("고길동", 30,"서울시"));
//		ml.add(new Member("청길동", 40,"인천시"));
//		ml.set(1, new Member("김지똥",21,"역삼동"));
//		
//		for(Member m : ml)
//		{
//			System.out.println(m);
//		}
		
//		ArrayList<String> al = new ArrayList<String>();
//		al.add("Hello");
//		al.add("World");
//		al.add("MSLove");
//		al.add("MSHate");
//		
//		ArrayList als = new ArrayList();
//		String s = (String) als.get(0);
//		System.out.println(al.get(0));
//		
//		for(String str : al)
//		{
//			System.out.println(str);
//		}
		
	}

}
