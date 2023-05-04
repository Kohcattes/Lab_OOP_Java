
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class PoringConstructor extends JFrame implements ActionListener{
    private JButton addPoring = new JButton("Add");
    public static int nPoring = 0;

    public PoringConstructor(){
        addPoring.addActionListener(this);
        this.add(addPoring);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(addPoring)){
            new Thread(new Poring()).start();
            nPoring+=1;
        }
    }
    
}
