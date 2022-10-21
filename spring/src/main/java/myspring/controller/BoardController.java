package myspring.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import myspring.model.Board;
import myspring.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService bs;
	
	// 글작성 폼
	@RequestMapping("boardform.do")
	public String boardform() {
		return "board/boardform";
	}
	
	// 글작성
	@RequestMapping("boardwrite.do")
	public String boardwrite(Board board, Model model) {
		
		int result = bs.insert(board);
		if(result == 1) System.out.println("글 작성 성공");
		
		model.addAttribute("result", result);
		
		return "board/insertresult";
	}
	
	// 글목록
	@RequestMapping("boardlist.do")
	public String boardlist(HttpServletRequest request, Model model) {
		
		int page = 1;		// 현재 페이지 번호
		int limit = 10;		// 한 화면에 출력할 데이터 개수
		
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
		
//		int startRow = (page - 1) * limit + 1;		-> mapper에 page 전달하여 처리하고 있음
//		int endRow = page * limit;
		
		int listcount = bs.getCount();	// 총 데이터 개수
		System.out.println("listcount: "+listcount);
		
		List<Board> boardlist = bs.getBoardList(page);		// 게시판 목록
		System.out.println("boardlist: "+boardlist);
		
		//총 페이지
		int pageCount = listcount / limit + ((listcount%limit == 0) ? 0 : 1);
		
		int startPage = ((page - 1) / 10) * limit + 1;		// 1, 11, 21 ..
		int endPage = startPage + 10 - 1;					// 10, 20, 30 ..
		
		if(endPage > pageCount) endPage = pageCount;		// 실제 존재하는 페이지를 마지막 페이지로 설정
		
		model.addAttribute("page", page);
		model.addAttribute("listcount", listcount);
		model.addAttribute("boardlist", boardlist);		// forEach의 items으로 출력
		model.addAttribute("pageCount", pageCount);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		
		return "board/boardlist";
	}
	
	
	// 상세 페이지 : 조회수 1 증가 + 상세 정보 구하기
	@RequestMapping("boardcontent.do")
	public String boardcontent(int no, int page, Model model) {	// boardlist.jsp에서 전달한 값 받음
																
		bs.updateconut(no);					// 조회수 1 증가
		Board board = bs.getBoard(no);		// 상세 정보 구하기
		String content = board.getContent().replace("\n", "<br>");
		
		model.addAttribute("board", board);	// dto 객체 전달 -> ${board.필드명}
		model.addAttribute("content", content);
		model.addAttribute("page", page);	// 저장된 값이 String, int 둘 다 괜찮음 상관없음
	
		return "board/boardcontent";
	}
	
	// 수정 폼
	@RequestMapping("boardupdateform.do")
	public String boardupdateform(int no, int page, Model model) {
		
		Board board = bs.getBoard(no);		// 상세 정보 구하기
		
		model.addAttribute("board", board);
		model.addAttribute("page", page);
		
		return "board/boardupdateform";
	}
	
	// 글 수정
	@RequestMapping("boardupdate.do")
	public String boardupdate(Board board, int page, Model model) {
						// boardupdateform.jsp에서 태그의 name 값이 dto 클래스 property와 똑같으면 @ModelAttribute 생략해도 됨
						// dto 객체 새로 생성하여 name 값이 같은 property에 value 값 저장
		
		int result = 0;
		Board old = bs.getBoard(board.getNo());		// 
		
		// 비번 비교
		if(old.getPasswd().equals(board.getPasswd())) {			// 비번 일치 시
		// DB에 저장되어있던 비번	  /   사용자가 폼에서 새로 입력한 비번
			result = bs.update(board);				// 글 수정 메소드에 board 전달
		}else {													// 비번 불일치 시
			result = -1;
		}
		
		model.addAttribute("result", result);
		model.addAttribute("board", board);		// 상세 페이지로 갈 때 no 값 꺼내 사용함
		model.addAttribute("page", page);		// 상세 페이지로 갈 때, 목록 페이지로 돌아갈 때 사용함
		
		return "board/updateresult";
	}
	
	// 글 삭제 폼
	@RequestMapping("boarddeleteform.do")
	public String boarddeleteform() {		// 매개변수로 값을 가져가지 않아도 param으로 불러올 수 있음
		return "board/boarddeleteform";
	}
	
	// 글 삭제
	@RequestMapping("boarddelete.do")
	public String boarddelete(Board board, int page, Model model) {
							// boarddeleteform.jsp에서 전달된 값 받음
							// no와 passwd는 board 객체로 한번에 받음 ->  @ModelAttribute 생략
		
		int result = 0;
		Board old = bs.getBoard(board.getNo());		// 상세 정보 구하기
		
		// 비번 비교
		if(old.getPasswd().equals(board.getPasswd())) {		// 비번 일치 시
			result = bs.delete(board.getNo());		// 글 삭제
		}else {												// 비번 불일치 시
			result = -1;
		}
		model.addAttribute("result", result);
		model.addAttribute("page", page);		// 글 삭제 후 목록 페이지로 돌아가기 위해
		
		return "board/deleteresult";
	}
	

}
