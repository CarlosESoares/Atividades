import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
public static Connection getConexaoMySQL() {
	Connection connection = null;
	// driver de conexão
	String driverName = "com.mysql.cj.jdbc.Driver";
	try {
	Class.forName(driverName);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		System.out.println("O driver especificado não foi encontrado");
	}
	String serverName = "localhost:3306";
	String mydatabase = "teste";
	String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
	
	String username = "root";
	
	String password = "Aluno";
	
	try {
		connection = DriverManager.getConnection(url, username, password);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("não foi possivel se conectar");
	}
	
	
	
	return connection;
}
}