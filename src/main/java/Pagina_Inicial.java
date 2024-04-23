import javax.swing.*;
import java.awt.*;

public class Pagina_Inicial extends JFrame{
    private JPanel painelPrincipal;
    private JLabel labelNomeClube;
    private JLabel labelLogo;
    private JButton buttonMenu;
    private JLabel labelSaldo;

    public Pagina_Inicial(String title) {
        super(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelPrincipal);
        pack();
    }
    public static void main(String[] args) {
        new Pagina_Inicial("Rumo ao Estrelato!!!").setVisible(true);
    }

}
