package modelo.bean;
import java.util.Date;
public class comics {
private int id;
private String nombre;
private String titulo;
private int num;
private Date fecha_publicacion;
private String imagen;
private int num_like;

private generos Generos;

public comics() {
	super();
	// TODO Auto-generated constructor stub
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

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public int getNum() {
	return num;
}

public void setNum(int num) {
	this.num = num;
}

public Date getFecha_publicacion() {
	return fecha_publicacion;
}

public void setFecha_publicacion(Date fecha_publicacion) {
	this.fecha_publicacion = fecha_publicacion;
}

public String getImagen() {
	return imagen;
}

public void setImagen(String imagen) {
	this.imagen = imagen;
}

public int getNum_like() {
	return num_like;
}

public void setNum_like(int num_like) {
	this.num_like = num_like;
}

public generos getGeneros() {
	return Generos;
}

public void setGeneros(generos generos) {
	Generos = generos;
}

public comics(int id, String nombre, String titulo, int num, Date fecha_publicacion, String imagen, int num_like,
		generos generos) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.titulo = titulo;
	this.num = num;
	this.fecha_publicacion = fecha_publicacion;
	this.imagen = imagen;
	this.num_like = num_like;
	Generos = generos;
}

@Override
public String toString() {
	return "comics [id=" + id + ", nombre=" + nombre + ", titulo=" + titulo + ", num=" + num + ", fecha_publicacion="
			+ fecha_publicacion + ", imagen=" + imagen + ", num_like=" + num_like + ", Generos=" + Generos
			+ ", getId()=" + getId() + ", getNombre()=" + getNombre() + ", getTitulo()=" + getTitulo() + ", getNum()="
			+ getNum() + ", getFecha_publicacion()=" + getFecha_publicacion() + ", getImagen()=" + getImagen()
			+ ", getNum_like()=" + getNum_like() + ", getGeneros()=" + getGeneros() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

public void add(comics comics) {
	// TODO Auto-generated method stub
	
}




}
