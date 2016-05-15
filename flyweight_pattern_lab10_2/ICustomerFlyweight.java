package flyweight_pattern_lab10_2;

import flyweight_pattern_lab10_2.entity.Address;
import flyweight_pattern_lab10_2.entity.HealthProfile;
import flyweight_pattern_lab10_2.entity.Service;

public interface ICustomerFlyweight {
	public void serve(Service service, Integer customerId, String firstName, String lastName, Address residenceAddress, HealthProfile profile);
}
