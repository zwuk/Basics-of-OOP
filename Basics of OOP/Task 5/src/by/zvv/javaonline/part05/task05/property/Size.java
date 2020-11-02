package by.zvv.javaonline.part05.task05.property;

public enum Size {
	BIG ("большого размера"), 
	MEDIUM ("среднего размера"), 
	SMALL ("малого размера");
	
	private String title;
	
	Size(String title){
		this.title = title;
	}
	
	@Override
	public String toString() {
		return title;
	}
}
