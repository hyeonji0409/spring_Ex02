package com.boot.projectEx.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.boot.projectEx.model.MemberVO;

public interface IMemberService {

	MemberVO loginCheck(HashMap<String, Object> map);
	void joinMember(MemberVO vo);
	String memIdCheck(String memId);
}
