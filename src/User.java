
public class User {
	int id;
	String nama;
	int pin;
	
	public User(int id, String nama, int pin) {
		this.id=id;
		this.nama=nama;
		this.pin=pin;
		// TODO Auto-generated constructor stub
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(){
		this.id=id;
	}
	
	public String getNama(){
		return nama;
	}
	
	public void setNama(){
		this.nama=nama;
	}
	
	public int getPin(){
		return pin;
	}
	
	public void setPin(){
		this.pin=pin;
	}

}
