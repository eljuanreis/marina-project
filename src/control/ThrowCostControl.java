package control;

import java.text.DateFormat;

import contracts.IThrowCostControl;
import entity.Apartment;
import entity.CostGroup;
import entity.CostIndividual;

public class ThrowCostControl implements IThrowCostControl {
	
	public void setBuildingCost(Apartment[] aps, DateFormat dataVencimento, DateFormat dataPagamento) {
		CostGroup cg = new CostGroup();
		cg.setCostType(enums.CostType.BUILIDING);
		cg.setCost(aps, null, null, 200);
	}
	
	public void setBlockCost(Apartment[] aps, DateFormat dataVencimento, DateFormat dataPagamento) {
		CostGroup cg = new CostGroup();
		cg.setCostType(enums.CostType.BLOCK);
		cg.setCost(aps, null, null, 200);
	}
	
	public void setIndividualCost(Apartment ap, DateFormat dataVencimento, DateFormat dataPagamento) {
		CostIndividual cg = new CostIndividual();
		cg.setCostType(enums.CostType.INDIVIDUAL);
		cg.setCost(ap, null, null, 200);
	}
	
}
