package kh.java.com;


public class TestMain {

	public static void main(String[] args) 
	{	
		AnimalMgr<Tiger> m1 = new AnimalMgr<Tiger>(new Tiger(100));
		AnimalMgr<Bear> m2 = new AnimalMgr<Bear>(new Bear(200));
		
		System.out.println( m1.data.hp );
		System.out.println( m2.data.hp );
		
//		GenericEx<Integer,String> g1 = new GenericEx<Integer,String>(100,"Hello");
//		GenericEx<Double, Character> g2 = new GenericEx<Double, Character>(3.14,'k');
//
//		System.out.println(g1.getDataT());
//		System.out.println(g1.getDataE());
//		
//		System.out.println(g2.getDataT());
//		System.out.println(g2.getDataE());
	}
}