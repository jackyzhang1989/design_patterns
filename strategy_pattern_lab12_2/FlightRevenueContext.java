package strategy_pattern_lab12_2;

import java.util.List;

public class FlightRevenueContext {
	private IModel strategy;

	public void setStrategy(IModel strategy) {
		this.strategy = strategy;
	}

	public long getRevenue(List<Flight> flights) {
		return strategy.getRevenue(flights);
	}

}
