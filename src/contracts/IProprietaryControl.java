package contracts;

public interface IProprietaryControl {
	public void setName(String name);
	public void setPhone(String phone);
	public void setPropInq(boolean is);
	public void saveProprietary();
	public void clearProprietary();
	public void cancelProprietary();
}
