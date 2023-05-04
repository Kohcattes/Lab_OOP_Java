
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class MyClockV2 extends JLabel implements  Runnable{
    int sec = 0, min = 0, hour = 0;
    public MyClockV2() {
        this.setFont(new Font("Segoe UI", 0, 18));
    }
    
    @Override
    public void run() {
        while (true) {
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
    
}
