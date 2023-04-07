import javax.swing.*;
import java.awt.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JButton posi, nega, factor, modulo;
    private JPanel panel;
    
    public CalculatorOneGUI(){
        this.fr = new JFrame("calculator");
        this.fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        posi = new JButton("+");
        nega = new JButton("-");
        factor = new JButton("x");
        modulo = new JButton("/");
        this.panel = new JPanel();
        
        this.panel.setLayout(new FlowLayout());
        
        this.panel.add(posi); this.panel.add(nega);
        this.panel.add(factor); this.panel.add(modulo);
        
        fr.setLayout(new GridLayout(4, 1));
        fr.add(new JTextField()); fr.add(new JTextField());
        fr.add(this.panel); fr.add(new JTextField());
        
        fr.setSize(400, 200); fr.setVisible(true);
    }
    
}
