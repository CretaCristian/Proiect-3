import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Plata {
    private JPanel plataPanel;
    private JButton confirmaButton;
    private JLabel factura;
    String jdbcUrl="jdbc:sqlite:/C:\\Users\\Cristian\\Desktop\\sqllite\\sqlite-tools-win32-x86-3360000";//aici pui locatia unde ai tu sqlite-tools-win32-x86-3360000


    public Plata() {
        JFrame frame = new JFrame("Factura");
        frame.setContentPane(plataPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.pack();
        frame.setVisible(true);

        try
        {
            Connection connection= DriverManager.getConnection(jdbcUrl);
            String sql="Select";
            Statement statement=connection.createStatement();
            ResultSet result= statement.executeQuery(sql);
            while(result.next()){
                String nume= result.getString("nume");
                String pret= result.getString("pret");
                String bucati=result.getString("bucati");
                factura.setText("produsul:"+nume+"\npretul de: "+pret+"\n cu "+ bucati+"bucati\n");
            }
        }
        catch(SQLException e){
            System.out.println("A aparut o eroare la conectarea la baza de date");
            e.printStackTrace();
        }
        confirmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Comanda a fost inregistrata, multumim pentru ca ne-ati ales");
                frame.setVisible(false);
            }
        });
    }
}
