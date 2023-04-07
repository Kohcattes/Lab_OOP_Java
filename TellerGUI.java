import java.awt.*;
import javax.swing.*;

public class TellerGUI {
    private JButton deposit, withdraw, exit;
    private JFrame fr;
    private JTextField wallet;
    private JLabel balance, amount, have;
    private JPanel panel1, panel2, panel3;
    
    public TellerGUI(){
        fr = new JFrame();
        deposit = new JButton("Deposit"); withdraw = new JButton("Withdraw");
        exit = new JButton("Exit");
        wallet = new JTextField();
        balance = new JLabel("Balance"); amount = new JLabel("Amount");
        this.have = new JLabel("6000");
        panel1 = new JPanel(); panel2 = new JPanel(); panel3 = new JPanel();
        
        panel1.setLayout(new GridLayout(1, 2)); panel2.setLayout(new GridLayout(1, 2));
        panel3.setLayout(new FlowLayout());
        
        panel1.add(balance); panel1.add(have);
        panel2.add(amount); panel2.add(wallet);
        panel3.add(deposit); panel3.add(withdraw); panel3.add(exit);
        
        fr.setLayout(new GridLayout(4, 1));
        fr.add(panel1); fr.add(panel2); fr.add(panel3);
        fr.add(new JPanel());
        
        fr.setSize(250, 200); fr.setVisible(true);
        
    }
}
