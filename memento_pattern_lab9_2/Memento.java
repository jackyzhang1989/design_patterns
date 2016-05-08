package memento_pattern_lab9_2;

public class Memento {
	private ProfileOrigator profileOrigator;

	public ProfileOrigator getProfileOrigator() {
		return profileOrigator;
	}

	public Memento(ProfileOrigator profileOrigator) {
		super();
		this.profileOrigator = profileOrigator;
	}
	
}
