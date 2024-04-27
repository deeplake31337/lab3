package hust.soict.dsai.aims.store;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Store {
	static final int STORE_CAPACITY = 69;
	private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[STORE_CAPACITY];
	private int dvdCount;
	
	public Store() {
		this.dvdCount = 0;
	}
	
	boolean isAvailable(DigitalVideoDisc dvd) {
		for (int i = 0; i < dvdCount; i++) {
			if (itemsInStore[i].equals(dvd)) return true;
		}
		return false;
	}
	
	public void addDVD(DigitalVideoDisc dvd) {
		if (isAvailable(dvd)) {
			System.out.println("DVD already available.");
			return;
		}
		else {
			if (dvdCount == STORE_CAPACITY) {
				System.out.println("Store is full.");
				return;
			}
			else {
				itemsInStore[dvdCount] = dvd;
				dvdCount++;
				System.out.println(dvd.getTitle() + " DVD has been added.");
			}
		}
	}
	
	public void removeDVD(int id) {
		for (int i = 0; i < dvdCount; i++) {
			if (itemsInStore[i].getId() == id) {
				for (int j = i + 1; j < dvdCount; j++) {
					itemsInStore[i] = itemsInStore[j];
					i++;
				}
				dvdCount--;
				System.out.println("DVD has been removed.");
				return;
			}
		}
		System.out.println("DVD not found.");
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		removeDVD(dvd.getId());
	}
}
