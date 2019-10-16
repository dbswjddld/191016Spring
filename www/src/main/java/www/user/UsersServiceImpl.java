package www.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("usersService")
public class UsersServiceImpl implements UsersService {

	@Autowired UsersDAO dao;
	
	public void insertUsers(UsersVO vo) {
		dao.insertUser(vo);
	}

	public void updateUsers(UsersVO vo) {
		
	}

	public void deleteUsers(UsersVO vo) {

	}

	public UsersVO getUsers(UsersVO vo) {
		return dao.getUser(vo);
	}

	public List<UsersVO> getUsersList(UsersVO vo) {
		return null;
	}

}
