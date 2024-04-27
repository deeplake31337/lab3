package hust.soict.dsai.test.cart;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class CartTest {
	public static void main(String[] args) {
		Store anOrder = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
				"Animation", "Roger Allers", 87, 19.95f);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
				"Science Fiction", "George Lucas", 87, 24.95f);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
				"Animation", 18.99f);
		/*anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd1, dvd2);
		anOrder.searchDigitalVideoDisc(0);
		anOrder.searchDigitalVideoDisc(3);
		anOrder.searchDigitalVideoDisc("lion,wars");*/
		anOrder.addDVD(dvd2);
		anOrder.addDVD(dvd3);
		anOrder.addDVD(dvd2);
		anOrder.addDVD(dvd1);
		anOrder.addDVD(dvd1);
		anOrder.addDVD(dvd2);
		
		anOrder.removeDVD(3);
		anOrder.removeDVD(dvd2);
	}
}
