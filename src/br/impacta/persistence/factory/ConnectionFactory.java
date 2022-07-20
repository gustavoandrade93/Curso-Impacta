package br.impacta.persistence.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	//private static String USERNAME = "root";
	//private static String PASSWORD = "root";
	
	private static String USERNAME = "uubamkszjxdst0rz";
	private static String PASSWORD = "AXkZZoyTu9xa7q4oXz5P";
	
	
	//private static String DATABASE_URL = "jdbc:mysql://localhost:3306/cadastro_programadores?useTimezone=true&serverTimezone=UTC";
	
	private static String DATABASE_URL = "jdbc:mysql://bv7f8jlrckcxtvgvsnzu-mysql.services.clever-cloud.com:3306/bv7f8jlrckcxtvgvsnzu?useTimezone=true&serverTimezone=UTC";
	
	public static Connection criaConexaoComMySql() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
		
		return connection;
	}
}
