package boundary;

import contracts.IForm;
import control.ApartmentControl;
import entity.Apartment;

public class ApartamentForm implements IForm {
	
	public void showForm() {
		// TODO: Exibir formulário para prencher os dados
	}
	
	/**
	 * Recebe dados do formulário e popula no modelo
	 * @return
	 */
	public void populateData() {
		Apartment ap = new Apartment();

		ApartmentControl apControl = new ApartmentControl(ap);

		apControl.setRoomsSize(2);
		
		apControl.saveAp();
	}

}
