package fun.extract.libraryDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

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
	public String retnFileSrc(String file_name,String file_link) {
		// TODO Auto-generated method stub
		
		return null;
	}
}
