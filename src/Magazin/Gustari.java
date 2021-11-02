/*Lihat Paul-Sorin*/
package Magazin;

import Database.Connect;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Gustari extends JFrame{
    private JButton adaugaInCosButton;
    private JButton renuntaButton;
    private JTextField textNume;
    private JTextField textPret;
    private JTextField textBucati;
    private JButton INAPOIButton;
    private JPanel panel2;
    PreparedStatement ps = null;
    Connection con=Connect.connect();
    public Gustari() {
        Connect.connect();
        JFrame frame = new JFrame("Magazin");
        frame.setContentPane(panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,450);
        frame.pack();
        frame.setVisible(true);
        adaugaInCosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume, pret, bucati;
                nume = textNume.getText();
                pret = textPret.getText();
                bucati = textBucati.getText();
                try{
                    String sql = "INSERT INTO snacks(nume,pret,bucati) VALUES(?,?,?)";
                    ps = con.prepareStatement(sql);
                    ps.setString(1, nume);
                    ps.setString(2, pret);
                    ps.setString(3, bucati);
                    ps.executeUpdate();
                    textNume.setText("");
                    textPret.setText("");
                    textBucati.setText("");
                    textNume.requestFocus();
                    JOptionPane.showMessageDialog(null,"Adaugat in cos!");
                }catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
        });
        renuntaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume,pret,bucati;
                nume = textNume.getText();
                pret = textPret.getText();
                bucati = textBucati.getText();
                try{
                    String sql = "DELETE FROM snacks WHERE nume = ? ";
                    ps = con.prepareStatement(sql);
                    ps.setString(1,nume);
                    ps.setString(2, pret);
                    ps.setString(3,bucati);
                    textNume.setText("");
                    textPret.setText("");
                    textBucati.setText("");
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
        INAPOIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Magazin mg = new Magazin();
                mg.setVisible(true);
                dispose();
            }
        });
    }
}
