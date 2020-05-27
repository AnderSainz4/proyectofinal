package modelo.dao;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modelo.Conector;
import modelo.bean.generos;
import modelo.bean.comics;
public class ModeloComic extends Conector {
	
	public ArrayList<comics> getAll(){
			ArrayList<comics> comics = new ArrayList<comics>();//Aqui hemos creado el array para poder guardar la informacion
			
			try {
				PreparedStatement pst = super.conexion.prepareStatement("select * from comics inner join generos on generos.id=comics.genero_id");
				ResultSet rs = pst.executeQuery();
				
				while(rs.next()) {
					comics Comics = new comics();
					Comics.setId(rs.getInt("id"));
					Comics.setNombre(rs.getString("nombre"));
					Comics.setTitulo(rs.getString("titulo"));
					Comics.setNum(rs.getInt("num"));
					Comics.setFecha_publicacion(rs.getDate("fecha_publicacion"));
					Comics.setImagen(rs.getString("imagen"));
					Comics.setNum(rs.getInt("num_like"));
					
					generos generos = new generos();
					generos.setNombre(rs.getString("nombre"));
					generos.setId(rs.getInt("id"));
					
					Comics.setGeneros(generos);
					
					Comics.add(Comics);
					
				}
				
				
				
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return comics;
			
			
	}

	public comics get(int idcomics) {
		try {
			PreparedStatement pst = super.conexion.prepareStatement("SELECT * FROM comics inner join generos on generos.id=comics.genero_id where comics.id=?");
			pst.setInt(1, idcomics);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				comics comics = new comics();
				
				comics.setId(rs.getInt("id"));
				comics.setNombre(rs.getString("nombre"));
				comics.setTitulo(rs.getString("titulo"));
				comics.setNum(rs.getInt("num"));
				comics.setFecha_publicacion(rs.getDate("fecha_publicacion"));
				comics.setImagen(rs.getString("imagen"));
				comics.setNum_like(rs.getInt("num_likes"));
				
				generos generos = new generos();
				
				generos.setId(rs.getInt("generos.id"));
				generos.setNombre(rs.getString("generos.nombre"));
				
				comics.setGeneros(generos);
				return comics;
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
}
