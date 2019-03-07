package fun.extract.libraryDao;

import java.util.Map;

public interface UserDao {
	void checkUserBF(int user_id, String user_password) ;//抽象方法
	Map<String,String> loginStatus();
}
 