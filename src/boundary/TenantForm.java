package boundary;

import control.TenantControl;
import entity.Tenant;

public class TenantForm {

	public void showForm() {
		// TODO: Exibir formulário para prencher os dados
	}
	
	/**
	 * Recebe dados do formulário e popula no modelo
	 * @return
	 */
	public void populateData() {
		Tenant tenant = new Tenant();

		TenantControl tControl = new TenantControl(tenant);

		tControl.setName("Teste");
		
		tControl.saveTenant();
	}
	
}
