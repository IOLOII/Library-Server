package fun.extract.libraryService;

import fun.extract.libraryDao.User;

public interface UserService {
	Boolean checkUserBF(int user_id, String user_password) ;
	void syshello();
}
