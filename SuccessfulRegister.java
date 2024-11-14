import javax.swing.*;

public class SuccessfulRegister {
    private JPanel panel1;

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
