package abstract_factory_lab8_1;

import abstract_factory_lab8_1.packing.Packaging;

public class GiftItem {
	private String giftId;
	private String giftName;
	private String description;
	private String packagingType; // "bag", "box", or "wrap".
	private Packaging packaging;
	// ��

	public GiftItem(String packagingType) {
		this.packagingType = packagingType;
	}

	public void setPackaging(Packaging packaging) {
		this.packaging = packaging;
	}

	public Packaging getPackaging() {
		return packaging;
	}

	public String getPackagingType() {
		return packagingType;
	}
}
