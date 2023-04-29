package control;

import boundary.BlockForm;
import contracts.IBlockControl;
import entity.Apartment;
import entity.Block;

public class BlockControl implements IBlockControl {

	private Block block;

	/**
	 * Função responsável por mostrar a boundary
	 * OBS: estática, não precisa de contexto.
	 * {@link BlockForm}
	 */
	public static BlockForm showBoundary() {
		return new BlockForm();
	}
	
	/**
	 * Injeção de dependencia no construtor
	 * @param block
	 */
	public BlockControl(Block block) {
		this.block = block;
	}

	@Override
	public void setName(String name) {
		this.block.setName(name);
	}

	@Override
	public void setNumAp(Apartment ap, int number) {
		this.block.setApartament(ap, number);
	}

	@Override
	public void cancelBlock() {
		this.block.delete();
	}

	@Override
	public void clearBlock() {
		this.block.clear();
	}

	@Override
	public void saveBlock() {
		this.block.save();
	}

}
