package fun.extract.libraryDao.efile;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
@Repository("fileDao")
public class FileDaoImpl extends JdbcDaoSupport implements FileDao{
	class FileRowMapper implements RowMapper<File>{

		@Override
		public File mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			File file = new File();
			file.setFile_id(rs.getInt("file_id"));
			file.setFile_name(rs.getString("file_name"));
			file.setFile_size(rs.getString("file_size"));
			file.setFile_link(rs.getString("file_link"));
			
			return file;
		}
		
	}
	static String src;
	@Override
	public void getFileLink(int file_id) {
		// TODO Auto-generated method stub
		String sql = "select * from file where file_id = ?";
//		this.getJdbcTemplate().queryForObject(sql,new Object[] {file_id} ,new FileRowMapper()).toString();
//		System.out.println(this.getJdbcTemplate().queryForObject(sql,new Object[] {file_id} ,new FileRowMapper()).toString());
		src = this.getJdbcTemplate().queryForObject(sql,new Object[] {file_id} ,new FileRowMapper()).getFile_link();
		System.out.println(src);
	}
	public void testReturnValue() {
		// TODO Auto-generated method stub
		System.out.println(src);
	}
}
