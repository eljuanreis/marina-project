package boundary;

import control.SelectCostTypeControl;
import entity.CostType;

/**
 * Classe responsável por selecionar o tipo de custo ( individual, building, block )
 * @author Juan Reis - Notebook
 *
 */
public class SelectCostTypeForm {
	
	public void showForm () {
		
	}
	
	public void actionClickOnCost() {
		CostType cost = new CostType();

		SelectCostTypeControl sct = new SelectCostTypeControl(cost);
		
		// Mostra a boundary do tipo de custo específico
		sct.showBoundaryThrowCost();
	}

}
