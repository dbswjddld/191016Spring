package www.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UsersServiceClient {
	public static void main(String[] args) {
		AbstractApplicationContext container =
			new GenericXmlApplicationContext("classpath:application-context.xml");
		
		UsersService usersService = container.getBean(UsersService.class);
		//UsersService usersService = (UsersService)container.getBean("usersService");
		
		UsersVO vo = new UsersVO();
		vo.setId("id");
		vo.setPassword("pw");
		vo.setName("anonymous");
		vo.setRole("Users");
		usersService.insertUsers(vo);
	}
}
