package com.icia.board.dto;

import lombok.Data;

@Data
public class CommentDTO {
	private int cnum;//댓글번호 pk
	private int cbnum;//게시글 번호 fk
	private String cwriter;//작성자
	private String ccontents;//댓글 내용
	
}
