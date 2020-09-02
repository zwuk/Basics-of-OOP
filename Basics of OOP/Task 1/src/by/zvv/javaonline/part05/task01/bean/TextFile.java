package by.zvv.javaonline.part05.task01.bean;

public class TextFile extends File {

	private static final long serialVersionUID = 5878153252243946683L;

	private String fileExtension = ".txt";

	public TextFile(Directory directory, String name) {
		super(directory);
		setName(checkName(name));
	}

	private String checkName(String name) {
		return getFileNameWithoutExtension(name) + fileExtension;
	}

	@Override
	public void rename(String newName) {
		newName = checkName(newName);
		super.rename(newName);
	}

}
