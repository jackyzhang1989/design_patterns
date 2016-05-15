package state_pattern_lab12_1;

public class GameEngineContext {
	private IDriveState gravelState;
	private IDriveState iceState;
	private IDriveState regularState;
	private IDriveState wetState;

	private IDriveState state = regularState;

	public GameEngineContext() {
		super();
		this.gravelState = new GravelState();
		this.iceState = new IceState();
		this.regularState = new RegularState();
		this.wetState = new WetState();

		this.state = regularState;
	}

	public void left() {
		state.left();
	}

	public void accel() {
		state.accel();
	}

	public void right() {
		state.right();
	}

	public void brake() {
		state.brake();
	}

	public void setState(IDriveState state) {
		this.state = state;
	}

	public IDriveState getGravelState() {
		return gravelState;
	}

	public void setGravelState(IDriveState gravelState) {
		this.gravelState = gravelState;
	}

	public IDriveState getIceState() {
		return iceState;
	}

	public void setIceState(IDriveState iceState) {
		this.iceState = iceState;
	}

	public IDriveState getRegularState() {
		return regularState;
	}

	public void setRegularState(IDriveState regularState) {
		this.regularState = regularState;
	}

	public IDriveState getWetState() {
		return wetState;
	}

	public void setWetState(IDriveState wetState) {
		this.wetState = wetState;
	}

	public IDriveState getState() {
		return state;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nGame, Inc.");

		result.append("\n");
		result.append("Engine is under " + state + "\n");
		return result.toString();
	}

}
