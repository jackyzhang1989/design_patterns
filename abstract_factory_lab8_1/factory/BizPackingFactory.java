package abstract_factory_lab8_1.factory;

import abstract_factory_lab8_1.packing.ABag;
import abstract_factory_lab8_1.packing.ABox;
import abstract_factory_lab8_1.packing.AWrap;
import abstract_factory_lab8_1.packing.impl.*;

/**
 * Created by 984938 on 5/4/2016.
 */
public class BizPackingFactory extends PackFactory {
    @Override
    protected ABag createBag() {
        return new BizBagPacking();
    }

    @Override
    protected ABox createBox() {
        return new BizBoxPacking();
    }

    @Override
    protected AWrap createWrap() {
        return new BizWrapPacking();
    }
}
