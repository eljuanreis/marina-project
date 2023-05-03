package contracts;

import java.text.DateFormat;

import entity.Apartment;

public interface IThrowCostControl {

	public void setBuildingCost(Apartment[] aps, DateFormat dataVencimento, DateFormat dataPagamento);
	public void setBlockCost(Apartment[] aps, DateFormat dataVencimento, DateFormat dataPagamento);
	public void setIndividualCost(Apartment ap, DateFormat dataVencimento, DateFormat dataPagamento);
}
