import javax.swing.*;
import java.awt.*;

public class ViewAccount {
    private JPanel panel1;

    public ViewAccount() {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Register");
        frame.setContentPane(new ViewAccount().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
