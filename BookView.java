
//Show Frame Edit, Delete or Add book

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BookView extends JFrame implements ActionListener, WindowListener{
    private JLabel nametx, pricetx, typetx;
    private JTextField nameFe, priceFe, orderBook;
    private JButton addbtn, updatebtn, deletebtn, backbtn, nextbtn;
    private JComboBox typebox;
    private JPanel panel = new JPanel();
    private String[] listtype = {"General", "Computer", "Math&Sci", "Photo"};
    private int page = 0;
    public static BoxBook box = new BoxBook();
    
    
    public BookView() {
    //Check Own Book
        try (FileInputStream fr = new FileInputStream("BoxBook.dat");
                ObjectInputStream inp = new ObjectInputStream(fr);){
            box = (BoxBook) inp.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setLayout(new BorderLayout());
        nametx = new JLabel("Name");
        pricetx = new JLabel("Price");
        typetx = new JLabel("Type");
        
        
        nameFe = new JTextField();
        priceFe = new JTextField();
        typebox = new JComboBox(listtype);
        
        backbtn = new JButton("<<<");orderBook = new JTextField("0");nextbtn = new JButton(">>>");
        addbtn = new JButton("Add"); updatebtn = new JButton("Update"); deletebtn = new JButton("Delete");
        orderBook.setColumns(5);
        
        //event
        addbtn.addActionListener(this);
        nextbtn.addActionListener(this);
        backbtn.addActionListener(this);
        updatebtn.addActionListener(this);
        deletebtn.addActionListener(this);
        
        panel.setLayout(new GridLayout(3, 2));
        panel.add(nametx);panel.add(nameFe);
        panel.add(pricetx);panel.add(priceFe);
        panel.add(typetx); panel.add(typebox);
        this.add(panel, BorderLayout.CENTER);
        
        JPanel jam = new JPanel();
        jam.add(backbtn); jam.add(orderBook);jam.add(nextbtn);

        
        JPanel jane = new JPanel();
        jane.add(addbtn); jane.add(updatebtn); jane.add(deletebtn);

        JPanel jhone = new JPanel();
        jhone.setLayout(new GridLayout(2, 1));
        jhone.add(jam);jhone.add(jane);
        this.add(jhone, BorderLayout.SOUTH);
        
        this.addWindowListener(this);
        this.setSize(400, 250);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        new BookView();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(addbtn)){
            new BookAdd();
        }else if (e.getSource().equals(nextbtn)){
            page++;
            if(page>box.size()){
                page--;
            }
            nameFe.setText(box.get(page-1).getName());
            priceFe.setText(box.get(page-1).getPrice()+"");
            typebox.setSelectedItem(box.get(page-1).getType());
            orderBook.setText(page+"");
            
        }else if (e.getSource().equals(backbtn)){
            page--;
            if(page < 1){
                page = 1;
            }
            nameFe.setText(box.get(page-1).getName());
            priceFe.setText(box.get(page-1).getPrice()+"");
            typebox.setSelectedItem(box.get(page-1).getType());
            orderBook.setText(page+"");
            
        }else if(e.getSource().equals(updatebtn)){
            Book j = box.get(page-1);
            j.setName(nameFe.getText());
            j.setPrice(Double.parseDouble(priceFe.getText()));
            j.setType(typebox.getSelectedItem()+"");
            JOptionPane.showMessageDialog(null, "Done it.", "Update Command", JOptionPane.PLAIN_MESSAGE);
            //set Text Feild
            nameFe.setText(j.getName());
            priceFe.setText(j.getPrice()+"");
            typebox.setName(j.getType());

        }else if(e.getSource().equals(deletebtn)){
            box.remove(page-1);
            page--;
            if(page < 1){
                page = 1;
            }
            JOptionPane.showMessageDialog(null, "Done it.", "Delete Command", JOptionPane.PLAIN_MESSAGE);
            //set Text Feild
            if (box.isEmpty()){
                nameFe.setText("");
                priceFe.setText("");
                typebox.setSelectedItem("General");
                page = 0;
                orderBook.setText(page+"");
            }else{
                nameFe.setText(box.get(page-1).getName());
                priceFe.setText(box.get(page-1).getPrice()+"");
                typebox.setName(box.get(page-1).getType());
                orderBook.setText(page+"");
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
    //Write File Box to Keep own Book
        try (FileOutputStream fr = new FileOutputStream("BoxBook.dat");
                ObjectOutputStream oOut = new ObjectOutputStream(fr);){
            oOut.writeObject(box);
        } catch (Exception ev) {
            ev.printStackTrace();
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
   }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
    
}
