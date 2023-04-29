package contracts;

import entity.Apartment;
import entity.Block;

public interface IBlockControl {
	public void setName(Block block, String name);
	public void setNumAp(Apartment ap, int number);
	public void cancelBlock(Block block);
	public void clearBlock(Block block);
	public void saveBlock(Block block);
}
