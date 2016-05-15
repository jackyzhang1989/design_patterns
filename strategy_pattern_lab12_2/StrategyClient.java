package strategy_pattern_lab12_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrategyClient {
	public static void main(String[] args) {
		Flight flight = new Flight(200);
		Flight flight1 = new Flight(150);
		Flight flight2 = new Flight(250);
		List<Flight> flights = new ArrayList<>(Arrays.asList(flight, flight1, flight2));
		
		FlightRevenueContext flightRevenueContext = new FlightRevenueContext();
		flightRevenueContext.setStrategy(new SinglePrice());
		System.out.println(flightRevenueContext.getRevenue(flights));
		
		flightRevenueContext.setStrategy(new TwoClasses());
		System.out.println(flightRevenueContext.getRevenue(flights));
		
		flightRevenueContext.setStrategy(new MultiClasses());
		System.out.println(flightRevenueContext.getRevenue(flights));
	}
}
