package fun.extract.libraryService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fun.extract.libraryDao.UserDao;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public void  checkUserBF(int user_id, String user_password) {    
		System.out.println("here is userServiceImpl:"+user_id+user_password);
		userDao.checkUserBF(user_id, user_password);
	}

	@Override
	public Map<String, String> loginStatus() {
		return userDao.loginStatus();
	}
}