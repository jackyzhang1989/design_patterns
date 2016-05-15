package state_pattern_lab12_1;

public class WetState implements IDriveState{

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("WetState. Speed is 4.");
	}

	@Override
	public void accel() {
		// TODO Auto-generated method stub
		System.out.println("WetState. Speed is 9.");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("WetState. Speed is 4.");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("WetState. Speed is 7.");
	}

}
