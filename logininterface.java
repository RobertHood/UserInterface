import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

public class logininterface {
    private JTextField username;
    private JButton loginButton;
    private JPasswordField password;
    private JPanel login;

    public logininterface() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    check();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public JPanel getLogin() {
        return login;
    }

    public void check() throws FileNotFoundException, IOException {
        String usn = this.username.getText();
        String pw = this.password.getText();
        boolean res = Account.checklogin(usn, pw);
        if(res){
            JFrame rf = new JFrame();
            rf.setLocation(900,540);
            rf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            rf.setContentPane(new SuccessfulLogin().getPanel2());
            rf.pack();
            rf.setVisible(true);
        }else{
            JFrame wf = new JFrame();
            wf.setLocation(900,540);
            wf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            wf.setContentPane(new FailedLogin().getPanel2());
            wf.pack();
            wf.setVisible(true);
        }
    }

}
