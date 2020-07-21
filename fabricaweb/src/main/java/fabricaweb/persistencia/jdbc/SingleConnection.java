package fabricaweb.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {

	private static String url = "jdbc:postgresql://localhost:5432/fabricaprogramador";
	private static String user = "postgres";
	private static String password = "admin";
	private static Connection conection = null;

	static{
		conectar();
	}
	
	public SingleConnection(){
		
		conectar();
	}
	
	
	public static void conectar() {

		if (conection == null) {
			try {

				Class.forName("org.postgresql.Driver");
				conection = DriverManager.getConnection(url, user, password);
				conection.setAutoCommit(false);
				System.out.println("conectado");

			} catch (Exception e) {

				e.printStackTrace();
			}

		}
	}
	
	public static Connection getConnection(){
		return conection;
	}
	
	 

}
