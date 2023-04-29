package boundary;

import control.CostTypeControl;
import entity.CostType;

public class CostTypeForm {

	public void showForm() {
		// TODO: Exibir formulário para prencher os dados
	}
	
	/**
	 * Recebe dados do formulário e popula no modelo
	 * @return
	 */
	public void populateData() {
		CostType costType = new CostType();

		CostTypeControl cControl = new CostTypeControl(costType);

		cControl.setName("Teste");
		
		cControl.saveCostType();
	}
}
