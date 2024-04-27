package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 86, 19.95f);
		//anOrder.addDigitalVideoDisc(dvd1);
		//System.out.println(dvd1.getId());
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 86, 24.95f);
		//anOrder.addDigitalVideoDisc(dvd2);
		//System.out.println(dvd2.getId());
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", 18.99f);
		//System.out.println(dvd3.getId());
		//anOrder.addDigitalVideoDisc(dvd3);
		//DigitalVideoDisc [] dvdList = {dvd1, dvd2, dvd1, dvd3};
		anOrder.addDigitalVideoDisc(dvd1, dvd2, dvd3, dvd1);
		anOrder.showCart();
		//anOrder.addDigitalVideoDisc(dvd1, dvd2);
		//System.out.println("Total cost: " + anOrder.totalCost());
	}
}