package entity;

public class Tenant extends BaseEntity {

	public String entityName = "Inquilino";

	private String name;

	public Tenant(String name) {
		this.name = name;
	}

}
