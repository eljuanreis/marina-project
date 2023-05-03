package control;

import boundary.CostTypeForm;

import contracts.ICostType;
import entity.CostType;

public class CostTypeControl implements ICostType {

	private CostType costType;
	
	/**
	 * Função responsável por mostrar a boundary
	 * OBS: estática, não precisa de contexto.
	 * {@link CostTypeForm}
	 */
	public static CostTypeForm showBoundary() {
		return new CostTypeForm();
	}

	/**
	 * Injeção de dependencia no construtor
	 * @param costType
	 */
	public CostTypeControl(CostType costType) {
		this.costType = costType;
	}

	@Override
	public void setName(enums.CostType individual) {
		this.costType.setName(individual);
	}

	@Override
	public void saveCostType() {
		this.costType.save();
	}
	

}
