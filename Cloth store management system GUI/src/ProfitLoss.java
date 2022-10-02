import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.RandomAccessFile;

public class ProfitLoss extends JFrame { 
    private JPanel mainpanel;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;
    private JFormattedTextField formattedTextField3;
    private JTextArea AccounttextArea1;
    private JFormattedTextField LossBox;
    private JFormattedTextField profitbox;
    private JButton CALCULATEButton;
    private JButton saveButton;
    private JFormattedTextField othersFormattedTextField;
    private JComboBox dateComboBox;
    private JComboBox month;
    private JComboBox year;
    private JLabel exit;
    private JLabel display;

       public ProfitLoss(String Title) {    
            super(Title);
            this.setContentPane(mainpanel);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.pack();
            setBounds(400, 100, 650, 430);
            setLayout(new BorderLayout());
            JLabel background = new JLabel(new ImageIcon("img\\photo-3.jpg"));
            add(background);
            background.setLayout(new FlowLayout());
           Image icon = Toolkit.getDefaultToolkit().getImage("png\\profit.png");
           setIconImage(icon);

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
           display.setIcon(r2);
           display.getIcon();
           profitbox.setEditable(false);
           LossBox.setEditable(false);
           AccounttextArea1.setEditable(false);

            CALCULATEButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String t1 = new String(formattedTextField1.getText());
                    String t2 = new String(formattedTextField2.getText());
                    String t3 = new String(formattedTextField3.getText());
                    String t4 = new String(othersFormattedTextField.getText());
                    String d1 =new String(dateComboBox.getSelectedItem().toString());
                    String d2 =new String(month.getSelectedItem().toString());
                    String d3 =new String(year.getSelectedItem().toString());
                    double a = Double.parseDouble(t1);
                    double b = Double.parseDouble(t2);
                    double c = Double.parseDouble(t3);
                    double d = Double.parseDouble(t4);

                    if (a >= (b + c + d)) {

                        profitbox.setValue(a - (b + c + d));
                        LossBox.setValue(0);
                        AccounttextArea1.setText(
                                "date:" +d1+"/"+ d2 + "/"+ d3 +"\n" +
                                        "Total Amount(sell): " + t1 + "tk" + "\n" +
                                        "TotalAmounnt(cost): " + t2 + "tk" + "\n" +
                                        "Utility Bill: " + t3 + "tk" + "\n" +
                                        "Others :" + t4 + "tk" +"\n"+
                                        "Profit: " + profitbox.getValue() + "tk"
                        );
                    } else {
                        LossBox.setValue((b + c + d) - a);
                        profitbox.setValue(0);
                        AccounttextArea1.setText(
                                "date:" +d1+"/"+ d2 + "/"+ d3 +"\n" +
                                        "Total Amount(sell): " + t1 + "tk" + "\n" +
                                        "TotalAmounnt(cost): " + t2 + "tk" + "\n" +
                                        "Utility Bill: " + t3 + "tk" + "\n" +
                                        "Others :" + t4 + "tk" +"\n"+
                                        "Loss: " + LossBox.getValue() + "tk"
                        );
                    }
                }
            });

            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame frame = new JFrame();
                    int ln=100;
                    try {
                        RandomAccessFile raf = new RandomAccessFile("Cloth store txt file\\Lossprofit\\LOSSPROFITDETAIL1.txt","rw");
                        for (int i=0;i<ln;i++){
                            raf.readLine();
                        }
                        raf.writeBytes("\r\n");
                        raf.writeBytes("\r\n");
                        raf.writeBytes(AccounttextArea1.getText());
                        }
                     catch (Exception a) {
                        System.out.println(a);
                    }
                    
                    JOptionPane.showMessageDialog(frame, "saved successfully");
                    formattedTextField1.setText(null);
                    formattedTextField2.setText(null);
                    formattedTextField3.setText(null);
                    LossBox.setText(null);
                    profitbox.setText(null);
                    othersFormattedTextField.setText(null);
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

       public static void main(String[] args){
       
            JFrame frame = new ProfitLoss("PROFIT LOSS");
            frame.setVisible(true);


    }
   }
