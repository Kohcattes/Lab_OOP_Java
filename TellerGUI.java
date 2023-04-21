import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TellerGUI implements ActionListener{
    private JButton deposit, withdraw, exit;
    private JFrame fr;
    private JTextField wallet, have;
    private JLabel balance, amount;
    private JPanel panel1, panel2, panel3;
    private Account ac;
    
    public TellerGUI() {
        fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ac = new Account(0, "kuy");
        deposit = new JButton("Deposit"); withdraw = new JButton("Withdraw");
        exit = new JButton("Exit");
        wallet = new JTextField("0");
        balance = new JLabel("Balance"); amount = new JLabel("Amount");
        have = new JTextField(ac.getBalance()+"");
        have.setEnabled(false);
        panel1 = new JPanel(); panel2 = new JPanel(); panel3 = new JPanel();
        
        panel1.setLayout(new GridLayout(1, 2)); panel2.setLayout(new GridLayout(1, 2));
        panel3.setLayout(new FlowLayout());
        
        //event
        deposit.addActionListener(this); withdraw.addActionListener(this);
        exit.addActionListener(this);
        
        panel1.add(balance); panel1.add(have);
        panel2.add(amount); panel2.add(wallet);
        panel3.add(deposit); panel3.add(withdraw); panel3.add(exit);
        
        fr.setLayout(new GridLayout(4, 1));
        fr.add(panel1); fr.add(panel2); fr.add(panel3);
        fr.add(new JPanel());
        
        fr.setSize(250, 200); fr.setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if(Double.parseDouble(wallet.getText())<0){
            wallet.setText("0");
        }
            
        if(ae.getSource().equals(deposit)){
            ac.setBalance(ac.getBalance()+Double.parseDouble(wallet.getText()));
            have.setText(ac.getBalance()+"");
            wallet.setText("");
        }else if(ae.getSource().equals(withdraw)){
            if(ac.getBalance() >= Double.parseDouble(wallet.getText())){
                ac.setBalance(ac.getBalance()-Double.parseDouble(wallet.getText()));
                have.setText(ac.getBalance()+"");
                wallet.setText("");
            }else{
                
            }
        }else if(ae.getSource().equals(exit)){
            fr.dispose();
        }
    }
}
