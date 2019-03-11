package fun.extract.libraryDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
@Repository("userDao")
public class UserDaoImpl extends JdbcDaoSupport implements UserDao{
	
//	String BF2;
//	public String getBF2() {
//		return BF2;
//	}
//
//	public void setBF2(String bF2) {
//		BF2 = bF2;
//	}

	class UserRowMapper implements RowMapper<User>{
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setUser_id(rs.getInt("user_id"));
			user.setUser_name(rs.getString("user_name"));
			user.setUser_institute(rs.getString("user_institute"));
			user.setUser_class(rs.getString("user_class"));
			user.setUser_grade(rs.getInt("user_grade"));
			user.setUser_password(rs.getString("user_password"));
			
			return user;
		}	
	}
	Map<String, String> statusmap = new HashMap();
	public void checkUserBF(int user_id, String user_password) {
		
		System.out.println("here is userDaoImpl:"+user_id+user_password);
		try {
			String sql = "select * from user_library where user_id = ? and user_password = ?";
			this.getJdbcTemplate().queryForObject(sql, new Object[] {user_id,user_password}, new UserRowMapper());
//			Boolean BF = true;
//			this.setBF2("TRUE");		
			statusmap.put("BF", "登录成功");
//			System.out.println("登录成功");			
//			return BF;
		}catch (Exception e) {
//			Boolean BF = false;
//			this.setBF2("FALSE");
			statusmap.put("BF", "登录失败");
//			System.out.println("用户名或密码错误");
//			return BF;
		}		
	}
	public Map<String, String> loginStatus(){
		return statusmap;
	}
}
