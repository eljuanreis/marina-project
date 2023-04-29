package entity;

import java.util.ArrayList;

public class Block extends BaseEntity {

	public String entityName = "Bloco";
	
	private String name;
	private ArrayList<Apartment> apartments = new ArrayList<>();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setApartament(Apartment ap, int number) {
		this.apartments.set(number, ap);
	}
	
	public Apartment getApartment(int number) {
		try {
			return this.apartments.get(number);
		} catch (Exception e) {
			return null;
		}
	}
}
