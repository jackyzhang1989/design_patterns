package strategy_pattern_lab12_2;

import java.util.List;

public interface IModel {
	public final int BASE_TICKET_PRICE = 300;
	public final int BASE_COST = 50000;
	long getRevenue(List<Flight> flights);
}
