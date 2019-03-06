package fun.extract.libraryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fun.extract.libraryDao.User;
import fun.extract.libraryDao.UserDao;
import fun.extract.libraryDao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService {
//	@Autowired
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public Boolean checkUserBF(int user_id, String user_password) {        
		return userDao.checkUserBF(user_id, user_password);
	}
	@Override
	public void syshello() {
		// TODO Auto-generated method stub
		System.out.println("this is syshello() function");
	}

}