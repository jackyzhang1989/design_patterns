package strategy_pattern_lab12_2;

import java.util.List;

public class MultiClasses implements IModel{

	@Override
	public long getRevenue(List<Flight> flights) {
		// TODO Auto-generated method stub
		long res = 0;
		for (Flight flight : flights) {
			res += flightRevenue(flight);
		}
		return res;
	}
	private long flightRevenue(Flight flight) {
		int fstSize = flight.getSize() / 10;
		int bizSize = flight.getSize() / 5;
		return (long)(fstSize * BASE_TICKET_PRICE * 4) +
				(long)(bizSize * BASE_TICKET_PRICE * 1.5) +
				(long)((flight.getSize() - bizSize - fstSize) * BASE_TICKET_PRICE * 0.75) -
				(long)(BASE_COST * 1.2);
	}

}
