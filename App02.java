import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class App02 implements ActionListener{
    private JFrame fr;
    private JTextField tf;
    private double jam, kan=1;
    private JButton posi, nega, factor, modulo, num1, num2, num3;
    private JButton num4, num5, num6, num7, num8, num9, num0, del, assoon;
    private JPanel panel;
    
    public App02(){
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
        tf = new JTextField();
        
        //Event
        num1.addActionListener(this); num2.addActionListener(this);
        num3.addActionListener(this); num4.addActionListener(this);
        num5.addActionListener(this); num6.addActionListener(this);
        num7.addActionListener(this); num8.addActionListener(this);
        num9.addActionListener(this); num0.addActionListener(this);
        posi.addActionListener(this); del.addActionListener(this);
        nega.addActionListener(this); assoon.addActionListener(this);
        factor.addActionListener(this); modulo.addActionListener(this);
        
        this.panel.setLayout(new GridLayout(4, 4));
        
        this.panel.add(num7); this.panel.add(num8); this.panel.add(num9); this.panel.add(posi);
        this.panel.add(num4); this.panel.add(num5); this.panel.add(num6); this.panel.add(nega);
        this.panel.add(num1); this.panel.add(num2); this.panel.add(num3); this.panel.add(factor);
        this.panel.add(num0); this.panel.add(del); this.panel.add(assoon); this.panel.add(modulo);
        
        fr.setLayout(new BorderLayout());
        fr.add(tf, BorderLayout.NORTH);
        fr.add(this.panel);
        
        fr.setSize(300, 300); fr.setVisible(true);
    }
    
    public void operation(){
        if(kan == 1){
            jam = jam + Double.parseDouble(tf.getText());
        }else if(kan == 2){
            jam = jam - Double.parseDouble(tf.getText());
        }else if(kan == 3){
            jam = jam * Double.parseDouble(tf.getText());
        }else if(kan == 4){
            jam = jam / Double.parseDouble(tf.getText());
        }
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        
        if(ae.getSource().equals(num1)){
            tf.setText(tf.getText()+"1");
        }else if(ae.getSource().equals(num2)){
            tf.setText(tf.getText()+"2");
        }else if(ae.getSource().equals(num3)){
            tf.setText(tf.getText()+"3");
        }else if(ae.getSource().equals(num4)){
            tf.setText(tf.getText()+"4");
        }else if(ae.getSource().equals(num5)){
            tf.setText(tf.getText()+"5");
        }else if(ae.getSource().equals(num6)){
            tf.setText(tf.getText()+"6");
        }else if(ae.getSource().equals(num7)){
            tf.setText(tf.getText()+"7");
        }else if(ae.getSource().equals(num8)){
            tf.setText(tf.getText()+"8");
        }else if(ae.getSource().equals(num9)){
            tf.setText(tf.getText()+"9");
        }else if(ae.getSource().equals(num0)){
            tf.setText(tf.getText()+"0");
        }else if(ae.getSource().equals(posi)){
            this.operation();
            kan = 1;
            tf.setText("");
        }else if(ae.getSource().equals(assoon)){
            if(tf.getText().equals("")){
                tf.setText(jam+"");
                kan = 1;
            }else{
                this.operation();
                kan = 5;
                tf.setText(jam+"");
            }
        }else if(ae.getSource().equals(nega)){
            this.operation();
            kan = 2;
            tf.setText("");
        }else if(ae.getSource().equals(factor)){
            this.operation();
            kan = 3;
            tf.setText("");
        }else if(ae.getSource().equals(modulo)){
            this.operation();
            kan = 4;
            tf.setText("");
        }else if(ae.getSource().equals(del)){
            if(tf.getText().equals("")){
                jam = 0;
                kan = 1;
            }else{
                tf.setText("");
            }
        }
    }
}