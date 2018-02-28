package kh.java.object;

public class TestMain {

	public static void main(String[] args) {
		Student s1 = new Student("유비", 20, "서울시");
		Student s2 = null;
		
		try {
			s2 = (Student)s1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Test t1 = new Test(10,20);
		Test t2 = t1;//  new Test(10,20);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

		Student[] s = new Student[10];
		int index = 0;
		
		s[index++] = new Student("유비", 20, "서울시");
		s[index++] = new Student("노비", 30, "보라매시");
		s[index++] = new Student("코비", 40, "신림시");
		s[index++] = new Student("강비", 50, "금천시");
		s[index++] = new Student("뉴비", 60, "창원시");
		s[index++] = new Student("솔비", 70, "울산시");
		s[index++] = new Student("강비", 80, "시흥시");
		
		boolean chk = false;
		Student search = new Student("유비", 20,"서울시");
		for(int i = 0; i<index;i++)
		{
			if(s[i].hashCode()==search.hashCode())
			{
				chk = true;
			}
		}
		
		String result = chk?"찾았습니다.":"찾지 못했습니다.";
		System.out.println(result);
		
		
//		System.out.println("===============정보 출력===============");
//		System.out.println("이름\t\t나이\t\t주소");
//		
//		for(int i = 0; i<index;i++)
//		{
//			System.out.println(s[i]);
//		}		
	}

}
