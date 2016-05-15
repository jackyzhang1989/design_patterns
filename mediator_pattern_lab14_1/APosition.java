package mediator_pattern_lab14_1;

public abstract class APosition {
	protected IGameMediator gameMediator;
	protected PositionType positionType;
	protected int x;
	protected int y;
	
	public APosition(IGameMediator gameMediator, PositionType positionType, int x, int y) {
		super();
		this.gameMediator = gameMediator;
		this.positionType = positionType;
		this.x = x;
		this.y = y;
	}

	public abstract void send();
	public abstract void receive(APosition position);	
}
