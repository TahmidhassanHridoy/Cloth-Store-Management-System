import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.RandomAccessFile;

public class UtilityBills extends JFrame {
    private JPanel mainpanel;
    private JComboBox electricitymonth;
    private JComboBox internetmonth;
    private JComboBox shoprentmonth;
    private JComboBox electricityyear;
    private JComboBox internetyear;
    private JComboBox shoprentyear;
    private JTextField electricitytextField1;
    private JTextField internettextField2;
    private JTextField shoprenttextField3;
    private JButton CALCULATEButton;
    private JTextField totalCostTextField;
    private JTextArea costtextArea1;
    private JButton clearButton;
    private JComboBox DATEComboBox;
    private JComboBox month;
    private JComboBox year;
    private JLabel exit;
    private JLabel display;

    public UtilityBills(String title) {
        super(title);
        this.setContentPane(mainpanel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        setBounds(350, 180, 750, 380);
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("img\\photo-3.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
        Image iconc = Toolkit.getDefaultToolkit().getImage("png\\Utilitybill.png");
        setIconImage(iconc);

        ImageIcon r3 = new ImageIcon("png\\exit.png");
        exit.setIcon(r3);
        exit.getIcon();
        ImageIcon r2 = new ImageIcon("png\\display.png");
        display.setIcon(r2);
        display.getIcon();
        ImageIcon r1 = new ImageIcon("png\\calculation.png");
        CALCULATEButton.setIcon(r1);
        CALCULATEButton.getIcon();
        ImageIcon r4 = new ImageIcon("png\\Erase.png");
        clearButton.setIcon(r4);
        clearButton.getIcon();
        
        totalCostTextField.setEditable(false);
        costtextArea1.setEditable(false);

        CALCULATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ec = new String(electricitytextField1.getText());
                String i = new String(internettextField2.getText());
                String s = new String(shoprenttextField3.getText());

                String e1 = electricitymonth.getSelectedItem().toString();
                String e2 = electricityyear.getSelectedItem().toString();
                String i1 = internetmonth.getSelectedItem().toString();
                String i2 = internetyear.getSelectedItem().toString();
                String s1 = shoprentmonth.getSelectedItem().toString();
                String s2 = shoprentyear.getSelectedItem().toString();
                
                String d1 = new String(DATEComboBox.getSelectedItem().toString());
                String d2 = new String(month.getSelectedItem().toString());
                String d3 = new String(year.getSelectedItem().toString());
                


                String ct = new String(costtextArea1.getText());


                Float a = Float.parseFloat(String.valueOf(ec));
                Float b = Float.parseFloat(String.valueOf(i));
                Float c = Float.parseFloat(String.valueOf(s));


                if (a == 0 && a < 0 || b == 0 && b < 0 || c == 0 && c > 0) {
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Input positive Integers");
                    electricitytextField1.setText(null);
                    internettextField2.setText(null);
                    shoprenttextField3.setText(null);
                } else {
                    totalCostTextField.setText(String.valueOf(a + b + c));
                }

                costtextArea1.setText(
                        "date:" +d1+"/"+ d2 + "/"+ d3 +"\n" +
                        "electricity bill  :" + ec + "tk" + "  Month   :" + e1 + "  Year :" + e2 + "\n" +
                                "Internet bill     :" + i + "tk" + "  Month   :" + i1 + "  Year :" + i2 + "\n" +
                                "Shop rent bill   :" + s + "tk" + "  Month   :" + s1 + "  Year :" + s2 + "\n" +
                                "total cost       :" + totalCostTextField.getText() + "tk" + "\n"

                );
                int ln=100;
                try {
                    RandomAccessFile raf = new RandomAccessFile("Cloth store txt file\\Utility bill list\\Utilitybill.txt","rw");
                    for (int j=0;j<ln;j++){
                        raf.readLine();
                    }
                    raf.writeBytes("\r\n");
                    raf.writeBytes("\r\n");
                    raf.writeBytes(costtextArea1.getText());
                }
                catch (Exception ae) {
                    System.out.println(ae);
                }
                JOptionPane.showMessageDialog(null, "saved successfully");
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                electricitytextField1.setText(null);
                internettextField2.setText(null);
                shoprenttextField3.setText(null);
                totalCostTextField.setText(null);
            }
        });
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                Mainmenu main = new Mainmenu("MainMenu");
                main.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new UtilityBills("UtitlityBILLs");
        frame.setVisible(true);
        
    }
}

