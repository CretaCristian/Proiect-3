import Database.Connect;
import Meniu.Benzinarie;
import Tipuri.Tipuri_Benzina;
import Tipuri.Tipuri_Motorina;

import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new Benzinarie("Benzinarie");
        JFrame frame1 = new JFrame();
        frame.setSize(650,450);
        frame.setVisible(true);
        System.out.println("main");

    }
}
