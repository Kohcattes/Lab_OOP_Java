
import java.awt.Font;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class MyClock extends JLabel implements  Runnable{

    public MyClock() {
        this.setFont(new Font("Segoe UI", 0, 18));
    }
    
    @Override
    public void run() {
        while (true) {            
            try {
                Calendar d = Calendar.getInstance();
                int sec = d.get(Calendar.SECOND);
                int min = d.get(Calendar.MINUTE);
                int hour = d.get(Calendar.HOUR_OF_DAY);
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
                }   
                this.setText(h+":"+m+":"+s);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
