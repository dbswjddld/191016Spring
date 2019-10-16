package www.board;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
		// 1. 스프링 컨테이너 구동
		// 컴포넌트 스캔해서 @service, Repository 지정된 클래스를 객체 생성해서 컨테이너 등록
		AbstractApplicationContext container = 
			new GenericXmlApplicationContext("classpath:application-context.xml");
		
		// 2. BoardService 가져오기
		BoardService boardService = container.getBean(BoardService.class);
			// BoardService.class
			// (BoardService)container.getBean("boardService")
		
		// 3. 등록 테스트
		BoardVO vo = new BoardVO();
		vo.setSeq(4);
		vo.setTitle("test");
		vo.setContent("aaa");
		boardService.insertBoard(vo);
	}
}
