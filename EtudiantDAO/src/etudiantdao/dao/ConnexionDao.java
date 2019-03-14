package etudiantdao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ConnexionDao est la classe correspondant à la connexion à la base de données
 * 
 * @author maxime
 */

public class ConnexionDao {
	public Connection connect = null;
	public Statement statement = null;

	public Statement getConnection() {
		String url = "jdbc:mysql://localhost/etudiantdao";
		String login = "root";
		String passwd = "";
		
		try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                Connection connect = DriverManager
                        .getConnection("jdbc:mysql://localhost/etudiantdao?user=root&password=");
                 statement = connect.createStatement();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                System.out.println("Erreur 1");
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("Erreur 2");
        }

        return statement;
    }

    public void closeConnection() {
        try {
            connect.close();
            statement.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}