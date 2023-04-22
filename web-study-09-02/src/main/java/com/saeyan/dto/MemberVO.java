package com.saeyan.dto;

public class MemberVO {
	//VO 클래스는 주요 관심사를 멤버변수로 두고, 그것을 컨트롤할 수 있는 메서드를 만든다.
	private String name;
	private String userid;
	private String pwd;
	private String email;
	private String phone;
	private int admin;
	
	public String getName() {
		return name;
	}
	public String getUserid() {
		return userid;
	}
	public String getPwd() {
		return pwd;
	}
	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public int getAdmin() {
		return admin;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", userid=" + userid + ", pwd=" + pwd + ", email=" + email + ", phone="
				+ phone + ", admin=" + admin + "]";
	}
	
	

}
