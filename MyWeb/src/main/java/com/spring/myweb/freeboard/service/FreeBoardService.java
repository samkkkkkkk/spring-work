package com.spring.myweb.freeboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.myweb.freeboard.dto.FreeListResponseDTO;
import com.spring.myweb.freeboard.dto.FreeRegistRequestDTO;
import com.spring.myweb.freeboard.entity.FreeBoard;
import com.spring.myweb.freeboard.mapper.IFreeBoardMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FreeBoardService implements IFreeBoardService {
	
	private final IFreeBoardMapper mapper;
	
	@Override
	public void regist(FreeRegistRequestDTO dto) {
		mapper.regist(FreeBoard.builder()
				.title(dto.getTitle())	
				.writer(dto.getWriter())
				.content(dto.getContent())
				.build());
		
	}

	@Override
	public List<FreeListResponseDTO> getList() {
		List<FreeListResponseDTO> dtoList = new ArrayList<>();
		List<FreeBoard> list = mapper.getList();
		for(FreeBoard board : list) {
			dtoList.add(new FreeListResponseDTO(board));
		}
		return dtoList;
	}

	@Override
	public FreeBoard getContent(int bno) {
		
		return null;
	}

	@Override
	public void update(FreeBoard freeBoard) {

	}

	@Override
	public void delete(int bno) {

	}

}
