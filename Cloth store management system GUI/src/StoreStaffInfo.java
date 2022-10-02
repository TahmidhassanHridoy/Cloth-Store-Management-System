import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class StoreStaffInfo extends JFrame {
    private JPanel mainpanel;
    private JTextField NAMETextField;
    private JTextField paddress;
    private JTextField phoneTextField;
    private JTextField salaryTextField;
    private JButton saveButton;
    private JTextArea SavedInformation;
    private JComboBox joinmonth;
    private JComboBox joinyear;
    private JComboBox joinDate;
    private JLabel display;
    private JLabel exit;
    private JComboBox divisition;
    private JComboBox district;
    private JComboBox upazila;
    private JComboBox Birthdate;
    private JComboBox postcode;
    private JComboBox birthmonth;
    private JComboBox birthyear;
    private JTextField a088TextField;
    private JTextField houseNoRoadNoTextField;
    private JTextField cityPostCodeTextField;
    private JTextField postOfficeNameTextField;
    private JTextField mailidTextField;
    private JTextField designationTextField;
    private JTextField voterIDTextField;
    private JComboBox genderComboBox;
    
    

    protected StoreStaffInfo(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainpanel);
        this.pack();
        setBounds(250, 20, 820, 680);
        Image iconc = Toolkit.getDefaultToolkit().getImage("png\\Staffinfostore.png");
        setIconImage(iconc);

        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("img\\photo-3.jpg"));
        add(background);
        background.setLayout(new FlowLayout());

        ImageIcon r4 = new ImageIcon("png\\save.png");
        saveButton.setIcon(r4);
        saveButton.getIcon();
        ImageIcon r3 = new ImageIcon("png\\exit.png");
        exit.setIcon(r3);
        exit.getIcon();
        ImageIcon r2 = new ImageIcon("png\\display.png");
        display.setIcon(r2);
        display.getIcon();
        
        SavedInformation.setEditable(false);
        
        saveButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                String c1 = joinDate.getSelectedItem().toString();
                String c2 = joinmonth.getSelectedItem().toString();
                String c3 = joinyear.getSelectedItem().toString();
                String date = Birthdate.getSelectedItem().toString();
                String month = birthmonth.getSelectedItem().toString();
                String year = birthyear.getSelectedItem().toString();
                String n = new String(NAMETextField.getText());
                String pad = new String(houseNoRoadNoTextField.getText());
                String phn1 = new String(phoneTextField.getText());
                String phn2 = new String(a088TextField.getText());
                String desgation = new String(designationTextField.getText());
                String voterid = new String(voterIDTextField.getText());
                String parmanentadd = new String(paddress.getText());
                String divi = divisition.getSelectedItem().toString();
                String dist = district.getSelectedItem().toString();
                String upzila = upazila.getSelectedItem().toString();
                String pcode = postcode.getSelectedItem().toString();
                String city = new String(cityPostCodeTextField.getText());
                String postoffice = new String(postOfficeNameTextField.getText());
                String sl = new String(salaryTextField.getText());
                String mail = new String(mailidTextField.getText());
                String gender = genderComboBox.getSelectedItem().toString();
                
                SavedInformation.setText(
                        "Name: " + n + "\n" +
                                "Designation:"+desgation+"\n"+
                                "Voter id:"+voterid+"\n"+
                                "Parmanent Address: " + parmanentadd + "\n" +
                                "Divisition:"+divi+"\n"+
                                "District:"+dist+"\n"+
                                "upazila:"+upzila+"\n"+
                                "Post code:"+pcode+"\n"+
                                "present Address:"+pad+"\n"+
                                "City and Post code:"+city+"\n"+
                                "Post office name:"+postoffice+"\n"+
                                " Phone1 :  " + phn1 + "\n" +
                                " Phone2 :  " + phn2 + "\n" +
                                "MAIL id:"+mail+"\n"+
                                "Salary: " + sl + "\n" +
                                "DATE OF BIRTH" + date + "/" + month + "/" + year + "\n" +
                                "JOIN Date:  " + c1 + " / " + c2 + " / " + c3  + "\n" +
                                "Gender:  " + gender
                );
                File file = new File("Cloth store txt file\\Staff information list\\StaffInformation.txt");
                int ln = 100;
                try {
                    RandomAccessFile raf=new RandomAccessFile("Cloth store txt file\\Staff information list\\StaffInformation.txt","rw");
                    for (int i=0;i<ln;i++){
                        raf.readLine();
                    }
                    raf.writeBytes("\r\n");
                    raf.writeBytes("\r\n");
                    raf.writeBytes("Name: " + n +"\r\n");
                    raf.writeBytes( "Designation:"+desgation+"\r\n");
                    raf.writeBytes( "Voter id:"+voterid+"\r\n");
                    raf.writeBytes("Parmanent Address: " + parmanentadd +"\r\n");
                    raf.writeBytes("Divisition:"+divi+"\r\n");
                    raf.writeBytes("District:"+dist+"\r\n");
                    raf.writeBytes( "upazila:"+upzila+"\r\n");
                    raf.writeBytes("Post code:"+pcode+"\r\n");
                    raf.writeBytes( "present Address:"+pad+"\r\n");
                    raf.writeBytes(  "City and Post code:"+city+"\r\n");
                    raf.writeBytes( "Post office name:"+postoffice+"\r\n");
                    raf.writeBytes(" Phone1 :  " + phn1 +"\r\n");
                    raf.writeBytes(" Phone2 :  " + phn2 +"\r\n");
                    raf.writeBytes("MAIL id:"+mail+"\r\n");
                    raf.writeBytes("Salary: " + sl +"\r\n");
                    raf.writeBytes( "DATE OF BIRTH" + date + "/" + month + "/" + year +"\r\n");
                    raf.writeBytes("JOIN Date:  " + c1 + " / " + c2 + " / " + c3 + "\r\n");
                    raf.writeBytes("Gender:  " + gender+"\r\n");
                    JOptionPane.showMessageDialog(null, "Successfully saved " );


                } catch (FileNotFoundException ex) {
                    System.out.println(ex);
                } catch (IOException ex) {
                    System.out.println(ex);
                }
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
        
      
    }


    public static void main(String[] args) {
        JFrame frame = new StoreStaffInfo("");
        frame.setVisible(true);
    }
}

   


