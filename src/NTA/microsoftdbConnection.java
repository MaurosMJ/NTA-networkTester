/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NTA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 320167484
 */
public class microsoftdbConnection {
    
        public void databaseM (String url, String usr, String pwd){

        try {
            // Carrega explicitamente o driver JDBC do SQL Server
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Estabelece a conexão com o banco de dados
            Connection conexao = DriverManager.getConnection(url, usr, pwd);
            System.out.println("Database connection established successfully!");
            conexao.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Unable to connect to the database.");
            e.printStackTrace();
        }
            
        }
}
