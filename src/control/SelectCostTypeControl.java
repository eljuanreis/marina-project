package control;

import boundary.SelectCostTypeForm;
import boundary.ThrowCostForm;
import contracts.ISelectCostTypeControl;
import entity.CostType;

public class SelectCostTypeControl implements ISelectCostTypeControl {

	private CostType costType;
	
	/**
	 * Função responsável por mostrar a boundary
	 * OBS: estática, não precisa de contexto.
	 * {@link SelectCostTypeControl}
	 */
	public static SelectCostTypeForm showBoundary() {
		return new SelectCostTypeForm();
	}
	
	/**
	 * Injeção de dependencia no construtor
	 * @param costType
	 */
	public SelectCostTypeControl(CostType costType) {
		this.costType = costType;
	}
	
	public void showBoundaryThrowCost() {
		ThrowCostForm form = new ThrowCostForm();
		
		form.showForm(this.costType);
	}

}
