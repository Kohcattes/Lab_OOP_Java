
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ChatDemo implements ActionListener, WindowListener{
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    private JFrame fr = new JFrame();
    private JTextArea ta = new JTextArea();
    private JTextField tf = new JTextField();
    private JButton summit = new JButton("Submit"), reset = new JButton("Reset");
    private JPanel topPanel = new JPanel(), bottomPanel = new JPanel();

    public ChatDemo() {
        fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
        
        
        ta.setSize(45, 20);
        try (FileReader yesterday = new FileReader("ChatDemo.dat");){
            int cha;
            while ((cha = yesterday.read()) != -1){
                ta.setText(ta.getText()+(char)cha);
            }
            
        } catch (Exception e) {
        }
        
        topPanel.add(summit);topPanel.add(reset);
        
        //event
        summit.addActionListener(this);
        reset.addActionListener(this);
        fr.addWindowListener(this);
        
        bottomPanel.setLayout(new GridLayout(2, 1));
        bottomPanel.add(tf); bottomPanel.add(topPanel);
        
        fr.setLayout(new BorderLayout());
        fr.add(ta, BorderLayout.CENTER); fr.add(bottomPanel, BorderLayout.SOUTH);
        
        fr.setSize(400, 500);
        fr.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ob){
        if (ob.getSource().equals(summit)){
            ta.setText(ta.getText()+"\n"+dtf.format(LocalDateTime.now())+" : "+tf.getText());
            tf.setText("");
        }else if (ob.getSource().equals(reset)){
            ta.setText("");
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
        try (FileWriter mail = new FileWriter("ChatDemo.dat")){
            mail.write(ta.getText());
            System.out.println("JJJ");
        } catch (Exception ep) {
            System.out.println("Hi");
        }
    }
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    
    
    
}
