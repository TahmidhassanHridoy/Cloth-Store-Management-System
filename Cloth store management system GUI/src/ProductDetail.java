import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.RandomAccessFile;

public class ProductDetail extends JFrame{
    private JPanel mainpanel;
    private JComboBox itemcomboBox1;
    private JComboBox itemcomboBox2;
    private JComboBox itemcomboBox3;
    private JComboBox itemcomboBox4;
    private JComboBox itemcomboBox5;
    private JComboBox itemcomboBox6;
    private JComboBox itemcomboBox7;
    private JComboBox itemcomboBox8;
    private JButton CALCULATEButton;
    private JTextArea FinallisttextArea1;
    private JButton saveButton;
    private JTextArea list;
    private JFormattedTextField costprice1;
    private JFormattedTextField costprice2;
    private JFormattedTextField costprice3;
    private JFormattedTextField costprice4;
    private JFormattedTextField costprice5;
    private JFormattedTextField costprice6;
    private JFormattedTextField costprice7;
    private JFormattedTextField costprice8;
    private JFormattedTextField quantitybox1;
    private JFormattedTextField quantitybox2;
    private JFormattedTextField quantitybox3;
    private JFormattedTextField quantitybox4;
    private JFormattedTextField quantitybox5;
    private JFormattedTextField quantitybox6;
    private JFormattedTextField quantitybox7;
    private JFormattedTextField quantitybox8;
    private JFormattedTextField totalcostpricebox1;
    private JFormattedTextField totalcostpricebox2;
    private JFormattedTextField totalcostpricebox3;
    private JFormattedTextField totalcostpricebox4;
    private JFormattedTextField totalcostpricebox5;
    private JFormattedTextField totalcostpricebox6;
    private JFormattedTextField totalcostpricebox7;
    private JFormattedTextField totalcostpricebox8;
    private JComboBox DATEComboBox;
    private JComboBox month;
    private JComboBox year;
    private JFormattedTextField totalQuantityFormattedTextField;
    private JFormattedTextField totalCostFormattedTextField;
    private JLabel exit;
    private JLabel Display;


    public ProductDetail(String title){
            super(title);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setContentPane(mainpanel);
            this.pack();
            setBounds(250,80,930,580);

        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("img\\photo-3.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
        Image iconc = Toolkit.getDefaultToolkit().getImage("png\\productd.png");
        setIconImage(iconc);
        
        ImageIcon r1 = new ImageIcon("png\\calculation.png");
        CALCULATEButton.setIcon(r1);
        CALCULATEButton.getIcon();
        ImageIcon r4 = new ImageIcon("png\\save.png");
        saveButton.setIcon(r4);
        saveButton.getIcon();
        ImageIcon r3 = new ImageIcon("png\\exit.png");
        exit.setIcon(r3);
        exit.getIcon();
        ImageIcon r2 = new ImageIcon("png\\display.png");
        Display.setIcon(r2);
        Display.getIcon();
        
        totalcostpricebox1.setEditable(false);
        totalcostpricebox2.setEditable(false);
        totalcostpricebox3.setEditable(false);
        totalcostpricebox4.setEditable(false);
        totalcostpricebox5.setEditable(false);
        totalcostpricebox6.setEditable(false);
        totalcostpricebox7.setEditable(false);
        totalcostpricebox8.setEditable(false);
        totalCostFormattedTextField.setEditable(false);
        totalQuantityFormattedTextField.setEditable(false);
        list.setEditable(false);


        CALCULATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String t1 = new String(costprice1.getText());
                String t2 = new String(costprice2.getText());
                String t3 = new String(costprice3.getText());
                String t4 = new String(costprice4.getText());
                String t5 = new String(costprice5.getText());
                String t6 = new String(costprice6.getText());
                String t7 = new String(costprice7.getText());
                String t8 = new String(costprice8.getText());
                String t9 = new String(quantitybox1.getText());
                String t10 = new String(quantitybox2.getText());
                String t11 = new String(quantitybox3.getText());
                String t12 = new String(quantitybox4.getText());
                String t13 = new String(quantitybox5.getText());
                String t14 = new String(quantitybox6.getText());
                String t15 = new String(quantitybox7.getText());
                String t16 = new String(quantitybox8.getText());
                String t17 = new String(totalcostpricebox1.getText());
                String t18 = new String(totalcostpricebox2.getText());
                String t19 = new String(totalcostpricebox3.getText());
                String t20 = new String(totalcostpricebox4.getText());
                String t21 = new String(totalcostpricebox5.getText());
                String t22 = new String(totalcostpricebox6.getText());
                String t23 = new String(totalcostpricebox7.getText());
                String t24 = new String(totalcostpricebox8.getText());
                String t25 = new String(totalCostFormattedTextField.getText());
                String t26 = new String(totalQuantityFormattedTextField.getText());
                String d1 = DATEComboBox.getSelectedItem().toString();
                String d2 = month.getSelectedItem().toString();
                String d3 = year.getSelectedItem().toString();

                String c1 = itemcomboBox1.getSelectedItem().toString();
                String c2 = itemcomboBox2.getSelectedItem().toString();
                String c3 = itemcomboBox3.getSelectedItem().toString();
                String c4 = itemcomboBox4.getSelectedItem().toString();
                String c5 = itemcomboBox5.getSelectedItem().toString();
                String c6 = itemcomboBox6.getSelectedItem().toString();
                String c7 = itemcomboBox7.getSelectedItem().toString();
                String c8 = itemcomboBox8.getSelectedItem().toString();
                String tc = new String(list.getText());

                double p1 = Double.parseDouble(t1);
                double p2 = Double.parseDouble(t2);
                double p3 = Double.parseDouble(t3);
                double p4 = Double.parseDouble(t4);
                double p5 = Double.parseDouble(t5);
                double p6 = Double.parseDouble(t6);
                double p7 = Double.parseDouble(t7);
                double p8 = Double.parseDouble(t8);
                
                int q1 = Integer.parseInt(t9);
                int q2 = Integer.parseInt(t10);
                int q3 = Integer.parseInt(t11);
                int q4 = Integer.parseInt(t12);
                int q5 = Integer.parseInt(t13);
                int q6 = Integer.parseInt(t14);
                int q7 = Integer.parseInt(t15);
                int q8 = Integer.parseInt(t16);

                if (p1 <= 0) {
                    JFrame frame = new JFrame("Error");
                    JOptionPane.showMessageDialog(frame, "Must FILL the 1st Cost price (per)(no 0 value)");
                } else {
                    if (q1 <= 0) {
                        JFrame frame = new JFrame("Error");
                        JOptionPane.showMessageDialog(frame, "Must FILL the 1st Quantity(no 0 value)");
                    } else {
                        totalcostpricebox1.setValue(q1 * p1);
                        totalQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7+q8);
                        totalCostFormattedTextField.setValue((q1 * p1)+(q2 * p2)+(q3 * p3)+(q4 * p4)+(q5 * p5)+(q6 * p6)+(q7 * p7)+(q8 * p8));

                        list.setText("Date:" + d1 + "/" + d2 + "/" + d3 + "\n" +
                                c1 + " " + t1 + "tk " + t9 + " total:" + t17 + "tk" + "\n" +
                                "total Quantity:" + totalQuantityFormattedTextField.getText() + "pices" + "\n" +
                                "total Cost:" + totalCostFormattedTextField.getText() + "tk"
                        );
                        if (q2 <= 0 && p2 <= 0) {
                        } else {
                            totalcostpricebox2.setValue(q2 * p2);
                            totalQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7+q8);
                            totalCostFormattedTextField.setValue((q1 * p1)+(q2 * p2)+(q3 * p3)+(q4 * p4)+(q5 * p5)+(q6 * p6)+(q7 * p7)+(q8 * p8));

                            list.setText("Date:" + d1 + "/" + d2 + "/" + d3 + "\n" +
                                    c1 + " " + t1 + "tk " + t9 + " total:" + t17 + "tk" + "\n" +
                                    c2 + " " + t2 + "tk " + t10 + " total:" + t18 + "tk" + "\n" +
                                    "total Quantity:" + totalQuantityFormattedTextField.getText() + "pices" + "\n" +
                                    "total Cost:" + totalCostFormattedTextField.getText() + "tk"
                            );
                            if (q3 <= 0 && p3 <= 0) {
                            } else {
                                totalcostpricebox3.setValue(q3 * p3);
                                totalQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7+q8);
                                totalCostFormattedTextField.setValue((q1 * p1)+(q2 * p2)+(q3 * p3)+(q4 * p4)+(q5 * p5)+(q6 * p6)+(q7 * p7)+(q8 * p8));

                                list.setText("Date:" + d1 + "/" + d2 + "/" + d3 + "\n" +
                                        c1 + " " + t1 + "tk " + t9 + " total:" + t17 + "tk" + "\n" +
                                        c2 + " " + t2 + "tk " + t10 + " total:" + t18 + "tk" + "\n" +
                                        c3 + " " + t3 + "tk " + t11 + " total:" + t19 + "tk" + "\n" +
                                        "total Quantity:" + totalQuantityFormattedTextField.getText() + "pices" + "\n" +
                                        "total Cost:" + totalCostFormattedTextField.getText() + "tk"
                                );
                                if (q4 <= 0 && p4 <= 0) {
                                } else {
                                    totalcostpricebox4.setValue(q4 * p4);
                                    totalQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7+q8);
                                    totalCostFormattedTextField.setValue((q1 * p1)+(q2 * p2)+(q3 * p3)+(q4 * p4)+(q5 * p5)+(q6 * p6)+(q7 * p7)+(q8 * p8));

                                    list.setText("Date:" + d1 + "/" + d2 + "/" + d3 + "\n" +
                                            c1 + " " + t1 + "tk " + t9 + " total:" + t17 + "tk" + "\n" +
                                            c2 + " " + t2 + "tk " + t10 + " total:" + t18 + "tk" + "\n" +
                                            c3 + " " + t3 + "tk " + t11 + " total:" + t19 + "tk" + "\n" +
                                            c4 + " " + t4 + "tk " + t12 + " total:" + t20 + "tk" + "\n" +
                                            "total Quantity:" + totalQuantityFormattedTextField.getText() + "pices" + "\n" +
                                            "total Cost:" + totalCostFormattedTextField.getText() + "tk"
                                    );
                                    if (q5 <= 0 && p5 <= 0) {
                                    } else {
                                        totalcostpricebox5.setValue(q5 * p5);
                                        totalQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7+q8);
                                        totalCostFormattedTextField.setValue((q1 * p1)+(q2 * p2)+(q3 * p3)+(q4 * p4)+(q5 * p5)+(q6 * p6)+(q7 * p7)+(q8 * p8));

                                        list.setText("Date:" + d1 + "/" + d2 + "/" + d3 + "\n" +
                                                c1 + " " + t1 + "tk " + t9 + " total:" + t17 + "tk" + "\n" +
                                                c2 + " " + t2 + "tk " + t10 + " total:" + t18 + "tk" + "\n" +
                                                c3 + " " + t3 + "tk " + t11 + " total:" + t19 + "tk" + "\n" +
                                                c4 + " " + t4 + "tk " + t12 + " total:" + t20 + "tk" + "\n" +
                                                c5 + " " + t5 + "tk " + t13 + " total:" + t21 + "tk" + "\n" +
                                                "total Quantity:" + totalQuantityFormattedTextField.getText() + "pices" + "\n" +
                                                "total Cost:" + totalCostFormattedTextField.getText() + "tk"
                                        );
                                        if (q6 <= 0 && p6 <= 0) {
                                        } else {
                                            totalcostpricebox6.setValue(q6 * p6);
                                            totalQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7+q8);
                                            totalCostFormattedTextField.setValue((q1 * p1)+(q2 * p2)+(q3 * p3)+(q4 * p4)+(q5 * p5)+(q6 * p6)+(q7 * p7)+(q8 * p8));

                                            list.setText("Date:" + d1 + "/" + d2 + "/" + d3 + "\n" +
                                                    c1 + " " + t1 + "tk " + t9 + " total:" + t17 + "tk" + "\n" +
                                                    c2 + " " + t2 + "tk " + t10 + " total:" + t18 + "tk" + "\n" +
                                                    c3 + " " + t3 + "tk " + t11 + " total:" + t19 + "tk" + "\n" +
                                                    c4 + " " + t4 + "tk " + t12 + " total:" + t20 + "tk" + "\n" +
                                                    c5 + " " + t5 + "tk " + t13 + " total:" + t21 + "tk" + "\n" +
                                                    c6 + " " + t6 + "tk " + t14 + " total:" + t22 + "tk" + "\n" +
                                                    "total Quantity:" + totalQuantityFormattedTextField.getText() + "pices" + "\n" +
                                                    "total Cost:" + totalCostFormattedTextField.getText() + "tk"
                                            );
                                            if (q7 <= 0 && p7 <= 0) {
                                            } else {
                                                totalcostpricebox7.setValue(q7 * p7);
                                                totalQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7+q8);
                                                totalCostFormattedTextField.setValue((q1 * p1)+(q2 * p2)+(q3 * p3)+(q4 * p4)+(q5 * p5)+(q6 * p6)+(q7 * p7)+(q8 * p8));

                                                list.setText("Date:" + d1 + "/" + d2 + "/" + d3 + "\n" +
                                                        c1 + " " + t1 + "tk " + t9 + " total:" + t17 + "tk" + "\n" +
                                                        c2 + " " + t2 + "tk " + t10 + " total:" + t18 + "tk" + "\n" +
                                                        c3 + " " + t3 + "tk " + t11 + " total:" + t19 + "tk" + "\n" +
                                                        c4 + " " + t4 + "tk " + t12 + " total:" + t20 + "tk" + "\n" +
                                                        c5 + " " + t5 + "tk " + t13 + " total:" + t21 + "tk" + "\n" +
                                                        c6 + " " + t6 + "tk " + t14 + " total:" + t22 + "tk" + "\n" +
                                                        c7 + " " + t7 + "tk " + t15 + " total:" + t23 + "tk" + "\n" +
                                                        "total Quantity:" + totalQuantityFormattedTextField.getText() + "pices" + "\n" +
                                                        "total Cost:" + totalCostFormattedTextField.getText() + "tk"
                                                );
                                                if (q8 <= 0 && p8 <= 0) {
                                                } else {
                                                    totalcostpricebox8.setValue(q8 * p8);
                                                     totalQuantityFormattedTextField.setValue(q1+q2+q3+q4+q5+q6+q7+q8);
                                                     totalCostFormattedTextField.setValue((q1 * p1)+(q2 * p2)+(q3 * p3)+(q4 * p4)+(q5 * p5)+(q6 * p6)+(q7 * p7)+(q8 * p8));
                                                  
                                                    list.setText("Date:" + d1 + "/" + d2 + "/" + d3 + "\n" +
                                                            c1 + " " + t1 + "tk " + t9 + " total:" + t17 + "tk" + "\n" +
                                                            c2 + " " + t2 + "tk " + t10 + " total:" + t18 + "tk" + "\n" +
                                                            c3 + " " + t3 + "tk " + t11 + " total:" + t19 + "tk" + "\n" +
                                                            c4 + " " + t4 + "tk " + t12 + " total:" + t20 + "tk" + "\n" +
                                                            c5 + " " + t5 + "tk " + t13 + " total:" + t21 + "tk" + "\n" +
                                                            c6 + " " + t6 + "tk " + t14 + " total:" + t22 + "tk" + "\n" +
                                                            c7 + " " + t7 + "tk " + t15 + " total:" + t23 + "tk" + "\n" +
                                                            c8 + " " + t8 + "tk " + t16 + " total:" + t24 + "tk" + "\n" +
                                                            "total Quantity:" + totalQuantityFormattedTextField.getText() + "pices" + "\n" +
                                                            "total Cost:" + totalCostFormattedTextField.getText() + "tk"
                                                    );
                                                }
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
                    RandomAccessFile raf = new RandomAccessFile("Cloth store txt file\\Product detail list\\productdetail.txt","rw");
                    for (int i=0;i<ln;i++){
                        raf.readLine();
                    }
                    raf.writeBytes("\r\n");
                    raf.writeBytes("\r\n");
                    raf.writeBytes(list.getText());
                }
                catch (Exception a) {
                    System.out.println(a);
                }
                JOptionPane.showMessageDialog(null, "saved successfully"); 
                costprice1.setValue(0);
                costprice2.setValue(0);
                costprice3.setValue(0);
                costprice4.setValue(0);
                costprice5.setValue(0);
                costprice6.setValue(0);
                costprice7.setValue(0);
                costprice8.setValue(0);
                quantitybox1.setValue(0);
                quantitybox2.setValue(0);
                quantitybox3.setValue(0);
                quantitybox4.setValue(0);
                quantitybox5.setValue(0);
                quantitybox6.setValue(0);
                quantitybox7.setValue(0);
                quantitybox8.setValue(0);
                totalcostpricebox1.setValue(0);
                totalcostpricebox2.setValue(0);
                totalcostpricebox3.setValue(0);
                totalcostpricebox4.setValue(0);
                totalcostpricebox5.setValue(0);
                totalcostpricebox6.setValue(0);
                totalcostpricebox7.setValue(0);
                totalcostpricebox8.setValue(0);
                totalCostFormattedTextField.setValue(0);
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
        costprice1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                costprice1.setValue("");
            }
        });

        costprice1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                costprice1.setValue("");
            }
        });
        costprice2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                costprice2.setValue("");
            }
        });
        costprice3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                costprice3.setValue("");
            }
        });
        costprice4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                costprice4.setValue("");
            }
        });
        costprice5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                costprice5.setValue("");
            }
        });
        costprice6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                costprice6.setValue("");
            }
        }); costprice7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                costprice7.setValue("");
            }
        });
        costprice8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                costprice8.setValue("");
            }
        });

        quantitybox1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantitybox1.setValue("");
            }
        });
        quantitybox2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantitybox2.setValue("");
            }
        });
        quantitybox3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantitybox3.setValue("");
            }
        });
        quantitybox4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantitybox4.setValue("");
            }
        });
        quantitybox5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantitybox5.setValue("");
            }
        });
        quantitybox6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantitybox6.setValue("");
            }
        });
        quantitybox7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantitybox7.setValue("");
            }
        });
        quantitybox8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                quantitybox8.setValue("");
            }
        });
    }
    
        public static void main (String[] args){
            JFrame frame = new BillChart("Product Detail");
            frame.setVisible(true);
        }
    }
    

