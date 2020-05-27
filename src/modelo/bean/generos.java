package modelo.bean;

public class generos {
private int id;
private String nombre;
public generos() {
	super();
	// Aqui definimos los atriburos del genero
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public generos(int id, String nombre) {
	super();
	this.id = id;
	this.nombre = nombre;
}
@Override
public String toString() {
	return "generos [id=" + id + ", nombre=" + nombre + ", getId()=" + getId() + ", getNombre()=" + getNombre()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}


}
