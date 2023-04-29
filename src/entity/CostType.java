package entity;

public class CostType extends BaseEntity {

	public String entityName = "Tipo de despesa";
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}
