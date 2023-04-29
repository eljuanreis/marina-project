package entity;

public abstract class BaseEntity {

	public String entityName;
	
	public void save() {
		System.out.println(String.format("O %s foi salvo com sucesso", this.entityName));
	}
	
	public void delete() {
		System.out.println(String.format("O %s foi deletado com sucesso", this.entityName));
	}
	
	public void clear() {
		System.out.println(String.format("O %s foi limpo com sucesso", this.entityName));
	}
}
