package entity;

public class CostType extends BaseEntity {

	public String entityName = "Tipo de despesa";
	
	private enums.CostType name;
	
	public void setName(enums.CostType name) {
		this.name = name;
	}
	
	public enums.CostType getName() {
		return this.name;
	}

}
