import javax.swing.*;

public class GridLayoutManagerIntelliJ {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextArea textArea1;
    private JComboBox comboBox1;
    private JTextField textField5;
    private JButton submitButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Register");
        frame.setContentPane(new GridLayoutManagerIntelliJ().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
