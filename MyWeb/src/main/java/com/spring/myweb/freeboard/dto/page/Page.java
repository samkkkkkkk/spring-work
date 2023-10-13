package com.spring.myweb.freeboard.dto.page;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@AllArgsConstructor
@Builder
public class Page {
	
	private int pageNo; // 클라이언트가 보낸 페이지 번호
	private int amount; // 한 페이지에 보여진 게시물 수
	
	//검색 요청에 필요한 필드를 추가
	private String keyword;
	private String condition;
	
	public Page() {
		/*
		 처음 게시판에 들어갔을 때는 사용자가 
		 페이지 넘버를 줄 수 없기 때문에
		 기본 생성자에 기본 값을 준다.
		 - 값이 들어오지 않는 다면 이 값들이 들어가게 한다.
		 */
		
		this.pageNo = 1;
		this.amount = 10;
	}
	
	public void setPageNo(int pageNo) {
		if(pageNo < 1 || pageNo > Integer.MAX_VALUE) {
			this.pageNo = 1;
			return;
		}
		this.pageNo = pageNo;
	}
	
	public void setAmount(int amount) {
		if(amount < 10 || amount > 30 || (amount % 10) != 0) {
			this.amount = 10;
			return;
		}
		this.amount = amount;
	}
	
	/*
	 /freeboard/freeList?page=3&amount=10
	 으로 요청이 들어오면 파라미터 값을
	 page class로 받을 것이다. 
	 */
	
	public int getPageStart() {
		/*
		 pageNo: 1 -> return 0
		 pageNo: 2 -> return 10
		 pageNo: 3 -> return 30
		 pageNo: 4 -> return 40
		 */
		return (pageNo-1) * amount;
	}
	
	public int getPageEnd() {
		return pageNo * amount;
	}
	
	
	
}

















