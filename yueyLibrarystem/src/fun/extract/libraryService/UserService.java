package fun.extract.libraryService;

import java.util.Map;

public interface UserService {
	void  checkUserBF(int user_id, String user_password) ;
	Map<String,String> loginStatus();
}
