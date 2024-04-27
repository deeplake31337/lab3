package hust.soict.dsai.aims.cart;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBER_ORDERED = 20;
	private int qtyOrdered = 0;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBER_ORDERED) {
			System.out.println("The cart is full");
			return;
		}
		else if (qtyOrdered < 20) {
			for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
				if (itemsOrdered[i] == null) {
					itemsOrdered[i] = disc;
					System.out.println("The disc \"" + disc.getTitle() + "\" has been added!");
					break;
				}
			}
			qtyOrdered++;
		}
		else if (qtyOrdered == MAX_NUMBER_ORDERED - 1) {
			System.out.println("The cart is almost full");
		}
		
		if (qtyOrdered == MAX_NUMBER_ORDERED) {
			System.out.println("The cart is full");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}
	
	/*public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for(DigitalVideoDisc dvd: dvdList) addDigitalVideoDisc(dvd);
	}*/
	
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		for(DigitalVideoDisc dvd: dvdList) addDigitalVideoDisc(dvd);
	}
	
	public void showDiscs(DigitalVideoDisc dvds[], int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(i+1);
			System.out.print(". ");
			System.out.println(dvds[i].toString());
		}
	}

	public void showCart() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		showDiscs(itemsOrdered, qtyOrdered);
		System.out.println("Total cost: " + totalCost());
		System.out.println("**************************************************");
	}
	
	public void searchDigitalVideoDisc(int id) {
		DigitalVideoDisc foundDVD;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId() == id) {
				foundDVD = itemsOrdered[i];
				System.out.println("DVD found: " + foundDVD.toString() +" .");
				return;
			}
		}
		System.out.println("DVD not found.");
	}
	
	public void searchDigitalVideoDisc(String title) {
		DigitalVideoDisc foundDVDs[] = new DigitalVideoDisc[qtyOrdered];
		int count = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].isMatch(title)) {
				foundDVDs[count] = itemsOrdered[i];
				count++;
			}
		}
		if (count == 0) System.out.println("Dvd not found.");
		else {
			System.out.println("Dvd found: ");
			showDiscs(foundDVDs, count);
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered > 0) {
			for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
				if (itemsOrdered[i] == disc) {
					itemsOrdered[i] = null;
					System.out.println("The disc was removed!");
					break;
				}
			}
			qtyOrdered--;
		}
		else System.out.println("The cart is empty!");
	}
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < MAX_NUMBER_ORDERED; i++) {
			if (itemsOrdered[i] != null) total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
}