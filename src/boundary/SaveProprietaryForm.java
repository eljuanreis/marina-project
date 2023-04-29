package boundary;

import control.ProprietaryControl;
import entity.Proprietary;

public class SaveProprietaryForm {

	public void showForm() {
		// TODO: Exibir formulário para prencher os dados
	}
	
	/**
	 * Recebe dados do formulário e popula no modelo
	 * @return
	 */
	public void populateData() {
		Proprietary proprietary = new Proprietary();

		ProprietaryControl pControl = new ProprietaryControl(proprietary);

		pControl.setName("Teste");
		pControl.setPhone("11 943414666");
		
		pControl.saveProprietary();
	}

}
