package com.js.member.dto;

public class MemberDTO {
	private String jsid;
	private String jspassword;
	private String jsname;
	private String jsbirth;
	private String jsgender;
	private String jsemail;
	public String getJsid() {
		return jsid;
	}
	public void setJsid(String jsid) {
		this.jsid = jsid;
	}
	public String getJspassword() {
		return jspassword;
	}
	public void setJspassword(String jspassword) {
		this.jspassword = jspassword;
	}
	public String getJsname() {
		return jsname;
	}
	public void setJsname(String jsname) {
		this.jsname = jsname;
	}
	public String getJsbirth() {
		return jsbirth;
	}
	public void setJsbirth(String jsbirth) {
		this.jsbirth = jsbirth;
	}
	public String getJsgender() {
		return jsgender;
	}
	public void setJsgender(String jsgender) {
		this.jsgender = jsgender;
	}
	public String getJsemail() {
		return jsemail;
	}
	public void setJsemail(String jsemail) {
		this.jsemail = jsemail;
	}
	@Override
	public String toString() {
		return "MemberDTO [jsid=" + jsid + ", jspassword=" + jspassword + ", jsname=" + jsname + ", jsbirth=" + jsbirth
				+ ", jsgender=" + jsgender + ", jsemail=" + jsemail + "]";
	}
	
	
	
}
