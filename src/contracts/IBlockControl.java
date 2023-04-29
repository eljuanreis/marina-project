package contracts;

import entity.Apartment;

public interface IBlockControl {
	public void setName(String name);
	public void setNumAp(Apartment apartment, int number);
	public void cancelBlock();
	public void clearBlock();
	public void saveBlock();
}
