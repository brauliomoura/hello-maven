package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConsutaSimples {
	
	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/sakila?serverTimeZone=UTC";
		String user = "admin";
		String senha = "admin";
		
		Connection conexao = DriverManager.getConnection(url,user,senha);
		
		PreparedStatement stmt = conexao.prepareStatement("select * from Film");
		
		ResultSet rs = stmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("title"));
		}
				
				
	}

}
