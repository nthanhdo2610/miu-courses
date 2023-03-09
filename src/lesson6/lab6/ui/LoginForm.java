package lesson6.lab6.ui;

import lesson6.lab6.controller.BookingClubController;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {

    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JPanel loginPanel;
    private JButton signInButton;
    private final BookingClubController controller = BookingClubController.INSTANCE;

    public LoginForm() {
        signInButton.addActionListener(e -> {
            String username = txtUsername.getText().trim();
            char[] password = txtPassword.getPassword();
            if(username.isBlank() || password == null){
                controller.error("Id and Password fields must be nonempty");
                return;
            }
            controller.doLogin(username, new String(password));
        });
    }

    public JPanel getContent() {
        return loginPanel;
    }

}
