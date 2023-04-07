import java.awt.*;
import javax.swing.*;


public class CalculatorTwoGUI {
    private JFrame fr;
    private JButton posi, nega, factor, modulo, num1, num2, num3;
    private JButton num4, num5, num6, num7, num8, num9, num0, del, assoon;
    private JPanel panel;
    
    public CalculatorTwoGUI(){
        this.fr = new JFrame("calculator");
        this.fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        posi = new JButton("+"); del = new JButton("c");
        nega = new JButton("-"); assoon = new JButton("=");
        factor = new JButton("x");
        modulo = new JButton("/");
        num1 = new JButton("1"); num5 = new JButton("5");
        num2 = new JButton("2"); num6 = new JButton("6");
        num3 = new JButton("3"); num7 = new JButton("7");
        num4 = new JButton("4"); num8 = new JButton("8");
        num9 = new JButton("9"); num0 = new JButton("0");
        this.panel = new JPanel();
        
        this.panel.setLayout(new GridLayout(4, 4));
        
        this.panel.add(num7); this.panel.add(num8); this.panel.add(num9); this.panel.add(posi);
        this.panel.add(num4); this.panel.add(num5); this.panel.add(num6); this.panel.add(nega);
        this.panel.add(num1); this.panel.add(num2); this.panel.add(num3); this.panel.add(factor);
        this.panel.add(num0); this.panel.add(del); this.panel.add(assoon); this.panel.add(modulo);
        
        fr.setLayout(new BorderLayout());
        fr.add(new JTextField(), BorderLayout.NORTH);
        fr.add(this.panel);
        
        fr.setSize(300, 300); fr.setVisible(true);
    }
}
