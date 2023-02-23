import dialog.TestModal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class GridLayoutManagerIntelliJ extends JFrame {
    private JPanel panel1;
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField userAccountField;
    private JTextField passwordField;
    private JTextArea addressField;
    private JComboBox sexComboBox;
    private JTextField phoneNumberField;
    private JButton submitButton;

    public GridLayoutManagerIntelliJ() {
        firstNameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                String value = e.getText();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText().trim();
                String lastName = lastNameField.getText().trim();
                String userAccount = userAccountField.getText().trim();
                String pwd = passwordField.getText().trim();
                String address = addressField.getText().trim();
                String sex = Objects.requireNonNull(sexComboBox.getSelectedItem()).toString();
                String pn = phoneNumberField.getText().trim();

                if (firstName.length() == 0) {
                    return;
                }

                if (lastName.length() == 0) {
                    return;
                }

                if (userAccount.length() == 0) {
                    return;
                }

                if (pwd.length() == 0) {
                    return;
                }

                if (address.length() == 0) {
                    return;
                }

                if (pn.length() == 0) {
                    return;
                }

                TestModal testModal = new TestModal(GridLayoutManagerIntelliJ.this);
                testModal.pack();
                testModal.setTitle("Confirm");
                testModal.setVisible(true);

                firstNameField.setText("");
                lastNameField.setText("");
                userAccountField.setText("");
                passwordField.setText("");
                phoneNumberField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Register");
        frame.setContentPane(new GridLayoutManagerIntelliJ().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
