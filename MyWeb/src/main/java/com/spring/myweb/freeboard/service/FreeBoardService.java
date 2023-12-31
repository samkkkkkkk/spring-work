package com.spring.myweb.freeboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.myweb.freeboard.dto.page.Page;
import com.spring.myweb.freeboard.dto.request.FreeModifyDto;
import com.spring.myweb.freeboard.dto.request.FreeRegistRequestDTO;
import com.spring.myweb.freeboard.dto.response.FreeDetailResponseDTO;
import com.spring.myweb.freeboard.dto.response.FreeListResponseDTO;
import com.spring.myweb.freeboard.entity.FreeBoard;
import com.spring.myweb.freeboard.mapper.IFreeBoardMapper;

import lombok.RequiredArgsConstructor;
import oracle.net.aso.p;

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
	public List<FreeListResponseDTO> getList(Page page) {
		List<FreeListResponseDTO> dtoList = new ArrayList<>();
		List<FreeBoard> list = mapper.getList(page);
		for(FreeBoard board : list) {
			dtoList.add(new FreeListResponseDTO(board));
		}
		return dtoList;
	}
	
	@Override
	public int getTotal(Page page) {
		return mapper.getTotal(page);
	}
	
	@Override
	public FreeDetailResponseDTO getContent(int bno) {
		return new FreeDetailResponseDTO(mapper.getContent(bno));
	}

	@Override
	public void update(FreeModifyDto dto) {
		mapper.update(FreeBoard.builder()
								.title(dto.getTitle())
								.content(dto.getContent())
								.bno(dto.getBno())
								.build());
	}
	
	@Override
	public void delete(int bno) {
		mapper.delete(bno);
	}


}
