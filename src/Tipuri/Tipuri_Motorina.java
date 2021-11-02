package Tipuri;

import Interfaces.Motorina;
import Meniu.Benzinarie;

import javax.swing.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Tipuri_Motorina extends Container implements Motorina {
    private JPanel motorinaPanel;
    private JButton button1;

    public Tipuri_Motorina(){
        JFrame frame = new JFrame("Motorina");
       frame.setContentPane(motorinaPanel);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(650,450);
       frame.pack();
       frame.setVisible(true);
    }

    @Override
    public int Euro5() {
        return 0;
    }

    @Override
    public int Superioara() {
        return 0;
    }

    @Override
    public int Standard() {
        return 0;
    }

    @Override
    public int Extra() {
        return 0;
    }

    @Override
    public int EuroDiesel() {
        return 0;
    }
}
