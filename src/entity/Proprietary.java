package entity;

public class Proprietary extends BaseEntity {

	public String entityName = "Proprietário";

	private String name;
	private String phone;
	
	public void setNome(String nome) {
		this.name = nome;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhone() {
		return this.phone;
	}

}
