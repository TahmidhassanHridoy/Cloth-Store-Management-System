import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame{
    private JPanel mainpanel;
    private JButton EXITButton;

    public About(String title){          //this is constructor//
        super(title);
        this.setContentPane(mainpanel);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.pack();

        setBounds(400,150,650,450);        //this is for the mainpanel size//

        setLayout(new BorderLayout());                     //this is for background image//
        JLabel background=new JLabel(new ImageIcon("img\\photo-6.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
        Image icon = Toolkit.getDefaultToolkit().getImage("png\\about.png"); //this for the icon the Frame//
        setIconImage(icon);
        ImageIcon r = new ImageIcon("png\\exit.png");
        EXITButton.setIcon(r);
        EXITButton.getIcon();
        
        
        EXITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mainmenu m =new Mainmenu("");
                m.setVisible(true);
                dispose();
                
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new About("");
        frame.setVisible(true);
    }
}
