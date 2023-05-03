package entity;

import java.text.DateFormat;

public class CostGroup extends Cost {
	
	public void setCost(Apartment[] aps, DateFormat dataVencimento, DateFormat dataPagamento, double value) {
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.value = value;
		
		for (Apartment ap : aps) {
			ap.setCost(this);
		}
	}
}
