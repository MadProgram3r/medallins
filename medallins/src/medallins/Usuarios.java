package medallins;

public class Usuarios {
	private String Nombre;
	private String Password;
	
	public boolean comprobar(String nombre, String password) {
		if(this.Nombre == nombre && this.Password == password) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public  String toString() {
		return this.Nombre + " " + this.Password; 
	}
	
	public String getNombre() {
		return this.Nombre;
	}
	
	public String getPassword() {
		return this.Password;
	}
	
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	
	public void setPassword(String password) {
		this.Password = password;
	}

}
