package fun.extract.libraryService.efile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fun.extract.libraryDao.efile.FileDao;
@Service("fileService")
public class FileServiceImpl implements FileService{
	@Autowired 
	private FileDao fileDao;

	@Override
	public void getFileLink(int file_id) {
		// TODO Auto-generated method stub
		fileDao.getFileLink(file_id);
	}
}
