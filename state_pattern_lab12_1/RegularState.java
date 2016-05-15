package state_pattern_lab12_1;

public class RegularState implements IDriveState{

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("RegularState. Speed is 5.");
	}

	@Override
	public void accel() {
		// TODO Auto-generated method stub
		System.out.println("RegularState. Speed is 9.");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("RegularState. Speed is 5.");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("RegularState. Speed is 8.");
	}

}
