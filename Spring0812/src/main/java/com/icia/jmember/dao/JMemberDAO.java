package com.icia.jmember.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.jmember.dto.JMemberDTO;
import com.icia.jmember.dto.JoinMemberDTO;

@Repository
public class JMemberDAO {

	@Autowired
	private SqlSessionTemplate sql;
	
	/*
	 * public int insert(JMemberDTO member) { return sql.insert("Member.insert",
	 * member); }
	 * 
	 * public List<JMemberDTO> mList() { return sql.selectList("Member.mList"); }
	 */
///////////////////////////////////
	
	public List<JoinMemberDTO> mList1() {
		return sql.selectList("Member.mList1");
	}

	public int insert1(JoinMemberDTO joinmember) {
	
		return sql.insert("Member.insert1", joinmember);
	}
	

}
