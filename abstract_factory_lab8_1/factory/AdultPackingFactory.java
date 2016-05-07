package abstract_factory_lab8_1.factory;

import abstract_factory_lab8_1.GiftItem;
import abstract_factory_lab8_1.packing.*;
import abstract_factory_lab8_1.packing.impl.AdultsBagPacking;
import abstract_factory_lab8_1.packing.impl.AdultsBoxPacking;
import abstract_factory_lab8_1.packing.impl.AdultsWrapPacking;

/**
 * Created by 984938 on 5/4/2016.
 */
public class AdultPackingFactory extends PackFactory {
    protected ABag createBag() {
        return new AdultsBagPacking();
    }

    protected ABox createBox() {
        return new AdultsBoxPacking();
    }

    protected AWrap createWrap() {
        return new AdultsWrapPacking();
    }

}
