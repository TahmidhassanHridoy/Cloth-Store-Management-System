import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.ImageIcon;



public class login extends JFrame {
    private JTextField UsernametextField1;
    private JPasswordField passwordField1;
    private JButton logInButton;
    private JButton billChartButton;
    private JButton resetPasswordButton;
    private JPanel mainpanel;
    private JLabel icon1;
    private JLabel icon2;
    private JLabel home;
    private JLabel label;
    
    public login(String title){
        super (title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainpanel);
        this.pack();
        setBounds(500,100,420,550);
        Image iconc = Toolkit.getDefaultToolkit().getImage("png\\aguntok.png");
        setIconImage(iconc);
        
        setLayout(new BorderLayout());       
        JLabel background=new JLabel(new ImageIcon("img\\photo-3.jpg"));
        add(background);
        background.setLayout(new GridLayout());
        
        
        ImageIcon icon = new ImageIcon("png\\password2.png");  
        icon2.setIcon(icon);
        icon2.getIcon();
        ImageIcon ic = new ImageIcon("png\\Admin2.png");
        icon1.setIcon(ic);
        icon1.getIcon();
        ImageIcon bl = new ImageIcon("png\\bill.png");
        billChartButton.setIcon(bl);
        billChartButton.getIcon();
        ImageIcon h = new ImageIcon("png\\aguntok.png");
        home.setIcon(h);
        home.getIcon();
        ImageIcon ll = new ImageIcon("");
        logInButton.setIcon(ll);
        logInButton.getIcon();
        ImageIcon r = new ImageIcon("");
        resetPasswordButton.setIcon(r);
        resetPasswordButton.getIcon();
        
      
        logInButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String usen = new String(UsernametextField1.getText());
                int length = usen.length();
                String pass = new String(passwordField1.getPassword());
                int len = pass.length();
                if (len > 6 || length > 6 || len < 2|| length < 2) {
                    label.setText("Invalid Username / Password");
                    UsernametextField1.setText(null);
                    passwordField1.setText(null);

                } else {
                    if (pass.isBlank() || pass.isEmpty()) {
                        label.setText("Input Username / Password");
                        UsernametextField1.setText(null);
                        passwordField1.setText(null);
                    } else {

                            if (usen.equals("tahmid") && pass.equals("1997") ) {
                                label.setText("you are logined");
                                Mainmenu main = new Mainmenu("MAINMENU");
                                main.setVisible(true);
                                dispose();
                                getToolkit().beep();
                            } else {
                                label.setText("incorrect username or password");
                                UsernametextField1.setText(null);
                                passwordField1.setText(null);
                                getToolkit().beep();
                            }

                        }
                    }
                }

        });
        resetPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ForgotPassword f = new ForgotPassword("Reset Password");
                f.setVisible(true);
                dispose();
            }
        });
        billChartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BillChart b =new BillChart("BILL CHART");
                b.setVisible(true);
                getToolkit().beep();
                dispose();
            }
        });
        UsernametextField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                UsernametextField1.setText(null);
            }
        });
        passwordField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                passwordField1.setText(null); 
            }
        });
    }


    public static void main(String[] args){
        login l = new login("LOGIN");
        l.setVisible(true);
    }

}
        
        
    
