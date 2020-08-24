package com.icia.tae.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.icia.tae.dto.MemberDTO;

@Repository
public class MemberDAO {
	@Autowired
	private SqlSessionTemplate sql;
	
	//회원가입
		public int join(MemberDTO member) {
			return sql.insert("Member.join",member);
		}
		
		public String Login(MemberDTO member) {
			System.out.println("member"+member);
				return sql.selectOne("Member.Login", member);
			}
		
		public List<MemberDTO> memberList() {
			
			return sql.selectList("Member.memberList");
		}
		
		public String idOverlap(String mid) {
			
			return sql.selectOne("Member.idOverlap",mid);
		}
}
