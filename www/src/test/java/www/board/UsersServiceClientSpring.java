package www.board;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import www.user.UsersService;
import www.user.UsersVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
public class UsersServiceClientSpring {
	@Autowired
	ApplicationContext context;
	
	@Autowired
	UsersService usersService;
	
	@Test
	public void getUserTest() {
		UsersVO vo = new UsersVO();
		vo.setId("test");
		UsersVO resultVO = usersService.getUsers(vo);
		
	}
}