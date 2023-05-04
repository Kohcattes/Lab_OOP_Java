

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Poring extends JFrame implements MouseListener, Runnable{
    private JLabel picPoring;

    public Poring(){
        picPoring = new JLabel();
        picPoring.setIcon(new ImageIcon("C:\\Users\\ASUS TUF GAMiNG\\Pictures\\personal\\PoringNoi.png"));
        this.add(picPoring);
        picPoring.addMouseListener(this);
        
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.setSize(250, 200);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(picPoring)){
            this.dispose();
            PoringConstructor.nPoring -= 1;
        }
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    @Override
    public void run() {
        while (true){
            this.picPoring.setText(PoringConstructor.nPoring+"");
        }
    }


    
}
