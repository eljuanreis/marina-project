package boundary;

import contracts.IForm;
import control.BlockControl;

import entity.Block;

public class BlockForm implements IForm {
	public void showForm() {
		// TODO: Exibir formulário para prencher os dados
	}
	
	/**
	 * Recebe dados do formulário e popula no modelo
	 * @return
	 */
	public void populateData() {
		Block block = new Block();

		BlockControl bControl = new BlockControl(block);

		bControl.setName("Teste");
		
		bControl.saveBlock();
	}
}
