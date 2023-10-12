package com.spring.myweb.freeboard.service;

import java.util.List;

import com.spring.myweb.freeboard.dto.FreeDetailResponseDTO;
import com.spring.myweb.freeboard.dto.FreeListResponseDTO;
import com.spring.myweb.freeboard.dto.FreeModifyDto;
import com.spring.myweb.freeboard.dto.FreeRegistRequestDTO;
import com.spring.myweb.freeboard.entity.FreeBoard;

public interface IFreeBoardService {
	
	//글 등록
		void regist(FreeRegistRequestDTO freeBoard);
		
		//글 목록
		List<FreeListResponseDTO> getList();
		
		//상세보기
		FreeDetailResponseDTO getContent(int bno);
		
		//수정
		void update(FreeModifyDto freeBoard);
		
		//삭제
		void delete(int bno);
	
}
