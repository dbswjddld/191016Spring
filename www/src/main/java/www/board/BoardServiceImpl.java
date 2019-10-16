package www.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	
	@Autowired BoardDAO dao; // => factory.getBean()
	// boardDAO를 Repository 설정해야 Autowired쓸 수 있다.
	
	
	public void insertBoard(BoardVO vo) {
		dao.insertBoard(vo);
	}

	public void deleteBoard(BoardVO vo) {
		dao.deleteBoard(vo);
	}

	public void updateBoard(BoardVO vo) {
		dao.updateBoard(vo);
	}

	public BoardVO getBoard(BoardVO vo) {
		return dao.getBoard(vo);
	}

	public List<BoardVO> getBoardList(BoardVO vo) {
		return dao.getBoardList(vo);
	}

}
