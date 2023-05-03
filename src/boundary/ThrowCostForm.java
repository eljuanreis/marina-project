package boundary;

import control.ThrowCostControl;
import entity.CostType;

/**
 * Classe responsável por exibir os formulários individual, building, block
 * @author Juan Reis - Notebook
 *
 */
public class ThrowCostForm {

	public void showForm (CostType cost) {
		if (cost.getName() == enums.CostType.INDIVIDUAL) {
			this.showIndividualForm(cost);
		}
		
		if (cost.getName() == enums.CostType.BUILIDING) {
			this.showBuildingForm(cost);
		}
		
		if (cost.getName() == enums.CostType.BLOCK) {
			this.showBlockForm(cost);
		}
	}
	
	/**
	 * Lançamento pro prédio
	 * @param cost 
	 * @todo formulário de lançamento de custo pro prédio
	 */
	private void showBuildingForm(CostType cost) {
		ThrowCostControl tc = new ThrowCostControl();
		
		// Setando custos pro prédio
		tc.setBuildingCost(null, null, null);
	}
	
	/**
	 * Lançamento por pessoal
	 * @param cost 
	 * @todo formulário de lançamento de custo por apartamento
	 */
	private void showIndividualForm(CostType cost) {
		ThrowCostControl tc = new ThrowCostControl();
		
		// Setando custos pro prédio
		tc.setIndividualCost(null, null, null);
	}
	
	/**
	 * Lançamento por bloco
	 * @param cost 
	 * @todo formulário de lançamento de custo por block
	 */
	private void showBlockForm(CostType cost) {
		ThrowCostControl tc = new ThrowCostControl();
		
		//Setando custos por bloco
		tc.setBlockCost(null, null, null);
	}
}
