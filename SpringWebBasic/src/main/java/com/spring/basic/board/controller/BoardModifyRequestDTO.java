package com.spring.basic.board.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardModifyRequestDTO {
	
	private int boardNo;
	private String writer;
	private String title;
	private String content;
	
}
