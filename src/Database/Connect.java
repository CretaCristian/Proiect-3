/*Lihat Paul-Sorin*/
package Database;

import Magazin.Uleiuri;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connect {
    public static Connection connect(){
        Connection con = null;
        try{
            Class.forName("org.sqlite.JDBC");
            con=DriverManager.getConnection("jdbc:sqlite:Benzinarie.db");
            System.out.println("Connected");
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return con;
    }
    /*Connection con;
    PreparedStatement ps;
    public void Connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:7882/benzinarie","root","");
            System.out.println("Success");
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
    }*/
}
