package by.zvv.javaonline.part05.task05.property;

public enum Color {
	RED("красного цвета"), 
	WHITE("белого цвета"), 
	YELLOW("желтого цвета"), 
	PINK("розового цвета"),
	BLUE("голубого цвета"), 
	BURGUNDY("бордового цвета"), 
	VIOLET("фиолетового цвета");

	private String title;

	Color(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
