import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.RandomAccessFile;

public class ProductSold extends JFrame{
    private JPanel mainpanel;
    private JComboBox comboBox1;
    private JComboBox month;
    private JComboBox year;
    private JTextArea soldItemListTextArea;
    private JButton CALCULATEButton;
    private JButton saveButton;
    private JFormattedTextField quantity1;
    private JFormattedTextField quantity2;
    private JFormattedTextField quantity3;
    private JFormattedTextField quantity4;
    private JFormattedTextField quantity5;
    private JFormattedTextField quantity6;
    private JFormattedTextField quantity7;
    private JFormattedTextField priceperbox1;
    private JFormattedTextField priceperbox2;
    private JFormattedTextField priceperbox3;
    private JFormattedTextField priceperbox4;
    private JFormattedTextField priceperbox5;
    private JFormattedTextField priceperbox6;
    private JFormattedTextField priceperbox7;
    private JFormattedTextField sellingpricetotalbox1;
    private JFormattedTextField sellingpricetotalbox2;
    private JFormattedTextField sellingpricetotalbox3;
    private JFormattedTextField sellingpricetotalbox4;
    private JFormattedTextField sellingpricetotalbox5;
    private JFormattedTextField sellingpricetotalbox6;
    private JFormattedTextField sellingpricetotalbox7;
    private JFormattedTextField totalAmountSellingPriceFormattedTextField;
    private JFormattedTextField totalAmountOfQuantityFormattedTextField;
    private JComboBox product1;
    private JComboBox product2;
    private JComboBox product3;
    private JComboBox product4;
    private JComboBox product5;
    private JComboBox product6;
    private JComboBox product7;
    private JLabel exit;
    private JLabel display;


    protected ProductSold(String title){
        super(title);
        this.setContentPane(mainpanel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        setBounds(250,100,880,500);
        setLayout(new BorderLayout());
        Image iconc = Toolkit.getDefaultToolkit().getImage("png\\productsl.png");
        setIconImage(iconc);
        JLabel background=new JLabel(new ImageIcon("img\\photo-3.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
        ImageIcon r1 = new ImageIcon("png\\calculation.png");
        CALCULATEButton.setIcon(r1);
        CALCULATEButton.getIcon();
        ImageIcon r4 = new ImageIcon("png\\save.png");
        saveButton.setIcon(r4);
        saveButton.getIcon();
        ImageIcon r2 = new ImageIcon("png\\display.png");
        display.setIcon(r2);
        display.getIcon();
        ImageIcon r3 = new ImageIcon("png\\exit.png");
        exit.setIcon(r3);
        exit.getIcon();
        sellingpricetotalbox1.setEditable(false);
        sellingpricetotalbox2.setEditable(false);
        sellingpricetotalbox3.setEditable(false);
        sellingpricetotalbox4.setEditable(false);
        sellingpricetotalbox5.setEditable(false);
        sellingpricetotalbox6.setEditable(false);
        sellingpricetotalbox7.setEditable(false);
        soldItemListTextArea.setEditable(false);
        totalAmountOfQuantityFormattedTextField.setEditable(false);
        totalAmountSellingPriceFormattedTextField.setEditable(false);
        
        CALCULATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String c1 = comboBox1.getSelectedItem().toString();
                String c2 = month.getSelectedItem().toString();
                String c3 = year.getSelectedItem().toString();
                String p1 = new String(priceperbox1.getText());
                String p2 = new String(priceperbox2.getText());
                String p3 = new String(priceperbox3.getText());
                String p4 = new String(priceperbox4.getText());
                String p5 = new String(priceperbox5.getText());
                String p6 = new String(priceperbox6.getText());
                String p7 = new String(priceperbox7.getText());

                String sh1 =product1.getSelectedItem().toString();
                String sh2 = new String(quantity1.getText());
                String sh3 = new String(sellingpricetotalbox1.getText());

                String sf2 = new String(quantity2.getText());
                String sf3 = new String(sellingpricetotalbox2.getText());
                String sf1 = product2.getSelectedItem().toString();

                String pj1 = product3.getSelectedItem().toString();
                String pj2 = new String(quantity3.getText());
                String pj3 = new String(sellingpricetotalbox3.getText());

                String pg2 = new String(quantity4.getText());
                String pg1 =product4.getSelectedItem().toString() ;
                String pg3 = new String(sellingpricetotalbox4.getText());

                String pf1 =product5.getSelectedItem().toString() ;
                String pf2 = new String(quantity5.getText());
                String pf3 = new String(sellingpricetotalbox5.getText());

                String ts2 = new String(quantity6.getText());
                String ts3 = new String(sellingpricetotalbox6.getText());
                String ts1 = product6.getSelectedItem().toString();

                String pts1 =product7.getSelectedItem().toString();
                String pts2 = new String(quantity7.getText());
                String pts3 = new String(sellingpricetotalbox7.getText());


                int q1 = Integer.parseInt(sh2);
                float pr1 = Float.parseFloat(p1);
                int q2 = Integer.parseInt(sf2);
                float pr2 = Float.parseFloat(p2);
                int q3 = Integer.parseInt(pj2);
                float pr3 = Float.parseFloat(p3);
                int q4 = Integer.parseInt(pg2);
                float pr4 = Float.parseFloat(p4);
                int q5 = Integer.parseInt((pf2));
                float pr5 = Float.parseFloat(p5);
                int q6 = Integer.parseInt(ts2);
                float pr6 = Float.parseFloat(p6);
                int q7 = Integer.parseInt(pts2);
                float pr7 = Float.parseFloat(p7);
                
                JFrame frame = new JFrame();
                
                if (q1 <= 0) {
                    JOptionPane.showMessageDialog(frame, "Input positive Integers numbers or no 0)");
                    
                } else {
                    if (pr1 <= 0) {
                        JOptionPane.showMessageDialog(frame, "Input positive Integers numbers or no 0)");
                    } 
                    else{
                        sellingpricetotalbox1.setValue(q1 * pr1);
                        if (q2 <= 0 && pr2 <= 0) {
                            sellingpricetotalbox3.setValue(q3 * pr3);
                            sellingpricetotalbox4.setValue(q4 * pr4);
                            sellingpricetotalbox5.setValue(q5 * pr5);
                            sellingpricetotalbox6.setValue(q6 * pr6);
                            sellingpricetotalbox7.setValue(q7 * pr7);
                            totalAmountOfQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7);
                            totalAmountSellingPriceFormattedTextField.setValue((q1 * pr1) + (q2 * pr2) + (q3 * pr3) + (q4 * pr4) + (q5 * pr5) + (q6 * pr6) + (q7 * pr7));
                            soldItemListTextArea.setText(
                                    "DATE:"+c1+"/"+c2+"/"+c3+"\n"+
                                     sh1 + " " + "quantity: " + sh2 + "  " + p1 + "tk" + " " + "Total:" + sh3 + "tk" + "\n" +
                                         "Total Quantity" + totalAmountOfQuantityFormattedTextField.getText() + "pieces" + "\n" +
                                        "Total Amount:" + totalAmountSellingPriceFormattedTextField.getText() + "tk"
                            );
                        } else {
                            sellingpricetotalbox2.setValue(q2 * pr2);
                            if (q3 <= 0 && pr3 <= 0) {
                                sellingpricetotalbox4.setValue(q4 * pr4);
                                sellingpricetotalbox5.setValue(q5 * pr5);
                                sellingpricetotalbox6.setValue(q6 * pr6);
                                sellingpricetotalbox7.setValue(q7 * pr7);
                                totalAmountOfQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7);
                                totalAmountSellingPriceFormattedTextField.setValue((q1 * pr1) + (q2 * pr2) + (q3 * pr3) + (q4 * pr4) + (q5 * pr5) + (q6 * pr6) + (q7 * pr7));
                                soldItemListTextArea.setText(
                                        "DATE:"+c1+"/"+c2+"/"+c3+"\n"+
                                         sh1 + " " + "quantity: " + sh2 + "  " + p1 + "tk" + " " + "Total:" + sh3 + "tk" + "\n" +
                                                  sf1 + " " + "quantity: " + sf2 + "  " + p2 + "tk" + " " + "Total:" + sf3 + "tk" + "\n" +
                                                "Total Quantity" + totalAmountOfQuantityFormattedTextField.getText() + "pieces" + "\n" +
                                                "Total Amount:" + totalAmountSellingPriceFormattedTextField.getText() + "tk"
                                );
                            } else {
                                sellingpricetotalbox3.setValue(q3 * pr3);
                                if (q4 <= 0 && pr4 <= 0) {
                                    sellingpricetotalbox5.setValue(q5 * pr5);
                                    sellingpricetotalbox6.setValue(q6 * pr6);
                                    sellingpricetotalbox7.setValue(q7 * pr7);
                                    totalAmountOfQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7);
                                    totalAmountSellingPriceFormattedTextField.setValue((q1 * pr1) + (q2 * pr2) + (q3 * pr3) + (q4 * pr4) + (q5 * pr5) + (q6 * pr6) + (q7 * pr7));
                                    soldItemListTextArea.setText(
                                            "DATE:"+c1+"/"+c2+"/"+c3+"\n"+
                                             sh1 + " " + "quantity: " + sh2 + "  " + p1 + "tk" + " " + "Total:" + sh3 + "tk" + "\n" +
                                                    sf1 + " " + "quantity: " + sf2 + "  " + p2 + "tk" + " " + "Total:" + sf3 + "tk" + "\n" +
                                                     pj1 + " " + "quantity: " + pj2 + "  " + p3 + "tk" + " " + "Total:" + pj3 + "tk" + "\n" +
                                                     pg1 + " " + "quantity: " + pg2 + "  " + p4 + "tk" + " " + "Total:" + pg3 + "tk" + "\n" +
                                                    "Total Quantity" + totalAmountOfQuantityFormattedTextField.getText() + "pieces" + "\n" +
                                                    "Total Amount:" + totalAmountSellingPriceFormattedTextField.getText() + "tk"
                                    );
                                } else {
                                    sellingpricetotalbox4.setValue(q4 * pr4);
                                    if (q5 <= 0 && pr5 <= 0) {
                                        sellingpricetotalbox6.setValue(q6 * pr6);
                                        sellingpricetotalbox7.setValue(q7 * pr7);
                                        totalAmountOfQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7);
                                        totalAmountSellingPriceFormattedTextField.setValue((q1 * pr1) + (q2 * pr2) + (q3 * pr3) + (q4 * pr4) + (q5 * pr5) + (q6 * pr6) + (q7 * pr7));
                                        soldItemListTextArea.setText(
                                                "DATE:"+c1+"/"+c2+"/"+c3+"\n"+
                                                 sh1 + " " + "quantity: " + sh2 + "  " + p1 + "tk" + " " + "Total:" + sh3 + "tk" + "\n" +
                                                         sf1 + " " + "quantity: " + sf2 + "  " + p2 + "tk" + " " + "Total:" + sf3 + "tk" + "\n" +
                                                        pj1 + " " + "quantity: " + pj2 + "  " + p3 + "tk" + " " + "Total:" + pj3 + "tk" + "\n" +
                                                         pg1 + " " + "quantity: " + pg2 + "  " + p4 + "tk" + " " + "Total:" + pg3 + "tk" + "\n" +
                                                        "Total Amount:" + totalAmountSellingPriceFormattedTextField.getText() + "tk"
                                        );
                                    } else {
                                        sellingpricetotalbox5.setValue(q5 * pr5);
                                        if (q6 <= 0 && pr6 <= 0) {
                                            sellingpricetotalbox7.setValue(q7 * pr7);
                                            totalAmountOfQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7);
                                            totalAmountSellingPriceFormattedTextField.setValue((q1 * pr1) + (q2 * pr2) + (q3 * pr3) + (q4 * pr4) + (q5 * pr5) + (q6 * pr6) + (q7 * pr7));
                                            soldItemListTextArea.setText(
                                                    "DATE:"+c1+"/"+c2+"/"+c3+"\n"+
                                                    sh1 + " " + "quantity: " + sh2 + "  " + p1 + "tk" + " " + "Total:" + sh3 + "tk" + "\n" +
                                                             sf1 + " " + "quantity: " + sf2 + "  " + p2 + "tk" + " " + "Total:" + sf3 + "tk" + "\n" +
                                                             pj1 + " " + "quantity: " + pj2 + "  " + p3 + "tk" + " " + "Total:" + pj3 + "tk" + "\n" +
                                                             pg1 + " " + "quantity: " + pg2 + "  " + p4 + "tk" + " " + "Total:" + pg3 + "tk" + "\n" +
                                                             pf1 + " " + "quantity: " + pf2 + "  " + p5 + "tk" + " " + "Total:" + pf3 + "tk" + "\n" +
                                                            "Total Quantity" + totalAmountOfQuantityFormattedTextField.getText() + "pieces" + "\n" +
                                                            "Total Amount:" + totalAmountSellingPriceFormattedTextField.getText() + "tk"
                                            );
                                        } else {
                                            sellingpricetotalbox6.setValue(q6 * pr6);
                                            if (q7 <= 0 && pr7 <= 0) {
                                                totalAmountOfQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7);
                                                totalAmountSellingPriceFormattedTextField.setValue((q1 * pr1) + (q2 * pr2) + (q3 * pr3) + (q4 * pr4) + (q5 * pr5) + (q6 * pr6) + (q7 * pr7));
                                                soldItemListTextArea.setText(
                                                        "DATE:"+c1+"/"+c2+"/"+c3+"\n"+
                                                         sh1 + " " + "quantity: " + sh2 + "  " + p1 + "tk" + " " + "Total:" + sh3 + "tk" + "\n" +
                                                                 sf1 + " " + "quantity: " + sf2 + "  " + p2 + "tk" + " " + "Total:" + sf3 + "tk" + "\n" +
                                                                 pj1 + " " + "quantity: " + pj2 + "  " + p3 + "tk" + " " + "Total:" + pj3 + "tk" + "\n" +
                                                                 pg1 + " " + "quantity: " + pg2 + "  " + p4 + "tk" + " " + "Total:" + pg3 + "tk" + "\n" +
                                                                 pf1 + " " + "quantity: " + pf2 + "  " + p5 + "tk" + " " + "Total:" + pf3 + "tk" + "\n" +
                                                                 ts1 + " " + "quantity: " + ts2 + "  " + p6 + "tk" + " " + "Total:" + ts3 + "tk" + "\n" +
                                                                "Total Quantity" + totalAmountOfQuantityFormattedTextField.getText() + "pieces" + "\n" +
                                                                "Total Amount:" + totalAmountSellingPriceFormattedTextField.getText() + "tk"
                                                );
                                            } else {
                                                sellingpricetotalbox7.setValue(q7 * pr7);
                                                totalAmountSellingPriceFormattedTextField.setValue((q1 * pr1) + (q2 * pr2) + (q3 * pr3) + (q4 * pr4) + (q5 * pr5) + (q6 * pr6) + (q7 * pr7));
                                                totalAmountOfQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7);
                                                soldItemListTextArea.setText(
                                                        "DATE:"+c1+"/"+c2+"/"+c3+"\n"+
                                                         sh1 + " " + "quantity: " + sh2 + "  " + p1 + "tk" + " " + "Total:" + sh3 + "tk" + "\n" +
                                                                 sf1 + " " + "quantity: " + sf2 + "  " + p2 + "tk" + " " + "Total:" + sf3 + "tk" + "\n" +
                                                                 pj1 + " " + "quantity: " + pj2 + "  " + p3 + "tk" + " " + "Total:" + pj3 + "tk" + "\n" +
                                                                 pg1 + " " + "quantity: " + pg2 + "  " + p4 + "tk" + " " + "Total:" + pg3 + "tk" + "\n" +
                                                                 pf1 + " " + "quantity: " + pf2 + "  " + p5 + "tk" + " " + "Total:" + pf3 + "tk" + "\n" +
                                                                 ts1 + " " + "quantity: " + ts2 + "  " + p6 + "tk" + " " + "Total:" + ts3 + "tk" + "\n" +
                                                                 pts1 + " " + "quantity: " + pts2 + " " + p7 + "tk" + " " + "Total:" + pts3 + "tk" + "\n" +
                                                                "Total Quantity" + totalAmountOfQuantityFormattedTextField.getText() + "pieces" + "\n" +
                                                                "Total Amount:" + totalAmountSellingPriceFormattedTextField.getText() + "tk"
                                                );
                                                soldItemListTextArea.setEditable(false);
                                               
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ln=100;
                try {
                    RandomAccessFile raf = new RandomAccessFile("Cloth store txt file\\Product Sold list\\Solditem detail.txt","rw");
                    for (int i=0;i<ln;i++){
                        raf.readLine();
                    }
                    raf.writeBytes("\r\n");
                    raf.writeBytes("\r\n");
                    raf.writeBytes(soldItemListTextArea.getText());
                }
                catch (Exception a) {
                    System.out.println(a);
                }
                JOptionPane.showMessageDialog(null, "saved successfully");
                quantity1.setValue(0);
                quantity2.setValue(0);
                quantity3.setValue(0);
                quantity4.setValue(0);
                quantity5.setValue(0);
                quantity6.setValue(0);
                quantity7.setValue(0);
                priceperbox1.setValue(0);
                priceperbox2.setValue(0);
                priceperbox3.setValue(0);
                priceperbox4.setValue(0);
                priceperbox5.setValue(0);
                priceperbox6.setValue(0);
                priceperbox7.setValue(0);
                sellingpricetotalbox1.setValue(0);
                sellingpricetotalbox2.setValue(0);
                sellingpricetotalbox3.setValue(0);
                sellingpricetotalbox4.setValue(0);
                sellingpricetotalbox5.setValue(0);
                sellingpricetotalbox6.setValue(0);
                sellingpricetotalbox7.setValue(0);
                soldItemListTextArea.setText(null);
                totalAmountOfQuantityFormattedTextField.setValue(0);
                totalAmountSellingPriceFormattedTextField.setValue(0);
            }
        });
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);   dispose();
                Mainmenu main = new Mainmenu("MainMenu");
                main.setVisible(true);
            }
        });
        quantity1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantity1.setValue("");
            }
        });
        quantity2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantity2.setValue("");
            }
        });
        quantity3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantity3.setValue("");
            }
        });
        quantity4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantity4.setValue("");
            }
        });
        quantity5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantity5.setValue("");
            }
        });
        quantity6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantity6.setValue("");
            }
        });
        quantity7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantity7.setValue("");
            }
        });

        priceperbox1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                priceperbox1.setValue("");
            }
        });
        priceperbox2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                priceperbox2.setValue("");
            }
        });
        priceperbox3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                priceperbox3.setValue("");
            }
        });
        priceperbox4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                priceperbox4.setValue("");
            }
        });
        priceperbox5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                priceperbox5.setValue("");
            }
        });
        priceperbox6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                priceperbox6.setValue("");
            }
        });
        priceperbox7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                priceperbox7.setValue("");
            }
        });
    }
    public static void main(String[] args){
        JFrame p = new ProductSold("Product sold list");
        p.setVisible(true);
        
    }
}
