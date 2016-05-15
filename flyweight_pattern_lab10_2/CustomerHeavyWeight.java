package flyweight_pattern_lab10_2;

import flyweight_pattern_lab10_2.entity.Address;
import flyweight_pattern_lab10_2.entity.HealthProfile;
import flyweight_pattern_lab10_2.entity.Image;
import flyweight_pattern_lab10_2.entity.Service;

public class CustomerHeavyWeight implements ICustomerFlyweight{
	private int customerId;
	private String firstName;
	private String lastName;
	private Address residenceAddress;
	private HealthProfile profile;
	
	private Image locationMap = null;//intrinsic state
	
	public CustomerHeavyWeight(int customerId, String firstName, String lastName, Address residenceAddress,
			HealthProfile profile, Image locationMap) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.residenceAddress = residenceAddress;
		this.profile = profile;
		this.locationMap = locationMap;
	}

	@Override
	public void serve(Service service, Integer customerId, String firstName, String lastName, Address residenceAddress,
			HealthProfile profile) {
		service.setImage(this.locationMap);
		service.serve(this.customerId, this.firstName, this.lastName, this.residenceAddress, this.profile);
	}

}
