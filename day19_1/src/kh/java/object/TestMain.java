package kh.java.object;

public class TestMain {

	public static void main(String[] args) {
		Student s1 = new Student("����", 20, "�����");
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
		
		s[index++] = new Student("����", 20, "�����");
		s[index++] = new Student("���", 30, "����Ž�");
		s[index++] = new Student("�ں�", 40, "�Ÿ���");
		s[index++] = new Student("����", 50, "��õ��");
		s[index++] = new Student("����", 60, "â����");
		s[index++] = new Student("�ֺ�", 70, "����");
		s[index++] = new Student("����", 80, "�����");
		
		boolean chk = false;
		Student search = new Student("����", 20,"�����");
		for(int i = 0; i<index;i++)
		{
			if(s[i].hashCode()==search.hashCode())
			{
				chk = true;
			}
		}
		
		String result = chk?"ã�ҽ��ϴ�.":"ã�� ���߽��ϴ�.";
		System.out.println(result);
		
		
//		System.out.println("===============���� ���===============");
//		System.out.println("�̸�\t\t����\t\t�ּ�");
//		
//		for(int i = 0; i<index;i++)
//		{
//			System.out.println(s[i]);
//		}		
	}

}
