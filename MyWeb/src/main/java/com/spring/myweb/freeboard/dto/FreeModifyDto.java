package com.spring.myweb.freeboard.dto;

import com.spring.myweb.freeboard.entity.FreeBoard;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class FreeModifyDto {

	private int bno;
	private String writer;
	private String title;
	private String content;
	
}
