package Tipuri;

import Interfaces.Benzina;

import javax.swing.*;
import java.awt.*;

public class Tipuri_Benzina extends Container implements Benzina {
    public JPanel panelBenzina;

    public Tipuri_Benzina(){
        JFrame frame = new JFrame("Benzina");
        frame.setContentPane(panelBenzina);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,450);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public int Standard_95() {
        return 0;
    }

    @Override
    public int Extra_99() {
        return 0;
    }

    @Override
    public int CO95_fara_plumb() {
        return 0;
    }

    @Override
    public int CO98_fara_plumb() {
        return 0;
    }
}
