package fun.extract.libraryDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao{
	class UserRowMapper implements RowMapper<User>{


		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
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
	public Boolean checkUserBF(int user_id, String user_password) {
//	public User checkUserBF(int id, String password) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from user_library where user_id = ? and user_password = ?";
//			System.out.println(this);
//			System.out.println("-------------------------");
//			UserDAO Userdao = new UserDAO();
//			System.out.println(Userdao.getJdbcTemplate().queryForObject(sql, new Object[] {id,password}, new UserRowMapper()));
			this.getJdbcTemplate().queryForObject(sql, new Object[] {user_id,user_password}, new UserRowMapper());
			Boolean BF = true;
			System.out.println("用户名正确");
			
			return BF;
		}catch (Exception e) {
			Boolean BF = false;
//			System.err.println(e);
			System.out.println("用户名或密码错误");
			return BF;
		}
//		return null;
	}

	@Override
	public void syshello() {
		// TODO Auto-generated method stub
		System.out.println("this is syshello() function");
	}
}
