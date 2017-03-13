package service;

public class File_List {
	private int file_id;
	private String title;
	private String description;
	private String language;
	public File_List() {
		super();
		// TODO Auto-generated constructor stub
	}

	public File_List(int file_id, String title, String description, String language) {
		super();
		this.file_id = file_id;
		this.title = title;
		this.description = description;
		this.language = language;
	}

	public int getFile_id() {
		return file_id;
	}

	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}
