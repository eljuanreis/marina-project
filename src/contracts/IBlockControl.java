package contracts;

public interface IBlockControl {
	public void setName(String name);
	public void setNumAp(int number);
	public void cancelBlock();
	public void clearBlock();
	public void saveBlock();
}
