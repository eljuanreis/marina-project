package contracts;

public interface ITenantControl {
	public void setName(String name);
	public void setPhone(String phone);
	public void cancelTenant();
	public void clearTenant();
	public void saveTenant();
}
