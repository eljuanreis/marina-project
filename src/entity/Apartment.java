package entity;

import enums.OcupationType;

public class Apartment extends BaseEntity {

	public String entityName = "Apartamento";

	// relationship's
	private Block block;
	private Proprietary proprietary;
	private Tenant tenant;
	
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
}
