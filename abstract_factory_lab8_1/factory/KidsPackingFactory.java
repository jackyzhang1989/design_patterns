package abstract_factory_lab8_1.factory;

import abstract_factory_lab8_1.packing.ABag;
import abstract_factory_lab8_1.packing.ABox;
import abstract_factory_lab8_1.packing.AWrap;
import abstract_factory_lab8_1.packing.impl.*;

/**
 * Created by 984938 on 5/4/2016.
 */
public class KidsPackingFactory extends PackFactory {
    @Override
    protected ABag createBag() {
        return new KidsBagPacking();
    }

    @Override
    protected ABox createBox() {
        return new KidsBoxPacking();
    }

    @Override
    protected AWrap createWrap() {
        return new KidsWrapPacking();
    }
}
