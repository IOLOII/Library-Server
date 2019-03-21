package fun.extract.libraryDao.efile;


public class File {
	private int file_id;
	private String file_name;
	private String file_link;
	private String file_size;
	public int getFile_id() {
		return file_id;
	}
	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFile_link() {
		return file_link;
	}
	public void setFile_link(String file_link) {
		this.file_link = file_link;
	}
	public String getFile_size() {
		return file_size;
	}
	public void setFile_size(String file_size) {
		this.file_size = file_size;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FileInfo [文件号="+ file_id+"，文件名=" + file_name+"，文件大小=" + file_size +"，文件路径="+ file_link+"]";
	}
	
	
}
