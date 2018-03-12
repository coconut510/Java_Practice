package ncs.test2;

import java.util.HashMap;
import java.util.Iterator;

public class BookTest {

	public static void main(String[] args) {
//		1번.
//		Book bookArray [] = new Book[5];
//		bookArray[0] = new Book("IT","SQL Plus",50000,5);
//		bookArray[1] = new Book("IT","Java 2.0",40000,3);
//		bookArray[2] = new Book("IT","JSP Servlet",60000,6);
//		bookArray[3] = new Book("Nobel","davincicode",30000,10);
//		bookArray[4] = new Book("Nobel","cloven hoof",50000,15);
//		
//		double sum = 0;
//		for(int i = 0; i<bookArray.length;i++)
//		{
//			System.out.println(bookArray[i]);
//			sum += bookArray[i].getBookPrice();
//		}
//		System.out.printf("책 가격의 합 : %.1f원",sum);
		
//		2번
//		new FileOpen().fileOpen("text.txt");
		
//		4번
		HashMap<String, Book> map = new HashMap<String,Book>();
		map.put("SQL Plus", new Book("IT","SQL Plus",50000,5));
		map.put("Java 2.0",  new Book("IT","Java 2.0",40000,3));
		map.put("JSP Servlet",new Book("IT","JSP Servlet",60000,6));
		map.put("davincicode", new Book("Nobel","davincicode",30000,10));
		map.put("cloven hoof", new Book("Nobel","cloven hoof",50000,15));
		
		Iterator iter = map.keySet().iterator();
		while(iter.hasNext())
		{
			String key= (String)iter.next();
			System.out.println(key + "=" + map.get(key));
		}
	}

}
