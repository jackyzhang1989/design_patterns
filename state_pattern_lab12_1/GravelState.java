package state_pattern_lab12_1;

public class GravelState implements IDriveState{

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("GravelState. Speed is 3.");
	}

	@Override
	public void accel() {
		// TODO Auto-generated method stub
		System.out.println("GravelState. Speed is 7.");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("GravelState. Speed is 3.");
	}

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("GravelState. Speed is 6.");
	}

}
