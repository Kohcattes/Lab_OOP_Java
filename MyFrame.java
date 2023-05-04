
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class MyFrame {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
//        MyClock clock = new MyClock();
//        MyClockV2 clock = new MyClockV2();
        MyClockV3 clock = new MyClockV3();
        Thread t = new Thread(clock);
        t.start();
        
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.add(clock);
        fr.pack();
        fr.setVisible(true);
    }
    
}
