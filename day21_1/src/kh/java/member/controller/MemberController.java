package kh.java.member.controller;

import java.util.HashMap;

import kh.java.member.model.vo.Member;

public class MemberController {
	
	private HashMap<String, Member> member = new HashMap<String,Member>();
	public boolean memberJoin(Member m)
	{
        member.put(m.getId(), m);
		return memberCheck(m.getId());
	}
	public boolean memberCheck(String userId)
	{		
		return  member.containsKey(userId);
	}
	public Member memberSelect(String userId)
	{
		return member.get(userId) ;
	}
	public boolean memberModify(Member m)
	{
		member.put(m.getId(), m);
		return false;
	}
	public boolean memberDelete(String userId)
	{
		member.remove(userId);
		return true;
	}
}
