package com.boot.projectEx.model;

import java.sql.Date;

public class MemberVO {
	private String memId;
	private String memPwd;
	private String memName;
	private String memEmail;
	private Date memJoinDate;
	
	public MemberVO() {}
	
	public String getMemId() {
		return memId;
	}
	
	public void setMemId(String memId) {
		this.memId = memId;
	}
	
	public String getMemPwd() {
		return memPwd;
	}
	
	public void setMemPw(String memPwd) {
		this.memPwd = memPwd;
	}
	
	public String getMemName() {
		return memName;
	}
	
	public void setMemName(String memName) {
		this.memName = memName;
	}
	
	public String getMemEmail() {
		return memEmail;
	}
	
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	
	public Date getMemJoinDate() {
		return memJoinDate;
	}
	
	public void setMemJoinDate(Date memJoinDate) {
		this.memJoinDate = memJoinDate;
	}
	
}
