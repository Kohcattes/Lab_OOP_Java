import java.awt.*;
import javax.swing.*;

public class MDIFromGUI {
    private JFrame fr;
    private JDesktopPane mdi;
    private JInternalFrame win1, win2, win3;
    private JMenuBar mb;
    private JMenu fi, ed, vi, ne;
    private JMenuItem win, mes, op, sa, ex;
    
    public MDIFromGUI(){
        fr = new JFrame("SubMenuItemDemo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);try { 
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch(Exception e){
            e.printStackTrace();
        }
        SwingUtilities.invokeLater( () -> {fr = new JFrame("SubMenuItemDemo");});
      
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mdi = new JDesktopPane();
        
        win1 = new JInternalFrame("Application 01", true, true, true, true);
        win2 = new JInternalFrame("Application 02", true, true, true, true);
        win3 = new JInternalFrame("Application 03", true, true, true, true);
        
        win1.setVisible(true); win1.add(new JPanel()); win1.setSize(250, 200);
        win2.setVisible(true); win2.add(new JPanel()); win2.setSize(250, 200);
        win3.setVisible(true); win3.add(new JPanel()); win3.setSize(250, 250);
        
        mb = new JMenuBar();
        fi = new JMenu("File");
        ed = new JMenu("Edit");
        vi = new JMenu("View");
        ne = new JMenu("New");
        
        win = new JMenuItem("Window");
        mes = new JMenuItem("Message");
        op = new JMenuItem("Open");
        sa = new JMenuItem("Save");
        ex = new JMenuItem("Exit");
        
        int x2 = win1.getX() + win3.getWidth()*2 + 10;
        int y2 = win1.getY();
        
        int x3 = win1.getX()+ win1.getWidth()+ 5;
        int y3 = win1.getY()+win1.getHeight();
        
        win2.setLocation(x2, y2); win3.setLocation(x3, y3);
        
        mdi.add(win1); mdi.add(win2); mdi.add(win3);
        
        fr.setJMenuBar(mb); 
        mb.add(fi); mb.add(ed); mb.add(vi);
        fi.add(ne); fi.addSeparator(); fi.add(op); fi.addSeparator();
        fi.add(sa); fi.addSeparator(); fi.add(ex);
        ne.add(win); ne.addSeparator(); ne.add(mes);
        fr.add(mdi, BorderLayout.CENTER);
        
        fr.setMinimumSize(new Dimension(300, 300));
        fr.setSize(win2.getX()+win2.getWidth()+20, win3.getHeight()+win3.getY()+30);
        fr.setVisible(true);
        fr.setExtendedState(fr.MAXIMIZED_BOTH);
    }
}
