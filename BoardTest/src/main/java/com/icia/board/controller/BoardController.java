package com.icia.board.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.icia.board.dto.BoardDTO;
import com.icia.board.service.BoardService;

@Controller
public class BoardController {

	private ModelAndView mav = new ModelAndView();
	
	@Autowired
	private BoardService bdsvc;
	
	// 게시판으로 이동
	@RequestMapping(value="/boardForm")
	private String boardForm() {
		return "boardWrite";
	}
	
	// 게시판 글쓰기(boardWriteFile)
	@RequestMapping(value="/boardWriteFile", method=RequestMethod.POST)
	private ModelAndView boardWriteFile(@ModelAttribute BoardDTO board) throws IllegalStateException, IOException {
		
		mav = bdsvc.boardWriteFile(board);
		
		return mav;
	}
	
	//페이지!!
	@RequestMapping(value="")
	private String pageList() {
		return "boardPage";
	}
}
