package com.icia.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.board.dto.BoardDTO;
import com.icia.board.dto.PageDTO;



@Repository
public class BoardDAO {

	@Autowired
	private SqlSessionTemplate sql;
	
	public int boardWriteFile(BoardDTO board) {
		return sql.insert("Board.boardWriteFile", board) ;
	}
	//게시판 목록 보기
	public List<BoardDTO> boardList(BoardDTO board) {
		
		return sql.selectList("Board.boardList");
	}
	
//	방금 추가시킴!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//리스트 숫자
	
	//페이지 보기
	
	public int listCount() {
		return sql.selectOne("Board.listCount");
	}
	
	public List<BoardDTO> pagingList(PageDTO paging){
		return sql.selectList("Board.pagingList", paging);
	}
	public BoardDTO boardView(int bnum) {
		return sql.selectOne("Board.boardView", bnum);
	}

}
