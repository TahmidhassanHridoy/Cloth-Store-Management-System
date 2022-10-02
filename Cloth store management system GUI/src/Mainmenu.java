import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mainmenu extends JFrame {
    private JPanel mainpanel;
    private JButton staff;
    private JButton ABOUTButton;
    private JButton productdetail;
    private JButton productsold;
    private JButton showinfo;
    private JButton profitloss;
    private JButton utilitybill;
    private JLabel homepage;
    private JLabel exit;


    public Mainmenu(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainpanel);
        this.pack();
        setBounds(500,60,420,600);
        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("img\\photo-3.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
        Image iconc = Toolkit.getDefaultToolkit().getImage("png\\main-menu.png");
        setIconImage(iconc);
        ImageIcon r1 = new ImageIcon("png\\exit.png");
        exit.setIcon(r1);
        exit.getIcon();
        ImageIcon r2 = new ImageIcon("png\\Staffinfostore.png");
        staff.setIcon(r2);
        staff.getIcon();
        ImageIcon r3 = new ImageIcon("png\\Productlist.png");
        productdetail.setIcon(r3);
        productdetail.getIcon();
        ImageIcon r4 = new ImageIcon("png\\sold.png");
        productsold.setIcon(r4);
        productsold.getIcon();
        ImageIcon r5 = new ImageIcon("png\\profit.png");
        profitloss.setIcon(r5);
        profitloss.getIcon();
        ImageIcon r6 = new ImageIcon("png\\showinfo.png");
        showinfo.setIcon(r6);
        showinfo.getIcon();
        ImageIcon r7 = new ImageIcon("png\\Utilitybill.png");
        utilitybill.setIcon(r7);
        utilitybill.getIcon();
        ImageIcon r8 = new ImageIcon("png\\homepag.png");
        homepage.setIcon(r8);
        homepage.getIcon();
        ImageIcon r9 = new ImageIcon("png\\about.png");
        ABOUTButton.setIcon(r9);
        ABOUTButton.getIcon();


        staff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StoreStaffInfo sf = new StoreStaffInfo("Store detail(SATFF)");
                sf.setVisible(true);
                dispose();
            }
        });
        productdetail.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             ProductDetail p = new ProductDetail("PRODUCT DETAIL");
             p.setVisible(true);
             dispose();
            }
        });
        productsold.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProductSold ps = new ProductSold("Product sold");
                ps.setVisible(true);
                dispose();
            }
        });
        showinfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowInformation si = new ShowInformation("DISPLAY");
                si.setVisible(true);
                dispose();
            }
        });
        profitloss.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ProfitLoss pr = new ProfitLoss("CALCULATION");
                pr.setVisible(true);
                dispose();
            }
        });
        utilitybill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UtilityBills ub = new UtilityBills("UTILITY BILL");
                ub.setVisible(true);
                dispose();
            }
        });
        ABOUTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                About a = new About("ABOUT");
                a.setVisible(true);
                dispose();
            }
        });

        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                login g = new login("Login");
                g.setVisible(true);
                getToolkit().beep();
                dispose();
            }
        });
    }


    public static void main (String[] args){
        Mainmenu main = new Mainmenu("MainMenu");
        main.setVisible(true);
        
    }
}

