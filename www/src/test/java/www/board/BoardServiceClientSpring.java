package www.board;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
public class BoardServiceClientSpring {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	BoardService boardService;
	
	@Test
	public void getBoardTest() {
		BoardVO vo = new BoardVO();
		vo.setSeq(1);
		BoardVO resultVO = boardService.getBoard(vo);
		assertEquals(vo.getSeq(), resultVO.getSeq());	// t/f
		System.out.println(resultVO);
	}
	
	@Test
	public void deleteBoardTest() {
		BoardVO vo = new BoardVO();
		vo.setSeq(2);
		boardService.deleteBoard(vo);
		BoardVO resultVO = boardService.getBoard(vo);
		assertNull(resultVO);	// t/f
		System.out.println(resultVO);
	}
}
