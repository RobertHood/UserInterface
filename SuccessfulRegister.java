import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuccessfulRegister {
    private JPanel panel1;
    private JButton OKButton;

    public SuccessfulRegister() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(panel1);
               topFrame.dispose();
            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Successful Registration");
        frame.setContentPane(new SuccessfulRegister().panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
