package memento_pattern_lab9_2;

import java.io.Serializable;

public class ProfileOrigator implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String ssn;

	public ProfileOrigator(String id, String name, String ssn) {
		super();
		this.id = id;
		this.name = name;
		this.ssn = ssn;
	}

	public ProfileOrigator() {
	}

	public Memento saveStateToMemento() {
		return new Memento(this);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSsn() {
		return ssn;
	}

	@Override
	public ProfileOrigator clone() {
		ProfileOrigator profileOrigator = new ProfileOrigator();
		profileOrigator.id = this.id;
		profileOrigator.name = this.name;
		profileOrigator.ssn = this.ssn;
		return profileOrigator;
	}
}
