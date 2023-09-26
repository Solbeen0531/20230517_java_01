package kh.lclass.db1.board.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kh.lclass.db1.board.model.service.BoardService;
import kh.lclass.db1.board.model.vo.BoardVo;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/list")
	public ModelAndView list(
//			RedirectAttributes rttr,
			
			// Controller --> JSP(View) 선택 + 데이터 전달
			// Model model
			ModelAndView mv
			) throws Exception {
		
//		Map<String, Object> map = (Map<String, Object>)rttr.getFlashAttributes();
		
		// Controller --> JSP(View) 데이터 전달
		// model.addAttribute("boardList", boardService.selectList());
		// Controller --> JSP(View) 선택 forward
		// return "board/list";
		
		mv.addObject("boardList", boardService.selectList());
		mv.setViewName("board/list");
		return mv;
	}
	@GetMapping("/get")
	public String get(
			Model model
			// JSP --> Controller 데이터
			// 방법 1 , HttpServletRequest request
			, int bno // 방법 2
			, String a
			) throws Exception {
		// JSP --> Controller 데이터
		// 방법 1 	int bno = Integer.parseInt(request.getParameter("bno"));
		
		
		
		// Controller --> JSP(View) 데이터 전달
		model.addAttribute("boardvo", boardService.selectOne(bno));
		// Controller --> JSP(View) 선택 forward
		return "board/get";
	}
	@GetMapping("/insert")
	public String insert() {
		return "board/insert";
	}
	@GetMapping("/insert")
	public String insertDo(
			RedirectAttributes redirectAttr, // redirect:/url 상황에서 url > jsp 데이터를 전달하기 위해 추가된 자료형
			// 방법 1 HttpServletRequest request
			BoardVo vo
			, String btitle
			) { // 메소드 내부에서 처리함. ExceptionHandler로 가지 않도록 함
		//
		String viewPage = "redirect:/";
		
		// 방법 1
//		String btitle = request.getParameter("btitle");
//		String bcontent = request.getParameter("bcontent");
//		BoardVo vo = new BoardVo();
//		vo.setBcontent(bcontent);
//		vo.setBtitle(btitle);
		System.out.println(vo);
		System.out.println(btitle);
		
		int result;
		try {
// TODO		result = boardService.insert(vo);
			result = 1;
			// 1: 글등록 성공, 0: 글등록 실패
			if (result < 1) {
				redirectAttr.addAttribute("msg2","msg2");
				redirectAttr.addFlashAttribute("msg", "글 등록 실패했습니다. 다시 입력하고 등록해주세요.");
				viewPage = "redirect:/board/insert";
			} else {
				redirectAttr.addAttribute("msg2","msg2");
				redirectAttr.addFlashAttribute("msg", "글 등록 되었습니다.");
				viewPage = "redirect:/board/list";
			}
		} catch (Exception e) {
			e.printStackTrace();
			// 오류 발생 시
			redirectAttr.addAttribute("msg2","msg2");
			redirectAttr.addFlashAttribute("msg", "예기치 못한 상황으로 글 등록에 실패했습니다. 다시 시도해주세요.");
			viewPage = "redirect:/board/list";
		}
		
		// 절대위치 작성하면 된다.
		return viewPage;
	}
	
	@ExceptionHandler
	public void e() {
		
	}
}
