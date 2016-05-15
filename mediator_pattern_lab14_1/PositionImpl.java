package mediator_pattern_lab14_1;

public class PositionImpl extends APosition {
	public PositionImpl(IGameMediator gameMediator, PositionType positionType, int x, int y) {
		super(gameMediator, positionType, x, y);
	}

	@Override
	public void send() {
		gameMediator.sendMessage(this);
	}

	@Override
	public void receive(APosition position) {
		if (this.positionType != PositionType.EMPTY && matchGameRule(position, this)) {
			reverseType(this);
		}
	}

	private void reverseType(PositionImpl positionImpl) {
		if (this.positionType == PositionType.RED) {
			this.positionType = PositionType.BLACK;
		} else {
			this.positionType = PositionType.RED;
		}
	}

	private boolean matchGameRule(APosition position, PositionImpl positionImpl) {
		//TODO add game logic
		return true;
	}
}
