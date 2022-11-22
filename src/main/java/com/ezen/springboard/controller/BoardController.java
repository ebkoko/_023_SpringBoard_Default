package com.ezen.springboard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.springboard.service.board.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	/*
	 * 클라이언트가 이벤트를 발생시키면 요청이 발생되고
	 * 컨트롤러에서 @RequestMapping으로 매핑된 매핑주소와 요청주소가 같으면 해당 메소드를 실행한다. 
	 * 해당 메소드 안에서는 DB접근이 필요할 때는 Service의 메소드를 호출하여
	 * ServiceImple -> DAO -> Mapper까지 실행한다.
	 * DB 접근이 필요 없는 경우는 해당 메소드에서 바로 jsp(화면단)을 리턴한다.
	 * 화면에서 요청발생 -> Controller -> Service -> ServiceImpl -> DAO -> Mapper
	 * DB에서 가져올 데이터가 있을 경우에는 위 순서의 역순으로 진행
	 */
//	@RequestMapping("login.do")
//	public void login() {
//		boardService.login();
//	}
	
	// 게시글 목록 화면으로 이동
	@GetMapping("/getBoardList.do")
	public String getBoardListView() {
		return "board/getBoardList";
	}
	
	// 게시글 목록 가져오는 로직 처리
	
	
	
	
	
	
	
	// 게시글 등록 화면으로 이동
	@GetMapping("insertBoard.do")
	public String insertBoardView() {
		return "board/insertBoard";
	}
}
