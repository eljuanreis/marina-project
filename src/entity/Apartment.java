package entity;

import java.util.ArrayList;

import enums.OcupationType;

public class Apartment extends BaseEntity {

	public String entityName = "Apartamento";

	// relationship's
	private Block block;
	private Proprietary proprietary;
	private Tenant tenant;
	private ArrayList<Cost> costs = new ArrayList<Cost>();

	int numAp;
	int roomsSize;
	
	OcupationType ocupationType;
	
	public Apartment findApByNumber(Block block, int num) {
		return this.block.getApartment(num);
	}
	
	public void setBlock(Block block) {
		this.block = block;
	}
	
	public void setProprietary(Proprietary proprietary) {
		this.proprietary = proprietary;
	}
	
	public void setRoomsSize(int rooms) {
		this.roomsSize = rooms;
	}
	
	public void setOcupationType(OcupationType ocupation) {
		this.ocupationType = ocupation;
	}
	
	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
	
	public Block getBlock() {
		return this.block;
	}
	
	public Proprietary getProprietary() {
		return this.proprietary;
	}
	
	public Tenant getTenant() {
		return this.tenant;
	}
	
	public void setCost(Cost cost) {
		this.costs.add(cost);
	}
	
	public ArrayList<Cost> getCost() {
		return this.costs;
	}
}
