package kh.classmn.vo.student;

public class Student {
	private String id;
	private String password;
	private int userType;
	private int stateType;//0: 로그오프, 1: 로그온, 2: 작업완료, 3: 작업진행중, 4: 질문있음.
	
	public Student() {}
	public Student(String getId, String getPw) {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUserType() {
		return userType;
	}
	public void setUserType(int userType) {
		this.userType = userType;
	}
	public int getStateType() {
		return stateType;
	}
	public void setStateType(int stateType) {
		this.stateType = stateType;
	}
	
	
	

}
