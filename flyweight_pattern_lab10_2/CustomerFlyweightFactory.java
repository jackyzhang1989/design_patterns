package flyweight_pattern_lab10_2;

import flyweight_pattern_lab10_2.entity.Image;

public class CustomerFlyweightFactory {
	static CustomerFlyWeight byImg[] = new CustomerFlyWeight[4];

	static {
		byImg[0] = new CustomerFlyWeight(Image.DESMONIS);
		byImg[1] = new CustomerFlyWeight(Image.FIARFIELD);
		byImg[2] = new CustomerFlyWeight(Image.IOWACITY);
		byImg[3] = new CustomerFlyWeight(Image.OTTUMUWA);
	}

	public static CustomerFlyWeight getInstance(Image image) {
		CustomerFlyWeight customerFlyWeight = null;
		if (image.getName().equalsIgnoreCase("DESMONIS")) {
			customerFlyWeight = byImg[0];
		} else if(image.getName().equalsIgnoreCase("FIARFIELD")) {
			customerFlyWeight = byImg[1];
		} else if(image.getName().equalsIgnoreCase("IOWACITY")) {
			customerFlyWeight = byImg[2];
		} else if(image.getName().equalsIgnoreCase("OTTUMUWA")) {
			customerFlyWeight = byImg[3];
		}   
		return customerFlyWeight;
	}

	public static CustomerFlyWeight getInstance(int i) {
		return byImg[i];
	}
}
