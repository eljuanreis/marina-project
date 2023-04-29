package control;

import boundary.CostTypeForm;
import contracts.ICostType;
import entity.CostType;

public class CostTypeControl implements ICostType {

	private CostType costType;
	
	/**
	 * Função responsável por mostrar a boundary
	 * OBS: estática, não precisa de contexto.
	 * {@link SaveProprietaryForm}
	 */
	public static CostTypeForm showBoundary() {
		return new CostTypeForm();
	}

	public CostTypeControl(CostType costType) {
		this.costType = costType;
	}

	@Override
	public void setName(String name) {
		this.costType.setName(name);
	}

	@Override
	public void saveCostType() {
		this.costType.save();
	}
	

}
