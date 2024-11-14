import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FailedLogin {
    private JPanel panel2;
    private JButton OKButton;

    public FailedLogin() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(panel2);
                topFrame.dispose();
            }
        });
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Successful Registration");
        frame.setContentPane(new FailedLogin().panel2);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
