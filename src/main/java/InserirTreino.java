import javax.swing.*;
public class InserirTreino extends JFrame {
    private JPanel painelInserir;
    private JComboBox comboBox1;
    private JButton button1;

    public InserirTreino(String title) {
        super(title);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(painelInserir);

    }
    public static void main(String[] args) {
        new InserirTreino("Inserir treino").setVisible(true);
    }
}