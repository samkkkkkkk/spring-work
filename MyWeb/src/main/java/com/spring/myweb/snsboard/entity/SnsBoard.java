package com.spring.myweb.snsboard.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import lombok.ToString;

import lombok.Setter;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @Setter @ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SnsBoard {
	
	private int bno;
	private String writer;
	private String uploadPath;
	private String fileLoca;
	private String fileName;
	private String fileRealName;
	private String content;
	private LocalDateTime regDate;
	
	
}
