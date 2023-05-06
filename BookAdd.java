//Add New Book to Box in BookView

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BookAdd extends JFrame implements ActionListener{
    private JPanel panel = new JPanel();
    private JLabel nametx, pricetx, typetx;
    private JTextField nameFe, priceFe;
    private String[] listtype = {"General", "Computer", "Math&Sci", "Photo"};
    private JComboBox typebox = new JComboBox(listtype);
    private JButton insertbtn = new JButton("Insert");

    public BookAdd() {
        this.setLayout(new BorderLayout());
        nametx = new JLabel("Name");
        pricetx = new JLabel("Price");
        typetx = new JLabel("Type");
        
        nameFe = new JTextField();
        priceFe = new JTextField();
        
        //event
        insertbtn.addActionListener(this);
        
        panel.setLayout(new GridLayout(3, 2));
        panel.add(nametx);panel.add(nameFe);
        panel.add(pricetx);panel.add(priceFe);
        panel.add(typetx); panel.add(typebox);
        this.add(panel, BorderLayout.CENTER);
        
        JPanel jam = new JPanel();
        jam.add(insertbtn);
        this.add(jam, BorderLayout.SOUTH);
        
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setSize(400, 200);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(insertbtn)){
            Book b = new Book(nameFe.getText(), Double.parseDouble(priceFe.getText()), typebox.getSelectedItem()+"");
            BookView.box.add(b);this.dispose();//Close Frame
            //Notification User "Done it."
            JOptionPane.showMessageDialog(null, "Done it.", "", JOptionPane.PLAIN_MESSAGE);
            
        }
    }
    
    
}
