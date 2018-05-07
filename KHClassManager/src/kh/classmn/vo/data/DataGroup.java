package kh.classmn.vo.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;

import kh.classmn.vo.student.Student;

public class DataGroup {
	private static DataGroup dataGroup;
	private Student myMember = new Student();
//	private GBCData myGBCData = new GBCData();
	private HashMap<String, Student> memberDataList = new HashMap<String,Student>();
//	private HashMap<String, GBCData> gameDataList = new HashMap<String,GBCData>(); 
	private final String PATH = System.getProperty("user.home") + "/desktop/";
	private final String MEMBERFILE = "student.txt";
	private final String DATAFILE ="gbc.txt";
	
	public DataGroup() {
		dataGroup = this;
		loadData();
//		loadGBCData();
	}
	
	public static DataGroup getInstance() {return dataGroup;}
	
	public boolean chkValid(String key)
	{
		return memberDataList.containsKey(key);
	}
	public void setMemberDataList(String key, Student member)
	{
		this.memberDataList.put(key, member);
	}
	public Student getMember(String id)
	{
		return memberDataList.get(id);
	}
	
	public Student getMyMember() {
		return myMember;
	}

	public void setMyMember(Student myMember) {
		this.myMember = myMember;
	}

//	public GBCData getMyGBCData() {
//		return myGBCData;
//	}
//
//	public void setMyGBCData(GBCData myGBCData) {
//		this.myGBCData = myGBCData;
//	}

	public void saveData()
	{
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			
			fos = new FileOutputStream(PATH+MEMBERFILE);
			oos = new ObjectOutputStream(fos);
			memberDataList.put(myMember.getId(), myMember);
			oos.writeObject(memberDataList);

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
//	public void saveGBCData()
//	{
//		FileOutputStream fos = null;
//		ObjectOutputStream oos = null;
//		try {
//			fos = new FileOutputStream(PATH + DATAFILE);
//			oos = new ObjectOutputStream(fos);
//			gameDataList.put(myMember.getId(), myGBCData);
//			oos.writeObject(gameDataList);
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				oos.close();
//				fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//	}

	public void loadData()
	{
		System.out.println("최초 불러오기.");
		File file = new File(PATH+MEMBERFILE);
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		if(file.exists()) 
		{
			try {
				fis = new FileInputStream(PATH+MEMBERFILE);
				ois = new ObjectInputStream(fis);
				memberDataList = (HashMap<String, Student>) ois.readObject();

			} catch(Exception e){
				e.printStackTrace();
			}finally{
				try {
					ois.close();
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
//		System.out.println("tt 포함됐는지 " + memberDataList.containsKey("tt"));
//		   Iterator<String> keys = memberDataList.keySet().iterator();
//	        while( keys.hasNext() ){
//	            String key = keys.next();
//	            System.out.println( String.format("키 : %s, 값 : %s", key, memberDataList.get(key)) );
//	        }


	}
//	public void loadGBCData()
//	{
//		File file = new File(PATH+DATAFILE);
//		FileInputStream fis = null;
//		ObjectInputStream ois = null;
//		if(file.exists()) 
//		{
//			try {
//				fis = new FileInputStream(PATH+DATAFILE);
//				ois = new ObjectInputStream(fis);
//				gameDataList = (HashMap<String, GBCData>) ois.readObject();
//
//			} catch(Exception e){
//				e.printStackTrace();
//			}finally{
//				try {
//					ois.close();
//					fis.close();
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//			}
//		}
//	}

	public void FileCheck()
	{
		System.out.println("파일체크");
//		File file = new File(PATH+DATAFILE);
//		if(file.exists())
//		{
//			// 해당아이디로 저장된 정보가 있을때.
//			if(gameDataList.containsKey(myMember.getId()))
//			{
//				myGBCData = gameDataList.get(myMember.getId());
//			}
//			else  // 해당 아이디로 정보가 없을때.
//			{
//				gameDataList.put(myMember.getId(), myGBCData);
//			}
//		}
//		else
//		{
//			// 데이터가 없으면 새로 만들어준다.
//			saveGBCData();
//		}
	}
}
