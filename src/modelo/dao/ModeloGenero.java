package modelo.dao;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Conector;
import modelo.bean.generos;

public class ModeloGenero extends Conector {

	public ArrayList<generos> genero=new ArrayList<generos>();
	
	try {
		Statement st=super.conexion.createStatement();
		ResultSet rs=st.executeQuery("select * from generos");
		
		while(rs.next()) {
			generos generos= new generos();
			generos.setId(rs.getInt("id"));
			generos.setNombre(rs.getString("nombre"));
			generos.add(generos);
			
			
		}
		return generos;
		
	}catch (SQLException e) {
		e.printStackTrace();
	}
	
	return generos;
	
	
	
	
}
}
