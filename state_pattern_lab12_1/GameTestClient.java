package state_pattern_lab12_1;

public class GameTestClient {
	public static void main(String[] args) {
		GameEngineContext gameEngineContext = new GameEngineContext();
		gameEngineContext.accel();
		gameEngineContext.left();
		gameEngineContext.right();
		gameEngineContext.brake();
		
		gameEngineContext.setState(gameEngineContext.getGravelState());
		gameEngineContext.accel();
		gameEngineContext.left();
		gameEngineContext.right();
		gameEngineContext.brake();	
		
		gameEngineContext.setState(gameEngineContext.getIceState());
		gameEngineContext.accel();
		gameEngineContext.left();
		gameEngineContext.right();
		gameEngineContext.brake();	
		
		gameEngineContext.setState(gameEngineContext.getWetState());
		gameEngineContext.accel();
		gameEngineContext.left();
		gameEngineContext.right();
		gameEngineContext.brake();		
	}
}
