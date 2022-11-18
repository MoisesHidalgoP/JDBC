package DAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.stereotype.Service;

public class empleadosImpl implements empleadosService {
private DataSource dataSource;


public DataSource getDataSource() {
	return dataSource;
}


public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
}


public void insertar(empleados em) {
	Connection conexion=null;
	try {
		conexion = dataSource.getConnection();
		Statement declaracionSQL;
		

		try {

			
			declaracionSQL = conexion.createStatement();
			
			declaracionSQL.execute("INSERT INTO \"public\".\"empleados\" (nombre_empleado) VALUES ('Hidalgo');");
			

			System.out.println("[INFORMACIÓN-consultasPostgreSQL-insertEmpleados] Cierre conexión, declaración y resultado");
			declaracionSQL.close();
			

		} catch (SQLException e) {

			System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
			

		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	
}



}


