import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;


public class ForgotPassword extends JFrame{
    private JPanel mainpanel;
    private JButton saveButton;
    private JPasswordField adminPasswordPasswordField;
    private JPasswordField newPasswordPasswordField;
    private JPasswordField confirmPasswordPasswordField;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel exit;
    private JLabel label;

    public ForgotPassword(String title) {
        super (title);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setContentPane(mainpanel);
        this.pack();

        setBounds(450,150,350,300);

        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("img\\photo-3.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
        Image icon = Toolkit.getDefaultToolkit().getImage("png\\reset.png");
        setIconImage(icon);

        ImageIcon r = new ImageIcon("png\\Admin.png");
        l1.setIcon(r);
        l1.getIcon();
        ImageIcon l = new ImageIcon("png\\exit.png");
        exit.setIcon(l);
        exit.getIcon();
        ImageIcon r1 = new ImageIcon("png\\password23.png");
        l2.setIcon(r1);
        l2.getIcon();
        ImageIcon r2 = new ImageIcon("png\\password23.png");
        l3.setIcon(r2);
        l3.getIcon();
        ImageIcon r3 = new ImageIcon("png\\save.png");
        saveButton.setIcon(r3);
        saveButton.getIcon();
        



        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ap = new String(adminPasswordPasswordField.getPassword());
                String np = new String(newPasswordPasswordField.getPassword());
                String cp = new String(confirmPasswordPasswordField.getPassword());
                int length = cp.length();
                if (ap.isEmpty() || np.isEmpty() || cp.isBlank()) {
                    label.setText("Fillup the Fields");
                } else {
                    if (ap.equals("tahmid1997")) {
                        if (length > 3) {
                            if (length < 10) {
                                if (np.equals(cp)) {
                                  if (ap.equals("tahmid1997")&&length > 3&&length < 10 &&np.equals(cp)) {
                                      try {
                                          FileWriter fw = new FileWriter("Cloth store txt file\\password.txt");
                                          fw.write(confirmPasswordPasswordField.getPassword());
                                          fw.close();
                                          login l = new login("");
                                          l.setVisible(true);
                                          dispose();
                                      } catch (Exception a) {
                                          System.out.println(a);
                                      }
                                      JOptionPane.showMessageDialog(null, "password Reset");
                                  }else{
                                      label.setText("Incorrect");
                                  }
                                } else {
                                    label.setText("new password & confirm password not same");
                                }
                            } else {
                                label.setText("less than 10 character");
                            }
                        } else {
                            label.setText("Atleast 4 character");
                        }
                    } else {
                        label.setText("Invalid Admin password");
                    }
                }
            }
                        
        });


        exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                login l = new login("");
                l.setVisible(true);
                dispose();
            }
        });
    }
        
        public static void main(String[] args){
        ForgotPassword f = new ForgotPassword("Reset Password");
        f.setVisible(true);
        }
}
