package com.js.member.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.js.member.dto.MemberDTO;

@Repository
public class MemberDAO {

		@Autowired
		private SqlSessionTemplate sql;
		
		// 회원가입
		public int memberJoin(MemberDTO member) {
			return sql.insert("Member.memberJoin", member);
		}

		public List<MemberDTO> memberList() {
			return sql.selectList("Member.memberList");
		}

		public String memberLogin(MemberDTO member) {
			return sql.selectOne("Member.memberLogin", member);
		}

		public MemberDTO memberView(String id) {
			return sql.selectOne("Member.memberView", id);
		}

		public int memberDelete(String id) {
			return sql.delete("Member.memberDelete",id);
			
		}

		public int modifyProcess(MemberDTO member) {
			
			return sql.update("Member.modifyProcess", member);
		}
		
		
		

	}


