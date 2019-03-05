package fun.extract.libraryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import fun.extract.libraryDao.UserDao;
import fun.extract.libraryDao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService {
//UserDao userDAO = new UserDaoImpl();
	@Autowired
	@Qualifier("userDao")
	private UserDao userDao;


//	public void setUserDao(UserDao userDao) {
//	      this.userDao = userDao;
//	      }
//	public void getUserDao(UserDao userDao) {
//	      this.userDao = userDao;
//	      }
	
	
	@Override
	public Boolean checkUserBF(int user_id, String user_password) {
        
		return userDao.checkUserBF(user_id, user_password) ;
	}

}
