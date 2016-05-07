package abstract_factory_lab8_1.factory;

import abstract_factory_lab8_1.Contants;
import abstract_factory_lab8_1.GiftItem;
import abstract_factory_lab8_1.packing.ABag;
import abstract_factory_lab8_1.packing.ABox;
import abstract_factory_lab8_1.packing.AWrap;
import abstract_factory_lab8_1.packing.Packaging;

public abstract class PackFactory {
	public final Packaging createPacking(GiftItem giftItem){
		if (giftItem.getPackagingType().equalsIgnoreCase(Contants.BAG)) {
			return createBag();
		} else if (giftItem.getPackagingType().equalsIgnoreCase(Contants.BOX)) {
			return createBox();
		} else {
			return createWrap();
		}
	}
	protected abstract ABag createBag();
	protected abstract ABox createBox();
	protected abstract AWrap createWrap();
}
