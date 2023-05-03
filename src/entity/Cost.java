package entity;

import java.text.DateFormat;
import java.util.ArrayList;

public abstract class Cost {
	CostType type;
	double value;
	boolean pago;
	DateFormat dataVencimento, dataPagamento;
	
	public void setCostType(enums.CostType type) {
		CostType costType = new CostType();
		costType.setName(type);

		this.type = costType;
	}
		
	public ArrayList<Cost> getCost(Apartment ap) {
		return ap.getCost();
	}
}
