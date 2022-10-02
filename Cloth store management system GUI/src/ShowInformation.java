import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.io.*;

import static java.awt.Adjustable.VERTICAL;

public class ShowInformation extends JFrame {
    private JPanel mainpanel;
    private JButton searchButton;
    private JTextArea displaytxt;
    private JLabel exit;
    private JButton print;

    protected ShowInformation(String title) {
        super(title);
        this.setContentPane(mainpanel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        setBounds(400, 50, 650, 600);

        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("img\\photo-6.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
        Image iconc = Toolkit.getDefaultToolkit().getImage("png\\showinfo.png");
        setIconImage(iconc);

        ImageIcon r1 = new ImageIcon("png\\searchtxt.png");
        searchButton.setIcon(r1);
        searchButton.getIcon();
        ImageIcon r2 = new ImageIcon("png\\exit.png");
        exit.setIcon(r2);
        exit.getIcon();
        ImageIcon r3 = new ImageIcon("png\\print.png");
        print.setIcon(r3);
        print.getIcon();
        displaytxt.setEditable(false);
        JScrollPane scroll = new JScrollPane(displaytxt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scroll);
        displaytxt.add(searchButton);
        displaytxt.add(print);
        displaytxt.add(exit);
        
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                JFileChooser chooser = new JFileChooser("Cloth store txt file");
                chooser.showOpenDialog(null);
                File f = chooser.getSelectedFile();
                String filename = f.getAbsolutePath();
                try {
                    FileReader reader = new FileReader(filename);
                    BufferedReader br = new BufferedReader(reader);
                    displaytxt.read(br, null);
                    br.close();
                    displaytxt.requestFocus();
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, a);

                }
                displaytxt.setEditable(false);

            }
        });
       
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                Mainmenu main = new Mainmenu("");
                main.setVisible(true);
            }
        });
        print.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    boolean complete = displaytxt.print();
                    if (complete) {
                        
                    } else {
                    }
                } catch (PrinterException pe) {
                    
                } 
            }
        });

    }

    public static void main(String[] args) {
       JFrame frame = new ShowInformation("");
       frame.setVisible(true);

    }
}

   

