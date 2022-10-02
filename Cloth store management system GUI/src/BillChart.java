
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.*;
import java.io.*;


public class BillChart extends JFrame {
    private JPanel mainpanel;
    private JComboBox productname1;
    private JComboBox productname2;
    private JComboBox productname3;
    private JComboBox productname4;
    private JComboBox productname5;
    private JComboBox productname6;
    private JComboBox productname7;
    private JTextField shopNameTextField;
    private JTextField shopAddressTextField;
    private JTextArea billchart;
    private JButton CALCULATEButton;
    private JComboBox date;
    private JComboBox month;
    private JComboBox year;
    private JComboBox vatComboBox;
    private JComboBox discountComboBox;
    private JFormattedTextField quantitybox1;
    private JFormattedTextField quantitybox2;
    private JFormattedTextField quantitybox3;
    private JFormattedTextField quantitybox4;
    private JFormattedTextField quantitybox5;
    private JFormattedTextField quantitybox6;
    private JFormattedTextField quantitybox7;
    private JFormattedTextField totalitembox;
    private JFormattedTextField pricebox1;
    private JFormattedTextField pricebox2;
    private JFormattedTextField pricebox3;
    private JFormattedTextField pricebox4;
    private JFormattedTextField pricebox5;
    private JFormattedTextField pricebox6;
    private JFormattedTextField pricebox7;
    private JFormattedTextField totalpricebox1;
    private JFormattedTextField totalpricebox2;
    private JFormattedTextField totalpricebox3;
    private JFormattedTextField totalpricebox4;
    private JFormattedTextField totalpricebox5;
    private JFormattedTextField totalpricebox6;
    private JFormattedTextField totalpricebox7;
    private JFormattedTextField totalPriceFormattedTextField;
    private JFormattedTextField afterVatTPriceFormattedTextField;
    private JFormattedTextField afterDiscountTPriceFormattedTextField;
    private JFormattedTextField paidAmountMustFillFormattedTextField;
    private JFormattedTextField changesFormattedTextField;
    private JButton clearTotalPriceButton;
    private JLabel DISPLAY;
    private JButton changesButton;
    private JLabel exit;
    private JLabel print;
    private JFormattedTextField billAmountFormattedTextField;
   
    protected BillChart(String title) {                         
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainpanel);
        this.pack();
        setBounds(150, 20, 1050, 700);

        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("img\\photo-3.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
        Image icon = Toolkit.getDefaultToolkit().getImage("png\\bills.png");
        setIconImage(icon);

        ImageIcon r3 = new ImageIcon("png\\exit.png");
        exit.setIcon(r3);
        exit.getIcon();
        ImageIcon r1 = new ImageIcon("png\\calculation.png");
        CALCULATEButton.setIcon(r1);
        CALCULATEButton.getIcon();
        ImageIcon r2 = new ImageIcon("png\\Erase.png");
        clearTotalPriceButton.setIcon(r2);
        clearTotalPriceButton.getIcon();
        ImageIcon r5 = new ImageIcon("png\\p.back.png");
        changesButton.setIcon(r5);
        changesButton.getIcon();
        ImageIcon r6 = new ImageIcon("png\\print.png");
        print.setIcon(r6);
        print.getIcon();

        totalpricebox2.setEditable(false);
        totalpricebox3.setEditable(false);
        totalpricebox4.setEditable(false);
        totalpricebox5.setEditable(false);
        totalpricebox6.setEditable(false);
        totalpricebox7.setEditable(false);
        totalpricebox1.setEditable(false);
        totalitembox.setEditable(false);
        totalPriceFormattedTextField.setEditable(false);
        billAmountFormattedTextField.setEditable(false);
        changesFormattedTextField.setEditable(false);
        afterVatTPriceFormattedTextField.setEditable(false);
        afterDiscountTPriceFormattedTextField.setEditable(false);
        billchart.setEditable(false);

        CALCULATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getToolkit().beep();
                String d = date.getSelectedItem().toString();
                String d1 = year.getSelectedItem().toString();
                String d2 = month.getSelectedItem().toString();
                String sn = new String(shopNameTextField.getText());
                String sd = new String(shopAddressTextField.getText());
                String i1 = productname1.getSelectedItem().toString();
                String i2 = productname2.getSelectedItem().toString();
                String i3 = productname3.getSelectedItem().toString();
                String i4 = productname4.getSelectedItem().toString();
                String i5 = productname5.getSelectedItem().toString();
                String i6 = productname6.getSelectedItem().toString();
                String i7 = productname7.getSelectedItem().toString();
                String q1 = new String(quantitybox1.getText());
                String q2 = new String(quantitybox2.getText());
                String q3 = new String(quantitybox3.getText());
                String q4 = new String(quantitybox4.getText());
                String q5 = new String(quantitybox5.getText());
                String q6 = new String(quantitybox6.getText());
                String q7 = new String(quantitybox7.getText());
                String tq = new String(totalitembox.getText());
                String p1 = new String(pricebox1.getText());
                String p2 = new String(pricebox2.getText());
                String p3 = new String(pricebox3.getText());
                String p4 = new String(pricebox4.getText());
                String p5 = new String(pricebox5.getText());
                String p6 = new String(pricebox6.getText());
                String p7 = new String(pricebox7.getText());
                String t1 = new String(totalpricebox1.getText());
                String t2 = new String(totalpricebox2.getText());
                String t3 = new String(totalpricebox3.getText());
                String t4 = new String(totalpricebox4.getText());
                String t5 = new String(totalpricebox5.getText());
                String t6 = new String(totalpricebox6.getText());
                String t7 = new String(totalpricebox7.getText());
                String v = vatComboBox.getSelectedItem().toString();
                String dc = discountComboBox.getSelectedItem().toString();
                
                double r1 = Double.parseDouble(p1);
                double r2 = Double.parseDouble(p2);
                double r3 = Double.parseDouble(p3);
                double r4 = Double.parseDouble(p4);
                double r5 = Double.parseDouble(p5);
                double r6 = Double.parseDouble(p6);
                double r7 = Double.parseDouble(p7);

                int e1 = Integer.parseInt(q1);
                int e2 = Integer.parseInt(q2);
                int e3 = Integer.parseInt(q3);
                int e4 = Integer.parseInt(q4);
                int e5 = Integer.parseInt(q5);
                int e6 = Integer.parseInt(q6);
                int e7 = Integer.parseInt(q7);

                int v1 = Integer.parseInt(v);
                int vv = Integer.parseInt(String.valueOf(v));
                int dis = Integer.parseInt(dc);
                int dis1 = Integer.parseInt(String.valueOf(dc));
                double r;


                if (e1 <= 0 || i1.equals("blank")) {
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, " MUST Fill the Quantity Fields first");
                    totalitembox.setValue(null);
                    quantitybox1.setValue(null);
                    pricebox1.setValue(null);
                    totalpricebox1.setValue(null);
                    quantitybox2.setValue(null);
                    quantitybox3.setValue(null);
                    quantitybox4.setValue(null);
                    quantitybox5.setValue(null);
                    quantitybox6.setValue(null);
                    quantitybox7.setValue(null);
                    pricebox2.setValue(null);
                    pricebox3.setValue(null);
                    pricebox4.setValue(null);
                    pricebox5.setValue(null);
                    pricebox6.setValue(null);
                    pricebox7.setValue(null);
                    totalpricebox2.setValue(null);
                    totalpricebox3.setValue(null);
                    totalpricebox4.setValue(null);
                    totalpricebox5.setValue(null);
                    totalpricebox6.setValue(null);
                    totalpricebox7.setValue(null);
                    vatComboBox.setSelectedItem(null);
                    discountComboBox.setSelectedItem(null);


                } else {
                    if (r1 <= 0) {
                        JFrame frame = new JFrame();
                        JOptionPane.showMessageDialog(frame, " MUST Fill the first  Fields first");
                        totalpricebox1.setValue(0);
                        quantitybox2.setValue(0);
                        quantitybox3.setValue(0);
                        quantitybox4.setValue(0);
                        quantitybox5.setValue(0);
                        quantitybox6.setValue(0);
                        quantitybox7.setValue(0);
                        pricebox2.setValue(0);
                        pricebox3.setValue(0);
                        pricebox4.setValue(0);
                        pricebox5.setValue(0);
                        pricebox6.setValue(0);
                        pricebox7.setValue(0);
                        totalpricebox1.setValue(0);
                        totalpricebox2.setValue(0);
                        totalpricebox3.setValue(0);
                        totalpricebox4.setValue(0);
                        totalpricebox5.setValue(0);
                        totalpricebox6.setValue(0);
                        totalpricebox7.setValue(0);
                        totalitembox.setValue(e1);

                    } else {
                        totalpricebox1.setText(String.valueOf(e1 * r1));
                        totalitembox.setText(String.valueOf(e1));
                        if (v1 == 0 && dis == 0) {
                            r = (e1 * r1);
                            afterVatTPriceFormattedTextField.setText(String.valueOf(r));
                            afterDiscountTPriceFormattedTextField.setText(String.valueOf(r));
                            billAmountFormattedTextField.setText(String.valueOf(r));
                            billchart.setText(
                                    "date:" + d + "/" + d2 + "/" + d1 + " \n  " +
                                            
                                            "Shop name:" + sn + " \n  " +
                                            "Shop Address;" + sd + "\n" +
                                            "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                            "total quantity:" + tq + "\n " +
                                            "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n " +
                                            "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + " \n " +
                                            "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n" +
                                            "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + "\n " +
                                            "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk");

                        } else {
                            r = (e1 * r1);
                            double avtp = (r + (r / 100) * vv);
                            double adtp = ((r + ((r / 100) * vv)) - ((r / 100) * dis1));
                            afterVatTPriceFormattedTextField.setText(String.valueOf(avtp));
                            afterDiscountTPriceFormattedTextField.setText(String.valueOf(adtp));
                            billAmountFormattedTextField.setText(String.valueOf(adtp));

                            billchart.setText(
                                    "date:" + d + "/" + d2 + "/" + d1 + "  \n " +
                                            
                                            "Shop name:" + sn + " \n  " +
                                            "Shop Address;" + sd + "\n" +
                                            "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                            "total quantity:" + tq + " \n " +
                                            "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n  " +
                                            "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + "\n " +
                                            "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n " +
                                            "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + " \n " +
                                            "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk"
                            );
                        }

                        if (e2 <= 0 || r2 <= 0 || i2.equals("blank")) {
                            totalitembox.setText(String.valueOf(e1));
                            totalPriceFormattedTextField.setText(String.valueOf((e1 * r1)));
                        } else {
                            totalpricebox2.setText(String.valueOf(e2 * r2));
                            totalitembox.setText(String.valueOf(e1 + e2));
                            if (v1 == 0 && dis == 0) {
                                r = ((e1 * r1) + (e2 * r2));
                                afterVatTPriceFormattedTextField.setText(String.valueOf(r));
                                afterDiscountTPriceFormattedTextField.setText(String.valueOf(r));
                                billAmountFormattedTextField.setText(String.valueOf(r));

                                billchart.setText(
                                        "date:" + d + "/" + d2 + "/" + d1 + " \n  " +
                                                
                                                "Shop name:" + sn + " \n  " +
                                                "Shop Address;" + sd + "\n" +
                                                "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                                "2" + "  " + i2 + "  " + q2 + "  " + p2 + "tk" + "  " + t2 + "tk" + "\n" +
                                                "total quantity:" + tq + "\n " +
                                                "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n " +
                                                "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + "\n " +
                                                "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n" +
                                                "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + "\n " +
                                                "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk"
                                );
                            } else {
                                r = ((e1 * r1) + (e2 * r2));
                                double a = (r + (r / 100) * vv);
                                double c = ((r + ((r / 100) * vv)) - ((r / 100) * dis1));
                                afterVatTPriceFormattedTextField.setText(String.valueOf(a));
                                afterDiscountTPriceFormattedTextField.setText(String.valueOf(c));
                                billAmountFormattedTextField.setText(String.valueOf(c));

                                billchart.setText(
                                        "date:" + d + "/" + d2 + "/" + d1 + "   " +
                                                
                                                "Shop name:" + sn + " \n  " +
                                                "Shop Address;" + sd + "\n" +
                                                "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                                "2" + "  " + i2 + "  " + q2 + "  " + p2 + "tk" + "  " + t2 + "tk" + "\n" +
                                                "total quantity:" + tq + " \n " +
                                                "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n  " +
                                                "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + "\n " +
                                                "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n " +
                                                "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + " \n " +
                                                "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk"
                                );

                            }
                            if (e3 <= 0 || r3 <= 0 || i3.equals("Blank")) {
                                totalPriceFormattedTextField.setText(String.valueOf((e1 * r1) + (e2 * r2)));
                            } else {
                                totalitembox.setText(String.valueOf(e1 + e2 + e3));
                                totalpricebox3.setText(String.valueOf(e3 * r3));
                                if (v1 == 0 && dis == 0) {
                                    r = ((e1 * r1) + (e2 * r2) + (e3 * r3));
                                    afterVatTPriceFormattedTextField.setText(String.valueOf(r));
                                    afterDiscountTPriceFormattedTextField.setText(String.valueOf(r));
                                    billAmountFormattedTextField.setText(String.valueOf(r));

                                    billchart.setText(
                                            "date:" + d + "/" + d2 + "/" + d1 + " \n  " +
                                                    
                                                    "Shop name:" + sn + " \n  " +
                                                    "Shop Address;" + sd + "\n" +
                                                    "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                                    "2" + "  " + i2 + "  " + q2 + "  " + p2 + "tk" + "  " + t2 + "tk" + "\n" +
                                                    "3" + "  " + i3 + "  " + q3 + "  " + p3 + "tk" + "  " + t3 + "tk" + "\n" +
                                                    "total quantity:" + tq + "\n " +
                                                    "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n " +
                                                    "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + "\n " +
                                                    "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n" +
                                                    "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + "\n " +
                                                    "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk"
                                    );
                                } else {
                                    r = ((e1 * r1) + (e2 * r2) + (e3 * r3));
                                    double a = (r + (r / 100) * vv);
                                    double c = ((r + ((r / 100) * vv)) - ((r / 100) * dis1));
                                    afterVatTPriceFormattedTextField.setText(String.valueOf(a));
                                    afterDiscountTPriceFormattedTextField.setText(String.valueOf(c));
                                    billAmountFormattedTextField.setText(String.valueOf(c));

                                    billchart.setText(
                                            "date:" + d + "/" + d2 + "/" + d1 + "   " +
                                                    
                                                    "Shop name:" + sn + " \n  " +
                                                    "Shop Address;" + sd + "\n" +
                                                    "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                                    "2" + "  " + i2 + "  " + q2 + "  " + p2 + "tk" + "  " + t2 + "tk" + "\n" +
                                                    "3" + "  " + i3 + "  " + q3 + "  " + p3 + "tk" + "  " + t3 + "tk" + "\n" +
                                                    "total quantity:" + tq + " \n " +
                                                    "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n  " +
                                                    "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + "\n " +
                                                    "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n " +
                                                    "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + " \n " +
                                                    "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk"
                                    );

                                }


                                if (e4 <= 0 || r4 <= 0 || i4.equals("blank")) {
                                    totalPriceFormattedTextField.setText(String.valueOf((e1 * r1) + (e2 * r2) + (e3 * r3)));
                                } else {
                                    totalpricebox4.setText(String.valueOf(e4 * r4));
                                    totalitembox.setText(String.valueOf(e1 + e2 + e3 + e4));
                                    if (v1 == 0 && dis == 0) {
                                        r = ((e1 * r1) + (e2 * r2) + (e3 * r3) + (e4 * r4));
                                        afterVatTPriceFormattedTextField.setText(String.valueOf(r));
                                        afterDiscountTPriceFormattedTextField.setText(String.valueOf(r));
                                        billAmountFormattedTextField.setText(String.valueOf(r));

                                        billchart.setText(
                                                "date:" + d + "/" + d2 + "/" + d1 + " \n  " +
                                                        
                                                        "Shop name:" + sn + " \n  " +
                                                        "Shop Address;" + sd + "\n" +
                                                        "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                                        "2" + "  " + i2 + "  " + q2 + "  " + p2 + "tk" + "  " + t2 + "tk" + "\n" +
                                                        "3" + "  " + i3 + "  " + q3 + "  " + p3 + "tk" + "  " + t3 + "tk" + "\n" +
                                                        "4" + "  " + i4 + "  " + q4 + "  " + p4 + "tk" + "  " + t4 + "tk" + "\n" +
                                                        "total quantity:" + tq + "\n " +
                                                        "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n " +
                                                        "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + "\n " +
                                                        "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n" +
                                                        "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + "\n " +
                                                        "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk"
                                        );
                                    } else {
                                        r = ((e1 * r1) + (e2 * r2) + (e3 * r3) + (e4 * r4));
                                        double a = (r + (r / 100) * vv);
                                        double c = ((r + ((r / 100) * vv)) - ((r / 100) * dis1));
                                        afterVatTPriceFormattedTextField.setText(String.valueOf(a));
                                        afterDiscountTPriceFormattedTextField.setText(String.valueOf(c));
                                        billAmountFormattedTextField.setText(String.valueOf(c));

                                        billchart.setText(
                                                "date:" + d + "/" + d2 + "/" + d1 + "   " +
                                                        
                                                        "Shop name:" + sn + " \n  " +
                                                        "Shop Address;" + sd + "\n" +
                                                        "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                                        "2" + "  " + i2 + "  " + q2 + "  " + p2 + "tk" + "  " + t2 + "tk" + "\n" +
                                                        "3" + "  " + i3 + "  " + q3 + "  " + p3 + "tk" + "  " + t3 + "tk" + "\n" +
                                                        "4" + "  " + i4 + "  " + q4 + "  " + p4 + "tk" + "  " + t4 + "tk" + "\n" +
                                                        "total quantity:" + tq + " \n " +
                                                        "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n  " +
                                                        "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + "\n " +
                                                        "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n " +
                                                        "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + " \n " +
                                                        "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk"
                                        );

                                    }

                                    if (e5 <= 0 || r5 <= 0 || i5.equals("blank")) {
                                        totalPriceFormattedTextField.setText(String.valueOf((e1 * r1) + (e2 * r2) + (e3 * r3) + (e4 * r4)));
                                    } else {
                                        totalpricebox5.setText(String.valueOf(e5 * r5));
                                        totalitembox.setText(String.valueOf(e1 + e2 + e3 + e4 + e5));
                                        if (v1 == 0 && dis == 0) {
                                            r = ((e1 * r1) + (e2 * r2) + (e3 * r3) + (e4 * r4) + (e5 * r5));
                                            afterVatTPriceFormattedTextField.setText(String.valueOf(r));
                                            afterDiscountTPriceFormattedTextField.setText(String.valueOf(r));
                                            billAmountFormattedTextField.setText(String.valueOf(r));

                                            billchart.setText(
                                                    "date:" + d + "/" + d2 + "/" + d1 + " \n  " +
                                                            
                                                            "Shop name:" + sn + " \n  " +
                                                            "Shop Address;" + sd + "\n" +
                                                            "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                                            "2" + "  " + i2 + "  " + q2 + "  " + p2 + "tk" + "  " + t2 + "tk" + "\n" +
                                                            "3" + "  " + i3 + "  " + q3 + "  " + p3 + "tk" + "  " + t3 + "tk" + "\n" +
                                                            "4" + "  " + i4 + "  " + q4 + "  " + p4 + "tk" + "  " + t4 + "tk" + "\n" +
                                                            "5" + "  " + i5 + "  " + q5 + "  " + p5 + "tk" + "  " + t5 + "tk" + "\n" +
                                                            "total quantity:" + tq + "\n " +
                                                            "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n " +
                                                            "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + "\n " +
                                                            "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n" +
                                                            "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + "\n " +
                                                            "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk"
                                            );
                                        } else {
                                            r = ((e1 * r1) + (e2 * r2) + (e3 * r3) + (e4 * r4) + (e5 * r5));
                                            double a = (r + (r / 100) * vv);
                                            double c = ((r + ((r / 100) * vv)) - ((r / 100) * dis1));
                                            afterVatTPriceFormattedTextField.setText(String.valueOf(a));
                                            afterDiscountTPriceFormattedTextField.setText(String.valueOf(c));
                                            billAmountFormattedTextField.setText(String.valueOf(c));

                                            billchart.setText(
                                                    "date:" + d + "/" + d2 + "/" + d1 + "   " +
                                                            
                                                            "Shop name:" + sn + " \n  " +
                                                            "Shop Address;" + sd + "\n" +
                                                            "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                                            "2" + "  " + i2 + "  " + q2 + "  " + p2 + "tk" + "  " + t2 + "tk" + "\n" +
                                                            "3" + "  " + i3 + "  " + q3 + "  " + p3 + "tk" + "  " + t3 + "tk" + "\n" +
                                                            "4" + "  " + i4 + "  " + q4 + "  " + p4 + "tk" + "  " + t4 + "tk" + "\n" +
                                                            "5" + "  " + i5 + "  " + q5 + "  " + p5 + "tk" + "  " + t5 + "tk" + "\n" +
                                                            "total quantity:" + tq + " \n " +
                                                            "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n  " +
                                                            "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + "\n " +
                                                            "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n " +
                                                            "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + " \n " +
                                                            "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk"
                                            );

                                        }

                                        if (e6 <= 0 || r6 <= 0 || i6.equals("blank")) {
                                            totalPriceFormattedTextField.setText(String.valueOf((e1 * r1) + (e2 * r2) + (e3 * r3) + (e4 * r4) + (e5 * r5)));
                                        } else {
                                            totalpricebox6.setText(String.valueOf(e6 * r6));
                                            totalitembox.setText(String.valueOf(e1 + e2 + e3 + e4 + e5 + e6));
                                            if (v1 == 0 && dis == 0) {
                                                r = ((e1 * r1) + (e2 * r2) + (e3 * r3) + (e4 * r4) + (e5 * r5) + (e6 * r6));
                                                afterVatTPriceFormattedTextField.setText(String.valueOf(r));
                                                afterDiscountTPriceFormattedTextField.setText(String.valueOf(r));
                                                billAmountFormattedTextField.setText(String.valueOf(r));

                                                billchart.setText(
                                                        "date:" + d + "/" + d2 + "/" + d1 + " \n  " +
                                                                
                                                                "Shop name:" + sn + " \n  " +
                                                                "Shop Address;" + sd + "\n" +
                                                                "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                                                "2" + "  " + i2 + "  " + q2 + "  " + p2 + "tk" + "  " + t2 + "tk" + "\n" +
                                                                "3" + "  " + i3 + "  " + q3 + "  " + p3 + "tk" + "  " + t3 + "tk" + "\n" +
                                                                "4" + "  " + i4 + "  " + q4 + "  " + p4 + "tk" + "  " + t4 + "tk" + "\n" +
                                                                "5" + "  " + i5 + "  " + q5 + "  " + p5 + "tk" + "  " + t5 + "tk" + "\n" +
                                                                "6" + "  " + i6 + "  " + q6 + "  " + p6 + "tk" + "  " + t6 + "tk" + "\n" +
                                                                "total quantity:" + tq + "\n " +
                                                                "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n " +
                                                                "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + "\n " +
                                                                "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n" +
                                                                "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + "\n " +
                                                                "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk"
                                                );
                                            } else {
                                                r = ((e1 * r1) + (e2 * r2) + (e3 * r3) + (e4 * r4) + (e5 * r5) + (e6 * r6));
                                                double a = (r + (r / 100) * vv);
                                                double c = ((r + ((r / 100) * vv)) - ((r / 100) * dis1));
                                                afterVatTPriceFormattedTextField.setText(String.valueOf(a));
                                                afterDiscountTPriceFormattedTextField.setText(String.valueOf(c));
                                                billAmountFormattedTextField.setText(String.valueOf(c));

                                                billchart.setText(
                                                        "date:" + d + "/" + d2 + "/" + d1 + "   " +
                                                                
                                                                "Shop name:" + sn + " \n  " +
                                                                "Shop Address;" + sd + "\n" +
                                                                "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                                                "2" + "  " + i2 + "  " + q2 + "  " + p2 + "tk" + "  " + t2 + "tk" + "\n" +
                                                                "3" + "  " + i3 + "  " + q3 + "  " + p3 + "tk" + "  " + t3 + "tk" + "\n" +
                                                                "4" + "  " + i4 + "  " + q4 + "  " + p4 + "tk" + "  " + t4 + "tk" + "\n" +
                                                                "5" + "  " + i5 + "  " + q5 + "  " + p5 + "tk" + "  " + t5 + "tk" + "\n" +
                                                                "6" + "  " + i6 + "  " + q6 + "  " + p6 + "tk" + "  " + t6 + "tk" + "\n" +
                                                                "total quantity:" + tq + " \n " +
                                                                "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n  " +
                                                                "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + "\n " +
                                                                "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n " +
                                                                "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + " \n " +
                                                                "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk"
                                                );
                                            }

                                            if (e7 <= 0 || r7 <= 0 || i7.equals("blank")) {
                                                totalPriceFormattedTextField.setText(String.valueOf((e1 * r1) + (e2 * r2) + (e3 * r3) + (e4 * r4) + (e5 * r5) + (e6 * r6)));
                                            } else {
                                                totalpricebox7.setText(String.valueOf(e7 * r7));
                                                totalitembox.setText(String.valueOf(e1 + e2 + e3 + e4 + e5 + e6 + e7));
                                                totalPriceFormattedTextField.setText(String.valueOf((e1 * r1) + (e2 * r2) + (e3 * r3) + (e4 * r4) + (e5 * r5) + (e6 * r6) + (e7 * r7)));
                                                if (v1 == 0 && dis == 0) {
                                                    r = ((e1 * r1) + (e2 * r2) + (e3 * r3) + (e4 * r4) + (e5 * r5) + (e6 * r6) + (e7 * r7));
                                                    afterVatTPriceFormattedTextField.setText(String.valueOf(r));
                                                    afterDiscountTPriceFormattedTextField.setText(String.valueOf(r));
                                                    billAmountFormattedTextField.setText(String.valueOf(r));

                                                    billchart.setText(
                                                            "date:" + d + "/" + d2 + "/" + d1 + " \n  " +
                                                                    
                                                                    "Shop name:" + sn + " \n  " +
                                                                    "Shop Address;" + sd + "\n" +
                                                                    "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                                                    "2" + "  " + i2 + "  " + q2 + "  " + p2 + "tk" + "  " + t2 + "tk" + "\n" +
                                                                    "3" + "  " + i3 + "  " + q3 + "  " + p3 + "tk" + "  " + t3 + "tk" + "\n" +
                                                                    "4" + "  " + i4 + "  " + q4 + "  " + p4 + "tk" + "  " + t4 + "tk" + "\n" +
                                                                    "5" + "  " + i5 + "  " + q5 + "  " + p5 + "tk" + "  " + t5 + "tk" + "\n" +
                                                                    "6" + "  " + i6 + "  " + q6 + "  " + p6 + "tk" + "  " + t6 + "tk" + "\n" +
                                                                    "7" + "  " + i7 + "  " + q7 + "  " + p7 + "tk" + "  " + t7 + "tk" + "\n" +
                                                                    "total quantity:" + tq + "\n " +
                                                                    "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n " +
                                                                    "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + "\n " +
                                                                    "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n" +
                                                                    "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + "\n " +
                                                                    "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk"
                                                    );
                                                } else {
                                                    r = ((e1 * r1) + (e2 * r2) + (e3 * r3) + (e4 * r4) + (e5 * r5) + (e6 * r6) + (e7 * r7));
                                                    double a = (r + (r / 100) * vv);
                                                    double c = ((r + ((r / 100) * vv)) - ((r / 100) * dis1));
                                                    afterVatTPriceFormattedTextField.setText(String.valueOf(a));
                                                    afterDiscountTPriceFormattedTextField.setText(String.valueOf(c));
                                                    billAmountFormattedTextField.setText(String.valueOf(c));

                                                    billchart.setText(
                                                            "date:" + d + "/" + d2 + "/" + d1 + "   " +
                                                                    
                                                                    "Shop name:" + sn + " \n  " +
                                                                    "Shop Address;" + sd + "\n" +
                                                                    "1" + "  " + i1 + "  " + q1 + "  " + p1 + "tk" + "  " + t1 + "tk" + "\n" +
                                                                    "2" + "  " + i2 + "  " + q2 + "  " + p2 + "tk" + "  " + t2 + "tk" + "\n" +
                                                                    "3" + "  " + i3 + "  " + q3 + "  " + p3 + "tk" + "  " + t3 + "tk" + "\n" +
                                                                    "4" + "  " + i4 + "  " + q4 + "  " + p4 + "tk" + "  " + t4 + "tk" + "\n" +
                                                                    "5" + "  " + i5 + "  " + q5 + "  " + p5 + "tk" + "  " + t5 + "tk" + "\n" +
                                                                    "6" + "  " + i6 + "  " + q6 + "  " + p6 + "tk" + "  " + t6 + "tk" + "\n" +
                                                                    "7" + "  " + i7 + "  " + q7 + "  " + p7 + "tk" + "  " + t7 + "tk" + "\n" +
                                                                    "total quantity:" + tq + " \n " +
                                                                    "total price:" + totalPriceFormattedTextField.getValue() + "tk" + " \n  " +
                                                                    "Vat:" + vatComboBox.getSelectedItem().toString() + "%" + "\n " +
                                                                    "discount:" + discountComboBox.getSelectedItem().toString() + "%" + " \n " +
                                                                    "After VAT T.Price:" + afterVatTPriceFormattedTextField.getValue() + "tk" + " \n " +
                                                                    "After Discount T.Price:" + afterDiscountTPriceFormattedTextField.getValue() + "tk"
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

        clearTotalPriceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalpricebox1.setValue(0);
                totalpricebox2.setValue(0);
                totalpricebox3.setValue(0);
                totalpricebox4.setValue(0);
                totalpricebox5.setValue(0);
                totalpricebox6.setValue(0);
                totalpricebox7.setValue(0);
                totalpricebox1.setValue(0);
                quantitybox2.setValue(0);
                quantitybox3.setValue(0);
                quantitybox4.setValue(0);
                quantitybox5.setValue(0);
                quantitybox6.setValue(0);
                quantitybox7.setValue(0);
                pricebox2.setValue(0);
                pricebox3.setValue(0);
                pricebox4.setValue(0);
                pricebox5.setValue(0);
                pricebox6.setValue(0);
                pricebox7.setValue(0);
                billchart.setText(null);
                paidAmountMustFillFormattedTextField.setValue("");
                totalitembox.setText("");
                totalPriceFormattedTextField.setText("");
                afterVatTPriceFormattedTextField.setValue("");
                afterDiscountTPriceFormattedTextField.setValue("");
                changesFormattedTextField.setText("");
                getToolkit().beep();
            }
        });
        changesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String billamount = new String(billAmountFormattedTextField.getText());
                String pa = new String(paidAmountMustFillFormattedTextField.getText());
                double aft = Double.parseDouble(billamount);
                double pay = Double.parseDouble(pa);
                changesFormattedTextField.setValue(pay - aft);
                billchart.setText(billchart.getText() +
                        "\n" +
                        "Paid:" + pa + "tk" + "\n" +
                        "Changes:" + changesFormattedTextField.getText() + "tk"
                );
            }

        });
        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                login l = new login("");
                l.setVisible(true);
                getToolkit().beep();
            }
        });


        print.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                getToolkit().beep();
                int ln=1;
                try {
                    RandomAccessFile raf = new RandomAccessFile("Cloth store txt file\\Product Sold list\\Solditem detail.txt","rw");
                    for (int i=0;i<ln;i++){
                        raf.readLine();
                    }
                    raf.writeBytes("\r\n");
                    raf.writeBytes("\r\n");
                    raf.writeBytes(billchart.getText());
                }
                catch (Exception a) {
                    System.out.println(a);
                }
                JOptionPane.showMessageDialog(null, "saved successfully");
                String dataToPrint = "";
                try {
                    BufferedReader input = new BufferedReader(new FileReader("Cloth store txt file\\Bill Chart list\\BillChart.txt"));
                    String line = "";
                    while ((line = input.readLine()) != null) {
                        dataToPrint += line + "n";
                    }
                } catch (Exception a) {

                }
                PrinterJob printerJob = PrinterJob.getPrinterJob();
                Book read = new Book();
                printerJob.setPageable(read);

                try {
                    boolean complete = printerJob.printDialog();
                    if (complete) {
                        printerJob.print();
                    } else {
                    }
                } catch (PrinterException pe) {

                }
                productname1.setSelectedItem("Blank");
                productname2.setSelectedItem("Blank");
                productname3.setSelectedItem("Blank");
                productname4.setSelectedItem("Blank");
                productname5.setSelectedItem("Blank");
                productname6.setSelectedItem("Blank");
                productname7.setSelectedItem("Blank");

                quantitybox1.setValue(0);
                quantitybox2.setValue(0);
                quantitybox3.setValue(0);
                quantitybox4.setValue(0);
                quantitybox5.setValue(0);
                quantitybox6.setValue(0);
                quantitybox7.setValue(0);

                pricebox1.setValue(0);
                pricebox2.setValue(0);
                pricebox3.setValue(0);
                pricebox4.setValue(0);
                pricebox5.setValue(0);
                pricebox6.setValue(0);
                pricebox7.setValue(0);

                vatComboBox.setSelectedItem(0);
                discountComboBox.setSelectedItem(0);

                totalpricebox1.setValue(0);
                totalpricebox2.setValue(0);
                totalpricebox3.setValue(0);
                totalpricebox4.setValue(0);
                totalpricebox5.setValue(0);
                totalpricebox6.setValue(0);
                totalpricebox7.setValue(0);

                totalitembox.setValue(0);
                totalPriceFormattedTextField.setValue(null);
                afterVatTPriceFormattedTextField.setValue(null);
                afterDiscountTPriceFormattedTextField.setValue(null);
                paidAmountMustFillFormattedTextField.setValue(null);
                changesFormattedTextField.setValue(null);
                billchart.setText(null);
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
        pricebox1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                pricebox1.setValue("");
            }
        });
        pricebox2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                pricebox2.setValue("");
            }
        });
        pricebox3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                pricebox3.setValue("");
            }
        });
        pricebox4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);  
                pricebox4.setValue("");
            }
        });
        pricebox5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                pricebox5.setValue("");
            }
        });
        pricebox6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                pricebox6.setValue("");
            }
        });
        pricebox7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                pricebox7.setValue("");
            }
        });
        
    }
    public static void main(String[] args) {
        JFrame frame = new BillChart("");
        frame.setVisible(true);
    }
}

   