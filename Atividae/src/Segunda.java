import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Segunda {
	public static void main(String[] args) {
		Statement stml = null;
		
		Connection conn = Conexao.getConexaoMySQL();
		
		
		try {
			stml = (Statement) conn.createStatement();
			ResultSet real = null;
			real = stml.executeQuery("SELECT * FROM clientes");
			System.out.println("id     nome     email");
			
			while (real.next()) {
				System.out.println(real.getInt("id") + "     " +real.getString("nome") + "     " + real.getString("email")
			
			);
				
			}
			real.close();
			stml.close();
			conn.close();
		
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	
}
