package control;

import boundary.ApartamentForm;

import contracts.IApartamentControl;
import entity.Apartment;
import entity.Block;
import entity.Proprietary;
import entity.Tenant;
import enums.OcupationType;

public class ApartmentControl implements IApartamentControl {

	private Apartment apartment;
	
	/**
	 * Função responsável por mostrar a boundary
	 * OBS: estática, não precisa de contexto.
	 * {@link SaveProprietaryForm}
	 */
	public static ApartamentForm showBoundary() {
		return new ApartamentForm();
	}

	public ApartmentControl(Apartment apartment) {
		this.apartment = apartment;
	}

	@Override
	public Apartment findAp(Block block, int number) {
		// TODO Buscar apartamento por bloco e numero
		return null;
	}

	@Override
	public void setRoomsSize(int size) {
		this.apartment.setRoomsSize(size);;
	}

	@Override
	public void setTypeOcupation(OcupationType type) {
		this.apartment.setOcupationType(type);
	}

	@Override
	public void setBlock(Block block) {
		this.apartment.setBlock(block);
	}

	@Override
	public Proprietary findProprietary() {
		return this.apartment.getProprietary();
	}

	@Override
	public Tenant findTenant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelAp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearAp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveAp() {
		this.apartment.save();
	}

}
