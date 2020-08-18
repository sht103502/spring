package com.icia.board.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.icia.board.dao.BoardDAO;
import com.icia.board.dto.BoardDTO;

@Service
public class BoardService {

	ModelAndView mav = new ModelAndView();
	
	@Autowired
	private BoardDAO bdao;
	
	// 게시판 글쓰기
	public ModelAndView boardWriteFile(BoardDTO board) throws IllegalStateException, IOException {
		
		MultipartFile bFile = board.getBfile();
		String fileName = bFile.getOriginalFilename();
		
		String savePath = "C:/Users/1/Documents/workspace-spring-tool-suite-4-4.7.1.RELEASE/BoardTest/src/main/webapp/resources/fileUpload" + fileName;
		
		if(!bFile.isEmpty()) {
			bFile.transferTo(new File(savePath));
		}
		board.setBfilename(fileName);
		
		int writeResult = bdao.boardWriteFile(board);
		
		if(writeResult>0) {
			mav.setViewName("index");
		} else {
			mav.setViewName("index");
		}
		return mav;
	}

}
