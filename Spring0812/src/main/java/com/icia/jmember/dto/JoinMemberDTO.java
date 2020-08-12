package com.icia.jmember.dto;

public class JoinMemberDTO {
	private String jid;
	private String jpw;
	private String jname;
	private String jaddr;
	private String jbirth;
	private String jphone;
	public String getJid() {
		return jid;
	}
	public void setJid(String jid) {
		this.jid = jid;
	}
	public String getJpw() {
		return jpw;
	}
	public void setJpw(String jpw) {
		this.jpw = jpw;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public String getJaddr() {
		return jaddr;
	}
	public void setJaddr(String jaddr) {
		this.jaddr = jaddr;
	}
	public String getJbirth() {
		return jbirth;
	}
	public void setJbirth(String jbirth) {
		this.jbirth = jbirth;
	}
	public String getJphone() {
		return jphone;
	}
	public void setJphone(String jphone) {
		this.jphone = jphone;
	}
	@Override
	public String toString() {
		return "JoinMemberDTO [jid=" + jid + ", jpw=" + jpw + ", jname=" + jname + ", jaddr=" + jaddr + ", jbirth="
				+ jbirth + ", jphone=" + jphone + "]";
	}

}
