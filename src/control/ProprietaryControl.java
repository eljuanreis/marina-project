package control;

import boundary.SaveProprietaryForm;
import contracts.IProprietaryControl;
import entity.Proprietary;

public class ProprietaryControl implements IProprietaryControl {

	private Proprietary proprietary;
	
	/**
	 * Função responsável por mostrar a boundary
	 * OBS: estática, não precisa de contexto.
	 * {@link SaveProprietaryForm}
	 */
	public static SaveProprietaryForm showBoundary() {
		return new SaveProprietaryForm();
	}
	
	/**
	 * Injeção de dependencia no construtor
	 * @param proprietary
	 */
	public ProprietaryControl(Proprietary proprietary) {
		this.proprietary = proprietary;
	}

	@Override
	public void setName(String name) {
		this.proprietary.setNome(name);
	}

	@Override
	public void setPhone(String phone) {
		this.proprietary.setPhone(phone);		
	}

	@Override
	public void setPropInq(boolean is) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveProprietary() {
		this.proprietary.save();
	}

	@Override
	public void clearProprietary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelProprietary() {
		// TODO Auto-generated method stub
		
	}

}
