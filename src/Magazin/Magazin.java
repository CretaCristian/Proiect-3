/*Lihat Paul-Sorin*/
package Magazin;

import Meniu.Benzinarie;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Magazin extends JFrame{
    private JButton Gustari;
    private JPanel panel1;
    private ImageIcon background;
    private JLabel label;
    private JButton Racoritoare;
    private JButton Uleiuri;
    private JButton INAPOIButton;

    public Magazin() {
        /*background = new ImageIcon(this.getClass().getResource("/shop.jpg"));
        label = new JLabel(background);
        label.setSize(650,450);*/
        JFrame frame = new JFrame("Magazin");
        frame.setContentPane(panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(5,5,650,450);
        frame.setSize(650,450);
        frame.pack();
        frame.setVisible(true);
        INAPOIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Benzinarie ben = new Benzinarie("");
                ben.setVisible(true);
                dispose();
            }
        });
        Uleiuri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Uleiuri ul = new Uleiuri();
                ul.setVisible(true);
                dispose();
            }
        });
        Gustari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Gustari gu = new Gustari();
                gu.setVisible(true);
                dispose();
            }
        });
        Racoritoare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Racoritoare ra = new Racoritoare();
                ra.setVisible(true);
                dispose();
            }
        });
    }
}
