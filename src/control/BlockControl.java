package control;

import boundary.BlockForm;
import contracts.IBlockControl;
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
	
	public BlockControl(Block block) {
		this.block = block;
	}

	@Override
	public void setName(String name) {
		this.block.setName(name);
	}

	@Override
	public void setNumAp(int number) {
		// TODO: fazer num ap
	}

	@Override
	public void cancelBlock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearBlock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveBlock() {
		this.block.save();
	}

}
