package dialog;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestModal extends JDialog {
    private JPanel panel1;
    private JButton OKButton;

    public TestModal(JFrame frame) {
        super(frame);
        setContentPane(panel1);
        setModal(true);
        getRootPane().setDefaultButton(OKButton);

        OKButton.addActionListener(e -> {
            dispose();
        });
    }
}
