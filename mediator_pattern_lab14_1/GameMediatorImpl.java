package mediator_pattern_lab14_1;

public class GameMediatorImpl implements IGameMediator{
	private APosition[][] positions = new APosition[8][8];
	@Override
	public void sendMessage(APosition aPosition) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i != aPosition.x && j != aPosition.y) {
					positions[i][j].receive(aPosition);
				}
			}
		}
	}

}
