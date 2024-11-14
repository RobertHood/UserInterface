import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuccessfulLogin {
    private JPanel panel2;
    private JButton OKButton;

    public SuccessfulLogin() {
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
}
