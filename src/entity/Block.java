package entity;

public class Block extends BaseEntity {

	public String entityName = "Bloco";
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
