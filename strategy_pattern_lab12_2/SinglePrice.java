package strategy_pattern_lab12_2;

import java.util.List;

public class SinglePrice implements IModel{

	@Override
	public long getRevenue(List<Flight> flights) {
		long res = 0;
		for (Flight flight : flights) {
			res += (flight.getSize() * BASE_TICKET_PRICE - BASE_COST);
		}
		return res;
	}

}
