
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class MyClockV3 extends JLabel implements  Runnable, MouseListener{
    private int sec = 0, min = 0, hour = 0;
    private boolean stp = false;
    public MyClockV3() {
        this.setFont(new Font("Segoe UI", 0, 18));
        this.addMouseListener(this);
    }
    private synchronized void checkStopTime(){
        while(stp){
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClockV3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    @Override
    public void run() {
        while (true) {
            checkStopTime();
            int i = sec/60;
            int j = (min+i)/60;
            min = (min+i)%60;
            hour = (hour+j)%24;
            sec = sec%60;            
            try {
                String h, m, s;
                if(hour<10){
                    h = "0"+hour;
                }else{
                    h = ""+hour;
                }   if(min<10){
                    m = "0"+min;
                }else{
                    m = ""+min;
                }   if(sec<10){
                    s = "0"+sec;
                }else{
                    s = ""+sec;
                }   this.setText(h+":"+m+":"+s);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
            sec += 1;
        }
    }
    private synchronized void resume(){
        stp = false;
        this.notify();
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(this)){
            if(stp){
                resume();
            }else{
                stp = true;
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
}
