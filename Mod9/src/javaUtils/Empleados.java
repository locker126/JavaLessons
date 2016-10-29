package javaUtils;

public class Empleados {
	private String _Nombre = "";
	private String _Apellidos = "";
	public Empleados(String wNombre, String wApellido) {
		// TODO Auto-generated constructor stub
		this.set_Nombre(wNombre);
		this.set_Apellidos(wApellido);
	}
	public String get_Nombre() {
		return _Nombre;
	}
	public void set_Nombre(String _Nombre) {
		this._Nombre = _Nombre;
	}
	public String get_Apellidos() {
		return _Apellidos;
	}
	public void set_Apellidos(String _Apellidos) {
		this._Apellidos = _Apellidos;
	}

	@Override
	public String toString(){
		return _Nombre + " " +_Apellidos;
		
	}

}
