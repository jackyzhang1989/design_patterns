package flyweight_pattern_lab10_2;

import flyweight_pattern_lab10_2.entity.Address;
import flyweight_pattern_lab10_2.entity.HealthProfile;
import flyweight_pattern_lab10_2.entity.Image;
import flyweight_pattern_lab10_2.entity.Service;

public class CustomerFlyWeight implements ICustomerFlyweight{
	private Image locationMap;
	
	public CustomerFlyWeight(Image locationMap) {
		super();
		this.locationMap = locationMap;
	}

	@Override
	public void serve(Service service, Integer customerId, String firstName, String lastName, Address residenceAddress,
			HealthProfile profile) {
		service.setImage(this.locationMap);
		service.serve(customerId, firstName, lastName, residenceAddress, profile);
	}

}
