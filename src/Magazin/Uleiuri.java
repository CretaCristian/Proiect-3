/*Lihat Paul-Sorin*/
package Magazin;

import Database.Connect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.*;

import Database.Connect;

public class Uleiuri extends JFrame{
    private JTextField textNume;
    private JPanel panel;
    private JTextField textPret;
    private JTextField textCantitate;
    private JButton adaugaInCosButton;
    private JButton renuntaButton;
    private JButton INAPOIButton;
    private JTextField textID;
    PreparedStatement ps = null;
    Connection con=Connect.connect();;
    public Uleiuri()  {
        Connect.connect();
        JFrame frame = new JFrame("Magazin");
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        INAPOIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Magazin mg = new Magazin();
                mg.setVisible(true);
                dispose();
            }
        });
        adaugaInCosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume, pret, cantitate;
                nume = textNume.getText();
                pret = textPret.getText();
                cantitate = textCantitate.getText();
                try{
                    String sql = "INSERT INTO uleiuri(numeprodus,pret,cantitate) VALUES(?,?,?)";
                    ps = con.prepareStatement(sql);
                    ps.setString(1, nume);
                    ps.setString(2, pret);
                    ps.setString(3, cantitate);
                    ps.executeUpdate();
                    textNume.setText("");
                    textPret.setText("");
                    textCantitate.setText("");
                    textNume.requestFocus();
                    JOptionPane.showMessageDialog(null,"Adaugat in cos!");
                }catch (SQLException ex){
                    ex.printStackTrace();
                }
                /*try {
                    ps = con.prepareStatement("insert into uleiuri(nume produs,pret,cantitate)values(?,?,?)");
                    ps.setString(1, nume);
                    ps.setString(2, pret);
                    ps.setString(3, cantitate);
                    ps.executeUpdate();
                    textNume.setText("");
                    textPret.setText("");
                    textCantitate.setText("");
                    textNume.requestFocus();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }*/
            }
        });
        renuntaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume,pret,cantitate;
                nume = textNume.getText();
                pret = textPret.getText();
                cantitate = textCantitate.getText();
                try{
                    String sql = "DELETE FROM uleiuri WHERE nume = ? ";
                    ps = con.prepareStatement(sql);
                    ps.setString(1,nume);
                    ps.setString(2, pret);
                    ps.setString(3,cantitate);
                    textNume.setText("");
                    textPret.setText("");
                    textCantitate.setText("");
                    textNume.requestFocus();
                    JOptionPane.showMessageDialog(null,"Ai renuntat!");
                }catch (SQLException ex){
                    ex.printStackTrace();
                }finally {
                    try {
                        ps.close();
                        con.close();
                    }catch (SQLException e2){
                        e2.printStackTrace();
                    }
                }
            }
        });
    }

}
