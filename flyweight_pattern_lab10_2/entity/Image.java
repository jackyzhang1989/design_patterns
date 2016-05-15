package flyweight_pattern_lab10_2.entity;

public enum Image {
	FIARFIELD(0,"fiarfield"), DESMONIS(1,"desmonis"), IOWACITY(2,"iowacity"), OTTUMUWA(3,"ottumuwa");
	private int id;
	private String name;
	//others
	
	private Image(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static Image getImageById(int id) {
		if (id == 0) {
			return FIARFIELD;
		} else if (id == 1) {
			return DESMONIS;
		} else if (id == 2) {
			return IOWACITY;
		} else {
			return OTTUMUWA;
		}
	}

	public String getName() {
		return name;
	}
	
	
}
