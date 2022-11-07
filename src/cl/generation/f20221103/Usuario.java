package cl.generation.f20221103;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String correo;
	private String clave;
	private String apellido;
	private String nick;
	private ArrayList<String> teléfono;
	private Direccion direccion;// atributo de colaboracion

	public Usuario() {
		super();
		// inicializando un arreglo
		this.teléfono = new ArrayList<String>();
		//this.direccion = new Direccion (); si la inicalizo aqui no será necesario crear la instancia en el main

	}

	public Usuario(String nombre, String correo, String clave, String apellido, String nick, ArrayList<String> teléfono,
			Direccion direccion) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.clave = clave;
		this.apellido = apellido;
		this.nick = nick;
		this.teléfono = teléfono;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public ArrayList<String> getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(ArrayList<String> teléfono) {
		this.teléfono = teléfono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correo=" + correo + ", clave=" + clave + ", apellido=" + apellido
				+ ", nick=" + nick + ", teléfono=" + teléfono + ", direccion=" + direccion + "]";
	}

}
