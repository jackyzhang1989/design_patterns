package state_pattern_lab12_1;

public interface IDriveState {
//	Regular Gravel Wet Ice
//	 left 5 3 4 1
//	 accel 9 7 9 3
//	 right 5 3 4 1
//	 brake 8 6 7 2
	public void left();
	public void accel();
	public void right();
	public void brake();
}
