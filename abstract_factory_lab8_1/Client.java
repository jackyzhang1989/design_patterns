package abstract_factory_lab8_1;

import abstract_factory_lab8_1.factory.AdultPackingFactory;
import abstract_factory_lab8_1.factory.BizPackingFactory;
import abstract_factory_lab8_1.factory.KidsPackingFactory;
import abstract_factory_lab8_1.factory.PackFactory;
import abstract_factory_lab8_1.packing.Packaging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
	private PackFactory packingFactory;

	public Client(GiftPack giftPack) {
		if (giftPack.getPackType().equalsIgnoreCase(Contants.ADULTS)) {
			packingFactory = new AdultPackingFactory();
		} else if (giftPack.getPackType().equalsIgnoreCase(Contants.BUSINESS)) {
			packingFactory = new BizPackingFactory();
		} else {
			packingFactory = new KidsPackingFactory();
		}
	}

	public static void printInstruction() {
		printTitle();
		System.out.println("Bag Merchant Collection	$0.50 Reusable Shopper $0.00 Micky		$0.25");
		System.out.println("Box Hard Plastic		$1.00 Plain	Paper      $0.25 Cartoon	$0.50");
		System.out.println("Wrap Holiday Surprise	$0.25 Everyday Value   $0.00 Happy Kid	$0.10");
	}

	private static void printTitle() {
		System.out.println("    " + "Business 				  Adults 				 Kids");
	}

	public PackFactory getPackFactory() {
		return packingFactory;
	}

	public static void main(String[] args) {
		// print Instruction
		printInstruction();

		GiftPack giftPack = new GiftPack(Contants.ADULTS);
		Client client = new Client(giftPack);

		PackFactory wf = client.getPackFactory();
		if (wf == null) {
			System.out.println("This type is not being supported.");
			return;
		}

		//new gift Items
		GiftItem giftItem = new GiftItem(Contants.BAG);
		GiftItem giftItem1 = new GiftItem(Contants.BOX);
		GiftItem giftItem2 = new GiftItem(Contants.WRAP);
		List<GiftItem> giftItems = new ArrayList<>(Arrays.asList(giftItem, giftItem1, giftItem2));
		giftPack.setGiftItems(giftItems);

		//set packing for every gift item
		for (GiftItem g : giftItems) {
			g.setPackaging(wf.createPacking(g));
		}

		// the total packaging cost
		float sum = 0;
		for (GiftItem g : giftItems) {
			sum += g.getPackaging().getCost();
		}
		System.out.println("the total packaging cost is: " + sum);
	}
}
