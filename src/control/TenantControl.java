package control;

import boundary.TenantForm;
import contracts.ITenantControl;
import entity.Tenant;

public class TenantControl implements ITenantControl {

	private Tenant tenant;

	/**
	 * Função responsável por mostrar a boundary
	 * OBS: estática, não precisa de contexto.
	 * {@link TenantForm}
	 */
	public static TenantForm showBoundary() {
		return new TenantForm();
	}

	/**
	 * Injeção de dependencia no construtor
	 * @param tenant
	 */
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
		this.tenant.delete();
	}

	@Override
	public void clearTenant() {
		this.tenant.clear();
	}

	@Override
	public void saveTenant() {
		this.tenant.save();
	}

}
