package control;

import boundary.TenantForm;
import contracts.ITenantControl;
import entity.Tenant;

public class TenantControl implements ITenantControl {

	private Tenant tenant;

	/**
	 * Função responsável por mostrar a boundary
	 * OBS: estática, não precisa de contexto.
	 * {@link SaveProprietaryForm}
	 */
	public static TenantForm showBoundary() {
		return new TenantForm();
	}

	public TenantControl(Tenant tenant) {
		this.tenant = tenant;
	}

	@Override
	public void setName(String name) {
		this.tenant.setName(name);
	}

	@Override
	public void setPhone(String phone) {
		this.tenant.setPhone(phone);
	}

	@Override
	public void cancelTenant() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearTenant() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveTenant() {
		this.tenant.save();
	}

}
