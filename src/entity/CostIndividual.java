package entity;

import java.text.DateFormat;

public class CostIndividual extends Cost {
	
	public void setCost(Apartment ap, DateFormat dataVencimento, DateFormat dataPagamento, double value) {
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
		this.value = value;

		ap.setCost(this);
	}
}
