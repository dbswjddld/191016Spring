package www.board;

import java.util.List;

public interface BoardService {
	// 게시글 등록
	void insertBoard(BoardVO vo);
	// 삭제
	void deleteBoard(BoardVO vo);
	// 수정
	void updateBoard(BoardVO vo);
	// 상세조회
	BoardVO getBoard(BoardVO vo);
	// 목록조회
	List<BoardVO> getBoardList(BoardVO vo);
}
