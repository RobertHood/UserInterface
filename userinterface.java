import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class userinterface {
    private JPanel panel;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField mobile;
    private JButton registerButton;
    private JButton loginButton;
    private JPasswordField password;
    private JTextField firstname;

    public void register() {
        String fname = firstname.getText();
        String lname = lastname.getText();
        String eadd = email.getText();
        String usr = username.getText();
        String mpwd = new String(password.getPassword());
        String mob = mobile.getText();

        Account acc = new Account(fname, lname, eadd, usr, mpwd, mob);
        try{
            acc.AddAccount();
        } catch (IOException e) {
        }
    }

    public userinterface() {
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                register();
                JFrame register = showNewWindow("Register Window",850,600);
                register.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                register.setContentPane(new SuccessfulRegister().getPanel1());
                register.pack();
                register.setVisible(true);
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame login = showNewWindow("Login Window",960,540);
                login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                login.setContentPane(new logininterface().getLogin());
                login.pack();
                login.setVisible(true);
            }
        });

    }
    private JFrame showNewWindow(String title, int x, int y){
        JFrame frame = new JFrame(title);
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocation(x,y);
        return frame;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("User Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new userinterface().panel);
        frame.pack();
        frame.setLocation(700,400);
        frame.setVisible(true);
    }
}
