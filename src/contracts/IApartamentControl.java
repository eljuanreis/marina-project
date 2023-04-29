package contracts;

import entity.Apartment;
import entity.Block;
import entity.Proprietary;
import entity.Tenant;
import enums.OcupationType;

public interface IApartamentControl {
	public Apartment findAp (Block block, int number);
	public void setRoomsSize(int size);
	public void setTypeOcupation(OcupationType type);
	public void setBlock(Block block);
	public Proprietary findProprietary();
	public Tenant findTenant();
	public void cancelAp();
	public void clearAp();
	public void saveAp();
}
