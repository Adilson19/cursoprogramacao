package entities;

import java.util.Date;

public class Client {
	public String name;
	public String email;
	public Date birthDate;
	
	public Client() {
		
	}
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date birthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
}
