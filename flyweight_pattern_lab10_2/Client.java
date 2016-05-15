package flyweight_pattern_lab10_2;

import java.util.Random;

import flyweight_pattern_lab10_2.entity.Address;
import flyweight_pattern_lab10_2.entity.HealthProfile;
import flyweight_pattern_lab10_2.entity.Image;
import flyweight_pattern_lab10_2.entity.Service;

public class Client {
	static Random random = new Random();
	public static void main(String[] arg) {
		// Flyweight sample
		Service service = new Service();
		for (int i = 0; i < 10000; ++i) {
			Image location = getRandomLocation();
			CustomerFlyWeight customerFlyWeight = CustomerFlyweightFactory.getInstance(location);
			customerFlyWeight.serve(service, 1, "fName", "Lname", new Address(), new HealthProfile());
		}
		// Heavyweight sample
		for (int i = 0; i < 10000; ++i) {
			Image location = getRandomLocation();
			CustomerHeavyWeight customerHeavyWeight = new CustomerHeavyWeight(1, "fName", "Lname", new Address(), new HealthProfile(),
					location);
			customerHeavyWeight.serve(service, null, null, null, null, null);
		}
	}

	private static Image getRandomLocation() {
		int nextInt = random.nextInt(4);
		return Image.getImageById(nextInt);
	}
}
