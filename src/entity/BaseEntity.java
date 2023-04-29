package entity;

public abstract class BaseEntity {

	public String entityName;
	
	public void save() {
		System.out.println(String.format("O %s foi salvo com sucesso", this.entityName));
	}
}
